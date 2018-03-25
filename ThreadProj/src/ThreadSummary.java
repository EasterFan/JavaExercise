/**
 * 三个线程
 */
public class ThreadSummary {
    public static void main(String[] args) {

        // 线程封装到 匿名内部类写法
        new Thread(){
            public void run(){
                for(int i=0;i<100;i++){
                    System.out.println(Thread.currentThread().getName()+"....."+i);
                }
            }
        }.start();


        // 线程封装到 Runnable
        Runnable r = new Runnable()
        {
            @Override
            public void run() {
                for(int i=0;i<100;i++){
                    System.out.println(Thread.currentThread().getName()+"....."+i);
                }
            }
        };

        new Thread(r).start();

        // 主线程
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"....."+i);
        }
    }
}
