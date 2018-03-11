/**
 * 懒汉式线程安全 -- 双重校验锁 -- 减少锁判断次数
 */

class Single{
    private static Single single = null;

    private Single(){

    }

    public static Single getInstance(){

        if(single == null) {
            // --- 此处存在线程安全
            synchronized (Single.class) {
                // --- 此处存在线程安全
                if (single == null) {
                    single = new Single();
                }
            }
        }
        return single;
    }
}

public class Lock2 {
    public static void main(String[] args) {

    }
}
