/**
 * 创建线程---通过Thread类
 */

// 自定义一个线程类
class MyThread extends Thread{

    // 构造方法，调用父类的名字
    public MyThread(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0;i<10;i++){
            System.out.println(getName()+"正在运行"+i);
        }
    }
}


public class ThreadTest {
    public static void main(String[] args) {

        System.out.println("主线程1");
        MyThread myThread1 = new MyThread("子线程1");
        MyThread myThread2 = new MyThread("子线程2");

        // 启动线程==通过调用MyThread的run方法
        myThread1.start();
        // 一个线程只能被启动一次，故新建两个子进程
        myThread2.start();


        System.out.println("主线程2");
    }
}
