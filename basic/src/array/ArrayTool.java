package array;

/**
 * 一个数组的工具类
 * @author
 * @version
 */
public class ArrayTool {

    private ArrayTool(){

    }

    /**
     * 打印数组
     * @param arr 接收一个数组
     */
    public static void printArr(int arr[]){
        for(int i : arr){
            System.out.println(i);
        }
    }

    /**
     * 获取数组最大值
     * @param arr
     * @return max
     */
    public static int getMax(int arr[]){
        int max = arr[0];

        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
       return max;
    }

    /**
     * 获取数组最小值
     * @param arr
     * @return min
     */
    public static int getMin(int arr[]){
        int min = arr[0];

        for(int i = 0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    /**
     * 冒泡排序
     * @param arr
     */
    public static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length -1;i++){
            for(int j=0;j < arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swapArr(arr,j,j+1);
                }
            }
        }
    }

    private static void swapArr(int arr[],int smaller,int bigger){
        int temp ;
        temp = arr[smaller];
        arr[smaller] = arr[bigger];
        arr[bigger] = temp;
    }
}
