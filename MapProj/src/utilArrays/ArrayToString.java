package utilArrays;

import java.util.Arrays;

/**
 * Arrays 将数组转为字符串
 * 以前用 StringBuffer 实现, 现在可直接用 toString
 */
public class ArrayToString {
    public static void main(String[] args) {
        int[] arr = {2,3,4};
        System.out.println(arr); // [I@61bbe9ba
        System.out.println(Arrays.toString(arr)); // [2, 3, 4]
    }
}
