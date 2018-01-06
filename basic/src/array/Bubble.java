package array;

/**
 * 冒泡排序法 -- 整型数组
 *
 * 外层循环: 控制循环次数(n个数字,需排n-1次)
 * 内层循环: 将两个数比较并交换位置
 *
 *
 */

public class Bubble {

    public static void main(String[] args) {

        int arr[] = {34,43,2,44,23,22,3};
        int temp;

        // 原来数组
        System.out.println("原来数组");
        for(int i : arr){
            System.out.print(i + " ");
        }


        // 外层循环控制循环次数
        for(int i=0;i<arr.length -1;i++){

            // 内层循环控制每次循环,两个数字的位置
            for(int j=0;j < arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        // 排序后数组
        System.out.println('\n' + "排序后数组");
        for(int i : arr){
            System.out.print(i + " ");
        }

    }
}
