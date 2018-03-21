package ThreadCommunicate2;

/**
 * 线程通信 -- 有多个生产者和多个消费者
 */

class People{
    private String name;
    private String sex;
    private boolean flag = false;

    // 录入人员信息 - 存在线程安全(只录入姓名，性别未输入，被打断)
    public synchronized void peopleIn(String name, String sex){
        // 如果 Room 中已有人， 停止录入
        while (flag) {
            try {this.wait();} catch (InterruptedException e) {e.printStackTrace();} // 很有可能线程在这一步阻塞了
        }
        this.name = name;
        this.sex = sex;
        System.out.println(Thread.currentThread().getName() + "....PeopleIn:"+name + "......." + sex);
        flag = true;
        // 唤醒线程
        this.notifyAll();
    }

    // 输出人员信息 -- 与 set 方法线程同步
    public synchronized void peopleOut(){
        while (!flag){
            try {this.wait();} catch (InterruptedException e) {e.printStackTrace();}
        }
        System.out.println(Thread.currentThread().getName() + "PeopleOut:"+name + "......." + sex);
        flag = false;

        this.notifyAll();
    }
}

// 录入信息 -- 循环录入tom和jerry
class RoomIn implements Runnable{

    private People people;
    RoomIn(People people){
        this.people = people;
    }

    @Override
    public void run() {
        int x = 1;
       while (true){
            if(x % 2 == 0){
                people.peopleIn("Tom"+x,"man");
            }else {
                people.peopleIn("杰瑞"+x,"女女女");
            }
            x++;
        }
    }
}


// 输出信息
class RoomOut implements Runnable{

    private People people;
    RoomOut(People people){
        this.people = people;
    }

    @Override
    public void run() {
        while (true){
            people.peopleOut();
        }
    }
}

/**
 * 多个生产者，多个消费者
 * 必须用 while + notifyAll
 * 否则会出现，生产一个，消费两个的情况  或者 生产两个，消费一个的情况
 */
public class ThreadManyCustom {
    public static void main(String[] args) {
        // 1. 新建共享资源 -- 锁
        People people = new People();

        RoomIn in = new RoomIn(people);
        RoomOut out = new RoomOut(people);

        // 多个生产者 + 多个消费者
        Thread t1 = new Thread(in);
        Thread t2 = new Thread(in);

        Thread t3 = new Thread(out);
        Thread t4 = new Thread(out);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
