package ThreadCommunicate;

/**
 * 消费者类
 */
public class Customer implements Runnable{
    private PublicShare publicShare;

    Customer(PublicShare publicShare){
        this.publicShare = publicShare;
    }

    @Override
    public void run() {
        while (true){
            publicShare.getN();

            // 放慢速度
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
