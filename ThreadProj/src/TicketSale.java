/**
 * 多线程 -- 多个售票窗口 - 多对象共享一个类变量
 */

class Ticket extends Thread{
    // 卖 100 张票
    static private int ticket = 100;
    private String saleName;

    public Ticket(String name){
        this.saleName = name;
    }

    @Override
    public void run() {
        while (true){
            if(ticket > 0){
                System.out.println(this.saleName+"在售票"+ticket--);
            }else {
                break;
            }
        }
    }
}

public class TicketSale {
    public static void main(String[] args) {
        // 四个售票口
        Ticket t1 = new Ticket("windows1");
        Ticket t2 = new Ticket("windows2");
        Ticket t3 = new Ticket("windows3");
        Ticket t4 = new Ticket("windows4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
