/**
 * 线程的优先级
 */

class MyPriorityTread extends Thread{

    private String name;

    public MyPriorityTread(String name){
        this.name = name;
    }

    @Override
    public void run() {
        for (int i=1;i<=10;i++){
            System.out.println("线程"+name+"正在运行"+i);
        }
    }
}

public class PriorityThread {
    public static void main(String[] args) {
        // 获取主线程的优先级
//        int mainPriority = Thread.currentThread().getPriority();
//        System.out.println("主线程的优先级"+mainPriority);

        MyPriorityTread myPriorityTread1 = new MyPriorityTread("子线程1");
        MyPriorityTread myPriorityTread2 = new MyPriorityTread("子线程2");

//        myPriorityTread2.setPriority(10);
//        int sonPriority = myPriorityTread1.getPriority();

//        System.out.println("线程1的优先级："+sonPriority);

        myPriorityTread1.setPriority(Thread.MAX_PRIORITY);
        myPriorityTread2.setPriority(Thread.MIN_PRIORITY);

        // 少量循环下，优先级的影响力 < 启动顺序
        myPriorityTread2.start();
        myPriorityTread1.start();

    }
}
