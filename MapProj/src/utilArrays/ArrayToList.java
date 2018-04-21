package utilArrays;

import java.util.Arrays;
import java.util.List;

/**
 * 数组转为 list 集合
 *
 */
public class ArrayToList {
    public static void main(String[] args) {
        String arr[] = {"aaa","fff","fhs"};
        int num[] = {2,3,5};
        Integer numInteger[] = {4,5,6,6};

        // 对象数组转list集合
        List<String> list = Arrays.asList(arr);
        System.out.println(list.contains("kdj"));

        // 基本数据类型转list集合
        List<int[]> nums = Arrays.asList(num);
        List<Integer> intergerNum = Arrays.asList(numInteger);
        System.out.println("基本数据类型数组:" + nums);
        System.out.println("对象数组:" + intergerNum);
    }
}
