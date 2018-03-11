/**
 * 静态同步函数的锁是 Class 对象
 */

class TicketWindow implements Runnable{
    private static int totalTicket = 1000;
    boolean flag = true;

    @Override
    public void run() {
        if(flag){
            while (true) {
                synchronized (TicketWindow.class) {
                        if (totalTicket > 0) {
                            System.out.println("block..." + Thread.currentThread().getName() + "在售票" + totalTicket--);
                        } else {
                            break;
                        }
                }
            }

        }else {
            while (true) {
                sale();
                if(totalTicket == 0) break;
            }
        }

    }

    private static synchronized void sale(){
        if(totalTicket>0) System.out.println("sale..." + Thread.currentThread().getName()+"在售票"+totalTicket--);
    }
}

public class StaticSynchronizedFunction {
    public static void main(String[] args) {
        TicketWindow window = new TicketWindow();
        Thread t1 = new Thread(window);
        Thread t2 = new Thread(window);

        t1.start();
        // 主线程休眠 t1 启动
        try{Thread.sleep(10);}catch (Exception e){e.printStackTrace();}

        window.flag = false;
        t2.start();
    }
}
