package ThreadCommunicate;

/**
 * 要求先生产，再消费，并且生产一个消费一个
 */
public class PublicShareTest {

    public static void main(String[] args) {

      PublicShare publicShare = new PublicShare();

        //创建线程并启动
        new Thread(new Producer(publicShare)).start();
        new Thread(new Customer(publicShare)).start();

    }
}
