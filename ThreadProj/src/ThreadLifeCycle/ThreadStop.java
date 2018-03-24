package ThreadLifeCycle;

class StopThread implements Runnable{
    private boolean flag = true;

    @Override
    public void run() {
        while(flag){
            System.out.println(Thread.currentThread().getName()+"正在运行");
        }
    }

    public void changeFlag(){
        flag = false;
        System.out.println(Thread.currentThread().getName()+"改变flag");
    }
}

/**
 * 停止线程 -- stop 方法已经过时
 * 通过结束 run 方法中的循环结束线程
 * 弊端： 如果 run 方法是一个同步函数，就不会读取到 while 标记，线程仍然不能结束
 */

public class ThreadStop {
    public static void main(String[] args) {
        StopThread st = new StopThread();

        // 开启线程

        new Thread(st).start();
        new Thread(st).start();

        int num = 0;
        while (true){
            if(num ++ == 100) {
                st.changeFlag();
                break;
            }
            System.out.println(Thread.currentThread().getName()+"......"+num);
        }
    }
}
