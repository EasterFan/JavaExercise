package array;

import java.util.Scanner;

/**
 * 读取键盘数据对数组赋值
 */

public class ArrayOption {
    public static void main(String[] args) {
        int arr[] = new int[4];
        int sum = 0;
        Scanner sc = new Scanner(System.in);


        // 1.初始化-读取键盘输入赋值
        for(int i=0; i<arr.length; i++){

            System.out.println("please input No"+ (i+1) + " below:");

            arr[i] = sc.nextInt();
        }

        // 2.求数组累加和
        for (int i : arr){
            sum += i;
        }

        // 3.求数组元素的最大值
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        System.out.println("数组和为:"+sum);
        System.out.println("数组最大值为:"+max);
    }
}
