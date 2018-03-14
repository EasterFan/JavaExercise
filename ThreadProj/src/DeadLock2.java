/**
 * 死锁演示2 -- 锁中套锁
 */

class TestLock implements Runnable{

    private boolean flag;

    TestLock(boolean flag){
        this.flag = flag;
    }

    @Override
    public void run() {
        if(flag){
            // A 中 锁 B
            synchronized (Lock.locka){
                System.out.println("if locka");

                synchronized (Lock.lockb){
                    System.out.println("if lockb");
                }
            }
        }else {
            // B 中锁 A
            synchronized (Lock.lockb){
                System.out.println("else lockb");

                synchronized (Lock.locka){
                    System.out.println("else locka");
                }
            }
        }
    }
}

/**
 * 只用来装两个锁的工具类，方便调用
 */
class Lock{
    static Object locka = new Object();
    static Object lockb = new Object();
}


public class DeadLock2 {
    public static void main(String[] args) {
        TestLock testLock1 = new TestLock(true);
        TestLock testLock2 = new TestLock(false);

        Thread t1 = new Thread(testLock1);
        Thread t2 = new Thread(testLock2);

        t1.start();
        t2.start();
    }
}
