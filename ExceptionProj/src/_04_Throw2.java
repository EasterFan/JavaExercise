import java.util.Scanner;

/**
 * Throw抛出异常对象---自己抛出，Throws声明，调用者处理
 */
public class _04_Throw2 {
    public static void main(String args[]){
        try {
            testAge();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void testAge() throws Exception{
        System.out.println("请输入年龄");

        Scanner input = new Scanner(System.in);
        int age = input.nextInt();

        if(age < 18){
            throw new Exception("未成年人不能进入网吧");
        }else {
            System.out.println("可以进入网吧");
        }
    }
}
