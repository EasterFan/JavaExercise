package ThreadCommunicate3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


class People{
    private String name;
    private String sex;
    private boolean flag = false;

    // 新建一个锁
    private Lock lock = new ReentrantLock();

    // wait，notify等方法都封装在 Condition 对象中，要通过 Lock 获取 Condition 对象
    // 新建两个锁
    private Condition condition_producer = lock.newCondition();
    private Condition condition_customer = lock.newCondition();

    // 去掉 synchronized
    public void peopleIn(String name, String sex) throws InterruptedException {
        // 第一步：线程进来后，就上锁
        lock.lock();

        try{
            // 如果 Room 中已有人， 生产者等待
            while (flag) {
                condition_producer.await();
            }
            this.name = name;
            this.sex = sex;
            System.out.println(Thread.currentThread().getName() + "....PeopleIn:"+name + "......." + sex);
            flag = true;

            // 唤醒消费者
            condition_customer.signal();
        }finally {
            lock.unlock();
        }
    }

    // 输出人员信息 -- 与 set 方法线程同步
    public  void peopleOut() throws InterruptedException {
        lock.lock();
        try{
            while (!flag){
                condition_customer.await();
            }
            System.out.println(Thread.currentThread().getName() + "PeopleOut:"+name + "......." + sex);
            flag = false;

            // 唤醒所有生产者线程
            condition_producer.signal();

        }finally {
            lock.unlock();
        }
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
                try {
                    people.peopleIn("Tom"+x,"man");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                try {
                    people.peopleIn("杰瑞"+x,"女女女");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
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
            try {
                people.peopleOut();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


/**
 * JDK 1.5 多线程加锁升级解决方案
 * lock + condition.signalAll() 代替 synchroniised + Object.notifyAll() 的写法
 *
 * 唤醒的仍然是所有线程
 * lock + while + signalAll()
 */
public class ThreadWithLockWithoutSynchronized {
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

