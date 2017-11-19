/**
 * 实现Runnable接口创建两个线程，这两个线程Runnable实现类的共享成员变量
 */



class ShareRunnable implements Runnable{

    // 被共享的成员变量
    int i = 0;

    @Override
    public void run() {

        while (i<5) {
            System.out.println(Thread.currentThread().getName() + "正在运行"+(i++));
            // i++与++i的区别在这里显现
        }
    }
}


public class MultiThreadShareTest {
    public static void main(String[] args) {
        ShareRunnable sr = new ShareRunnable();

        Thread t1 = new Thread(sr);
        Thread t2 = new Thread(sr);

        t1.start();
        t2.start();


    }
}
