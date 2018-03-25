package ThreadLifeCycle;


class ThreadLife implements Runnable{

    private  boolean flag = true;

    // 要加同步,否则出现 IllegalMonitorStateException ==> 当某个线程试图等待一个自己并不拥有的对象 %_%
    @Override
    public synchronized void run() {
        while (flag){
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + "...waitException");
            }

            System.out.println(Thread.currentThread().getName()+"....run");
        }
    }

    public void getFlag(){
        flag = false;
    }
}

/**
 * 守护进程 -- 主线程执行完毕后，如果所有的线程都是守护线程，JVM 退出
 */
public class ThreadSetDeamon {
    public static void main(String[] args) {
        ThreadLife threadLife = new ThreadLife();

        Thread t1 = new Thread(threadLife);
        Thread t2 = new Thread(threadLife);

        // 启动前将线程设置为守护线程
        t1.setDaemon(true);
        t2.setDaemon(true);

        t1.start();
        t2.start();

        int num = 0;
        while (true){
            if(num++ == 100){
              threadLife.getFlag();
              break;
            }
            System.out.println(Thread.currentThread().getName()+"....main" + num);
        }
    }
}
