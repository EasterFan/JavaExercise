/**
 * 死锁演示 -- 同步中套同步 - A 锁要 B 锁， B 锁要 A 锁
 */

class TicketWindows implements Runnable{

    private int TotalTickets = 1000;
    boolean flag = true;
    private static Object obj = new Object();

    @Override
    public void run() {
        if(flag){
            while (true){
                synchronized (obj){
                    // obj 锁中要 sale 的 this 锁
                    if(TotalTickets>0) {
                        sale();
                    }else {
                        break;
                    }
                }
            }
        }else {
            while (true){
                if(TotalTickets>0){
                    sale();
                }else {
                    break;
                }
            }
        }
    }

    private synchronized void sale() {
        // sale 中要 obj 锁
        synchronized (obj) {
            System.out.println("sale" + Thread.currentThread().getName() + "在售票" + TotalTickets--);
        }
    }
}

public class DeadLock {
    public static void main(String[] args) {
        TicketWindows ticketWindows = new TicketWindows();
        Thread t1 = new Thread(ticketWindows);
        Thread t2 = new Thread(ticketWindows);

        t1.start();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ticketWindows.flag = false;
        t2.start();
    }
}
