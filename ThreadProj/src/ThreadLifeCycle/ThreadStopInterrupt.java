package ThreadLifeCycle;


/**
 * 结束线程 - 当 run 是同步函数时
 */


class StopThread1 implements Runnable{

    private boolean flag = true;

    // 当 run 是同步函数时
    @Override
    public synchronized void run() {

        while (flag) {
            try {
                // 两个线程都在这里卡住
                wait();
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + ".....Exception");
                // 线程被强制唤醒后，interrupt 后要进行处理
                changeFlag();
            }

            System.out.println(Thread.currentThread().getName() + ".....run");
        }
    }

    public void changeFlag(){
        flag = false;
    }
}

/**
 * 当两个线程都处于阻塞状态时，用中断线程 interrupt 方法让线程恢复到 运行状态 -- 获取运行资格
 */
public class ThreadStopInterrupt {
    public static void main(String[] args) {
        StopThread1 thread1 = new StopThread1();

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread1);

        t1.start();
        t2.start();

        int num = 0;
        while (true){
            if(num++ == 100){
//                thread1.changeFlag();
                // 强制让线程恢复到运行状态中来
                t1.interrupt();
                t2.interrupt();
                break;
            }
            System.out.println(Thread.currentThread().getName()+"......main");
        }
    }
}
