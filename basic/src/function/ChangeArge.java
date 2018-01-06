package function;

/**
 * 基本数据类型参数传递,传递参数后,对主函数中变量没有影响
 */
public class ChangeArge {

    public void swap(int a,int b){

        System.out.println("交换前ab:" + a + " " + b);

        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println("交换后ab:" + a + " " + b);
    }


    public static void main(String[] args) {
        int m = 3, n = 4;
        System.out.println("交换前mn:" + m + " " + n);

        ChangeArge ca = new ChangeArge();
        ca.swap(m,n);
        System.out.println("交换后mn:" + m + " " + n);

    }
}
