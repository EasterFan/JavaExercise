package com.easter.test;

import java.util.Scanner;

/**
 * Throw抛出异常对象---自己抛出，自己处理
 */
public class _03_Throw1 {
    public static void main(String args[]){
        testAge();
    }

    public static void testAge(){

            try {
                System.out.println("请输入年龄");

                Scanner input = new Scanner(System.in);
                int age = input.nextInt();

                if(age < 18){
                    throw new Exception("未成年人不能进入网吧");
                }else {
                    System.out.println("可以进入网吧");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


