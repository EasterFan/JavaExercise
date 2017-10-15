package com.easter.test;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * try-catch-finally
 */
public class _01_trycatch1 {
    public static void main(String args[]) {
            test();
    }

    public static void test(){
        Scanner input = new Scanner(System.in);
        System.out.println("=====两数相除=====");

        try {
            System.out.println("=====请输入第一个整数=====");
            int one = input.nextInt();

            System.out.println("=====请输入第二个整数=====");
            int two = input.nextInt();

            System.out.println(one/two);
        }catch (ArithmeticException e) {

            // 打印错误的堆栈信息
            e.printStackTrace();
            System.out.println("除数不能为0");

        }

        catch (InputMismatchException e) {

            // 打印错误的堆栈信息
            e.printStackTrace();
            System.out.println("必须输入数字");

        }
        catch (Exception e){
            // 打印错误的堆栈信息
            e.printStackTrace();
            System.out.println("其他错误");
        }finally {
            System.out.println("=====运算结束=====");
        }


    }

}


