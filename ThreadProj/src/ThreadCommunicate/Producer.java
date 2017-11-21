package ThreadCommunicate;

/**
 * 生产者
 */
public class Producer implements Runnable{
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
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
