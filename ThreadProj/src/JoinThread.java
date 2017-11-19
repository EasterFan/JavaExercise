/**
 * 阻塞进程----抢占执行join
 */


class MyJoinThread extends Thread{

    @Override
    public void run() {
        for(int i=0;i<500;i++){
            System.out.println(getName()+"正在执行第"+i+"次");
        }
    }
}


public class JoinThread {
    public static void main(String[] args) {
        MyJoinThread t1 = new MyJoinThread();
        t1.start();

        // 子进程抢占执行，子进程执行结束后，才可以执行主进程
        try {
//            t1.join();
            // 子进程最多执行10ms
            t1.join(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i=0;i<20;i++){
            System.out.println("主进程执行第"+i+"次");
        }
        System.out.println("主线程运行结束！");
    }
}


