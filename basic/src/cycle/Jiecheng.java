package cycle;

import java.util.Scanner;

/**
 * 阶乘的累加和 1!+2!+3!+...+10!
 */

public class Jiecheng {
    public static void main(String[] args) {
        int i,j,userInput;
        long s, sum;

        while(true){
            Scanner sc = new Scanner(System.in);
            userInput = sc.nextInt();
            sum = 0;

            if(userInput == 0)break;

            for(i =1;i<=userInput;i++){

                s = 1;
                for(j=1;j<=i;j++){
                    s = s * j;       // s 存放阶乘结果
                }

                sum += s;
            }

            System.out.println(sum);
        }
    }
}
