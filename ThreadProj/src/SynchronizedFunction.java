/**
 * 两个同步方法(同步代码块 + 同步函数)应使用同一个锁(this)来保证线程安全
 */

class SaleTicketWindow implements Runnable{
    private int totalTickets = 100;
    boolean flag = true;

    public SaleTicketWindow(){
    }

    @Override
    public void run() {

        if(flag) {
            while (true) {
                    // 同步代码块
                    synchronized (this) {
                        if (totalTickets > 0) {
                            System.out.println("block..."+Thread.currentThread().getName() + "在售票" + totalTickets--);
                        } else {
                            break;
                        }
                    }
                }
            }else {
                while (true) {
                    sale();
                    if(totalTickets==0) break;
               }
            }
        }

    // 同步函数
    synchronized void sale(){
        if (totalTickets > 0){
            System.out.println("sale..."+Thread.currentThread().getName()+"在售票"+totalTickets--);
        }
    }
}


/**
 * 两个窗口同时卖100张票, 且两个窗口各自运行在两个同步方法中
 *
 */

public class SynchronizedFunction {
    public static void main(String[] args) {

        // 两个方法锁住的对象 : stw1
        SaleTicketWindow stw1 = new SaleTicketWindow();

        Thread t1 = new Thread(stw1);
        Thread t2 = new Thread(stw1);

        // 在同步代码块中运行
        t1.start();

        // 让主线程休眠,让 t1 得到 cpu 使用权,开始运行
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        stw1.flag = false;

        // 在同步函数中运行
        t2.start();
    }
}
