import java.util.Scanner;

/**
 * 自定义异常类---为满足特定的业务逻辑
 */
public class _05_CustomThrow {
    public static void main(String args[])  {
        try {
            testAge();
            // 自定义异常处理逻辑
        } catch (NetBarAgeException e) {
            System.out.println(e.getMessage());
            System.out.println("网吧前台人员不得办理开机登记");
            // 其他意料之外的异常
        } catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void testAge() throws NetBarAgeException {
        System.out.println("请输入年龄");

        Scanner input = new Scanner(System.in);
        int age = input.nextInt();

        if(age < 18){
            throw new NetBarAgeException();
        }else {
            System.out.println("可以进入网吧");
        }
    }
}

/**
 * 自定义异常类--频繁出现的特定业务
 */
class NetBarAgeException extends Exception {
    // 构造方法
    public NetBarAgeException(){
        super("未成年人禁止入内");
    }
}
