/**
 * 阻塞线程--sleep()
 * 线程执行速度过快，让线程休眠1000ms再去执行
 */

class MySleepThread implements Runnable{

    @Override
    public void run() {
        for (int i=1;i<=15;i++){
            System.out.println(Thread.currentThread().getName()+"执行第"+i+"次");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class SleepThread {
    public static void main(String[] args) {

        MySleepThread mySleepThread = new MySleepThread();
        Thread t1 = new Thread(mySleepThread);
        Thread t2 = new Thread(mySleepThread);
        t1.start();
        t2.start();
    }
}
