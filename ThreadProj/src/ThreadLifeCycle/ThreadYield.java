package ThreadLifeCycle;

class ThreadLife1 implements Runnable{

    @Override
    public void run() {
        for(int i = 0;i<100;i++){
            System.out.println(Thread.currentThread().getName() + "...run" + i);
            // 00000000111111111  ===>  01010101010101010101
            Thread.yield();
        }
    }
}


/**
 * 减缓线程速度,使一个线程不会连续占用 CPU
 */
public class ThreadYield {
    public static void main(String[] args) {
        ThreadLife1 threadLife1 = new ThreadLife1();

        new Thread(threadLife1).start();
        new Thread(threadLife1).start();

    }
}
