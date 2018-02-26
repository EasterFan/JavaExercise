package array;

/**
 * 冒泡排序法 -- 整型数组
 *
 * 外层循环: 控制循环次数(n个数字,需排n-1次)
 * 内层循环: 将两个数比较并交换位置
 *
 * 选择排序
 *
 */

public class Bubble {

    public static void main(String[] args) {

        int arr[] = {34,43,2,44,23,22,3};

        // 原来数组
        System.out.println("原来数组");
        printarr(arr);

        // 冒泡排序
        // 最后一个元素不必遍历
        for(int i=0;i<arr.length -1;i++){
            // 内层循环,相邻的两个元素比较,每次循环减去前 n 个已经确定的元素, 且最后一个元素不必遍历
            for(int j=0;j < arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    changeTwoArrayElement(arr,j,j+1);
                }
            }
        }

        // 选择排序
        // 最后一个数组元素不用遍历
        for(int i = 0;i<arr.length-1;i++){
            // 前面比较过的小元素不需要再比较
            for (int j = i + 1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    changeTwoArrayElement(arr,i,j);
                }
            }
        }
        

        // 排序后数组
        System.out.println('\n' + "排序后数组");
        printarr(arr);
    }


    static void printarr(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    /**
     * 传入下标,交换数组中两个元素的位置
     * @param arr
     * @param smaller
     * @param bigger
     */
    static void changeTwoArrayElement(int arr[],int smaller,int bigger){
        int temp ;
        temp = arr[smaller];
        arr[smaller] = arr[bigger];
        arr[bigger] = temp;
    }
}
