/**
 * 实现Runnable接口创建线程类
 */


class PrintRunnable implements Runnable{
    @Override
    public void run() {
        int i = 0;
        while (i<5) {
            // 只能调用Thread类的静态方法
            System.out.println(Thread.currentThread().getName() + "正在运行"+(i++));
            // i++与++i的区别在这里显现
        }
    }
}

public class RunnableTest {
    public static void main(String[] args) {
        // 启动线程三步
        // 1.新建自定义线程类对象
        PrintRunnable printRunnable1 = new PrintRunnable();
        PrintRunnable printRunnable2 = new PrintRunnable();

        // 2.将自定义线程类对象作为参数，新建Tread线程对象
        Thread thread1 = new Thread(printRunnable1);
        Thread thread2 = new Thread(printRunnable2);

        // 3.通过Thread类的start方法启动线程
        thread1.start();
        thread2.start();
    }
}
