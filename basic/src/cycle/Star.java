package cycle;

import java.util.Scanner;

/**
 * while 循环打印 5x5 行星星,嵌套循环 -- 注意循环变量的清空
 */

public class Star {
    public static void main(String[] args) {
        System.out.println("打印星星");

        int userInput,outVa,innerVa;

        while (true){
            System.out.println("input starNum, input 0 to exit:");
            Scanner sc = new Scanner(System.in);
            userInput = sc.nextInt();

            if(userInput == 0)break;
//            清空外层循环变量
            outVa = 1;

//        外层循环,控制打印几行
            while (outVa <= userInput) {
//                清空内层循环变量
                innerVa = 1;

                //  内层循环,控制每行打印几个星星 -- 内层循环变量的值随着外层循环变量改变而改变
                while (innerVa <= outVa) {
                    System.out.print("*");
                    innerVa++;
                }

                System.out.println();
                outVa++;
            }
        }

    }

}
