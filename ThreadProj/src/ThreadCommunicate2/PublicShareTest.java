package ThreadCommunicate2;

/**
 * 被Producer和customer共享的类，商品存放和取出的地方
 */
class PublicShare {
    private int n;
    private Boolean flag = false;

    public synchronized int getN() {
        // 如果没有，get方法等待
        while(!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Customer取出"+ n);
        flag = false;// 取出完毕，容器中没有数据
        notifyAll();
        return n;
    }

    public synchronized void setN(int n) {
        // 如果有的话，set线程等待
        while (flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Producer生产"+n);
        this.n = n;
        flag = true;// 生产完毕，容器中有数据
        notifyAll();
    }
}

/**
 * 生产者
 */
class Producer implements Runnable{
    PublicShare publicShare;

    public Producer(PublicShare publicShare){
        this.publicShare = publicShare;
    }

    @Override
    public void run() {
        int i = 0;
        while (true){
            publicShare.setN(i);
            i++;

            // 放慢速度打印
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}

/**
 * 消费者类
 */
class Customer implements Runnable{
    private PublicShare publicShare;

    Customer(PublicShare publicShare){
        this.publicShare = publicShare;
    }

    @Override
    public void run() {
        while (true){
            publicShare.getN();

            // 放慢速度
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}


/**
 * 要求先生产，再消费，并且生产一个消费一个 -- 且只有一个生产者，一个消费者
 * 可以用 if + notify
 */
public class PublicShareTest {

    public static void main(String[] args) {

        PublicShare publicShare = new PublicShare();

        //创建线程并启动
        new Thread(new Producer(publicShare)).start();
        new Thread(new Customer(publicShare)).start();
    }
}
