package ThreadCommunicate;

/**
 * 被Producer和customer共享的类，商品存放和取出的地方
 */
public class PublicShare {
    private int n;
    Boolean flag = false;

    public synchronized int getN() {
        // 如果没有，get方法等待
        if(!flag){
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
        if(flag){
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
