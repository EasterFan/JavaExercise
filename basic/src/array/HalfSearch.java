package array;

/**
 * 二分查找
 */

public class HalfSearch {
    public static void main(String[] args) {
        int arr[] = {2,4,6,7,9,12};
        int result = getIndex(arr,10);
        System.out.println(result);
    }

    /**
     * 输入一个数,返回该数在数组中的下标,如果数组中没有此元素,返回 -1
     * @param arr
     * @param key
     * @return
     */
    public static int getIndex(int arr[],int key){
        int min = 0;
        int max = arr.length - 1;
        int mid = (max + min) / 2;

        while (arr[mid] != key){
            if(key > arr[mid])
                min = mid + 1;
            else if(key < arr[mid])
                max = mid - 1;

            // 如果数组中无此元素,返回-1
            if(min > max) return -1;
            mid = (max + min) / 2;
        }

        return mid;
    }
}
