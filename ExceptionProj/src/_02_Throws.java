import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Throws声明异常类型
 */
public class _02_Throws {
    public static void main(String args[]) {
        // 此处result调用了这个方法，由result处理方法抛出的异常

        try {
            int result = test();
            System.out.println(result);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("=====除数不能为0=====");
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("=====不能输入字母=====");
        }

    }

    private static int test() throws ArithmeticException,InputMismatchException{
        Scanner input = new Scanner(System.in);
        System.out.println("=====两数相除=====");


        System.out.println("=====请输入第一个整数=====");
        int one = input.nextInt();

        System.out.println("=====请输入第二个整数=====");
        int two = input.nextInt();

        System.out.println("=====运算结束=====");
        return one/two;
        }
}

