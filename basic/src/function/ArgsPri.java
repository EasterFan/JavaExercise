package function;

/**
 * 可变参数列表方法重载时的问题 --- 可变参数列表所在的方法是最后被调用的
 *
 */

public class ArgsPri {

    // 带可变参数列表的方法
    public int plus(int... a){
        System.out.println("带可变参数列表的方法被调用");
        int sum = 0;

        for(int a1 : a){
            sum += a1;
        }

        return sum;
    }

    // 不带可变参数列表的方法
    public int plus(int a, int b){
        System.out.println("不带可变参数列表的方法被调用");
        return a + b;
    }


    public static void main(String[] args) {
        int a = 3, b = 4;

        ArgsPri ap = new ArgsPri();
        ap.plus(a,b);

    }
}
