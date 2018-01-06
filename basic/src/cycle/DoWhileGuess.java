package cycle;

import java.util.Scanner;

public class DoWhileGuess {
    public static void main(String[] args) {

        // 使用随机数生成1-10之间的整数

        int real = (int)(Math.random()*10 + 1);
        System.out.println(real);
        int guess;

        do{
            Scanner sc = new Scanner(System.in);

            System.out.println("please input your guess:");
            guess = sc.nextInt();

            if(guess > real){
                System.out.println("too big");
            }else if (guess < real){
                System.out.println("too small");
            }else {
                System.out.println("get it");
            }

        }while(guess != real);

    }
}
