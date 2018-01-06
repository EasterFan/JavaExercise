package function;

/**
 * 方法重载
 */

public class FunctionDemo {

    // 整型方法
    public int plus(int a,int b){
        return a + b;
    }

    // double 类型方法
    public double plus(double a, double b){
        return a + b;
    }

    // 数组累加方法

    public int plus(int arr[]){
        int sum = 0;

        for(int i: arr){
            sum += i;
        }

        return sum;
    }


    public static void main(String[] args) {

        int m = 5, n = 6;
        double a = 1.2, b = 2.5;
        int arr[] = {1,2,3,4,5,6};

        // 调用相加方法 -- 先新建对象
        FunctionDemo fd = new FunctionDemo();

        System.out.println("整型相加结果" + fd.plus(n,m));
        System.out.println("浮点型相加结果" + fd.plus(a,b));
        System.out.println("数组相加结果" + fd.plus(arr));



    }
}
