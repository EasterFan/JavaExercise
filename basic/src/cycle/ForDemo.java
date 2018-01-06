package cycle;

import java.util.Scanner;

/**
 * 不断从键盘接收数字并打印,直到输入0,程序退出
 */


public class ForDemo {
    public static void main(String[] args) {

        // 从键盘接收数据
        Scanner sc = new Scanner(System.in);

        int i;

        while(true){
            i = sc.nextInt();
            if (i==0)break;
            System.out.print(i);
        }

    }
}
