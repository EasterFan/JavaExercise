package ThreadCommunicate;

/**
 * 线程通信（存在死锁问题）
 */

class People{
    private String name;
    private String sex;
    private boolean flag = false;  // 判断房间内是否有人

    // 录入人员信息 - 存在线程安全(只录入姓名，性别未输入，被打断)
    public synchronized void set(String name,String sex){
        // 如果 Room 中已有人， 停止录入
        if(flag) {
            try {this.wait();} catch (InterruptedException e) {e.printStackTrace();}
        }
        this.name = name;
        this.sex = sex;
        System.out.println("input ok");
        flag = true;
        // 唤醒线程
        this.notify();
    }

    // 输出人员信息 -- 与 set 方法线程同步
    public synchronized void peopleOut(){
        if(!flag){
            try {this.wait();} catch (InterruptedException e) {e.printStackTrace();}
        }else {
            System.out.println(name + "......." + sex);
            flag = false;
        }
        this.notify();
    }

    public void getFlag(){
        System.out.println(flag);
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
        int x ;
        for(x=0;x<100;x++){
            if(x == 0){
                people.set("Tom","man");
                people.getFlag();
            }else {
                people.set("jerry","woman");
            }
            x = x%2;
            System.out.println("x="+x);
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
        people.peopleOut();
        people.getFlag();
    }
}

public class PublicSareTest2 {
    public static void main(String[] args) {
        //锁
        People people = new People();

        // 开启线程 -- 同时开始 -- 达到录入输出交替进行
        new Thread(new RoomIn(people)).start();
        new Thread(new RoomOut(people)).start();
    }
}
