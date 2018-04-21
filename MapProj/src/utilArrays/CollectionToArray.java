package utilArrays;

import java.util.*;

/**
 * 集合转数组 -- 限定对集合的操作
 */
public class CollectionToArray {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("djhs");
        list.add("jdhf");
        list.add("js");

        // 创建一个和集合大小相等的数组
        String[] arr = list.toArray(new String[list.size()]);
        System.out.println(Arrays.toString(arr));
    }
}
