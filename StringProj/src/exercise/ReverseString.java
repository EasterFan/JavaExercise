package exercise;

/**
 * 字符串反转 ====  字符串变数组 --> 数组反转 --> 数组转字符串
 */


public class ReverseString {
    /**
     * 反转字符串
     * @param str
     * @return
     */
    public static String reverse(String str){

        // 字符串变数组
        char[] arr = str.toCharArray();

        // 数组反转
        reverseArr(arr);

        // 返回字符串
        return new String(arr);
    }

    // 反转数组
    private static void reverseArr(char[] arr) {
        for(int start = 0, end = arr.length -1; start < end; start++,end--){
            swap(arr,start,end);
        }
    }

    /**
     * 交换数组元素
     * @param arr
     * @param start
     * @param end
     */
    private static void swap(char[] arr, int start, int end) {
        char temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;
    }


    public static void main(String[] args) {

        String str = "abcdefg";
        String result = reverse(str);
        System.out.println(result);

    }
}
