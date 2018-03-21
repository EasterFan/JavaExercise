package ThreadCommunicate1;


/**
 * 共享数据 -- 人
 */

class People{
  String name;
  String sex;
  boolean flag = false;  // 判断房间内是否有人

  // 录入人员信息
  public synchronized void RoomIn(String name,String sex){
      // 如果有人，放弃执行权，进行等待
      if(flag) {
          try {wait();} catch (InterruptedException e) {e.printStackTrace();}
      }
      // 如果没人，进行录入
      this.name = name;
      this.sex = sex;
      System.out.println(Thread.currentThread().getName() + ".....RoomIn:" + this.name+"....."+this.sex);
      flag = true;
      notify();
  }

    // 取出人员信息
  public synchronized void RoomOut(){
      // 如果没有人，放弃执行权，进行等待
      if(!flag){
          try {wait();} catch (InterruptedException e) {e.printStackTrace();}
      }
      System.out.println(Thread.currentThread().getName()+".....RoomOut:"+this.name +"....."+this.sex);
      flag = false;
      notify();
  }
}


/**
 * 生产者线程 -- 循环录入 Tom 和 Jerry
 */
class RoomIn implements Runnable{
    People people;

    public RoomIn(People people){
      this.people = people;
    }

    @Override
    public void run() {
        int count = 1;
        while (true){
            count = (count + 1) % 2;

            if(count == 0){
                people.RoomIn("Tom","man");
            }else {
                people.RoomIn("杰瑞","女女女");
            }
        }
    }
}

/**
 * 消费者线程
 */
class RoomOut implements Runnable{
    People people;

    RoomOut(People people){
        this.people = people;
    }

    @Override
    public void run() {
        // 一定要加死循环，让两个线程相互争抢 === 否则 RoomOut 方法只执行一次， RoomIn 方法执行后一直 wait() 死锁
        while (true){
            people.RoomOut();
        }
    }
}


/**
 * 主函数：
 * 一个生产者，一个消费者， === if + notify
 * 先生产，后消费
 * 生产一个消费一个
 */

public class ThreadOneCustom {
    public static void main(String[] args) {
        // 1.新建共享数据
        People people = new People();

        // 打开两个线程 -- 录入和输出
        new Thread(new RoomIn(people)).start();
        new Thread(new RoomOut(people)).start();
    }
}
