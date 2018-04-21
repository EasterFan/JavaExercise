package utilCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 集合二分查找 -- 只适用于有序集合(List 集合)
 * 找到了 --> 返回角标
 * 未找到 --> 返回  -(插入点 + 1)
 *
 * 二分查找传入比较器, 根据长度二分查找
 */

public class BinarySearchCollection {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();

        arr.add("aaa");
        arr.add("jhdns");
        arr.add("hfh");
        arr.add("fjh");

        // 先对集合排序, 若二分查找传入比较器, sort 时也传入比较器
        Collections.sort(arr,new StrLengthComparator());
        System.out.println(arr);
        int index = Collections.binarySearch(arr,"hfh",new StrLengthComparator());

//        int index = halfSearch(arr,"hfh");



        System.out.println(index);
    }

    /**
     * 集合二分查找的实现
     * @param list
     * @param key
     * @return
     */
    public static  int halfSearch(List<String> list,String key){
        int max,min,mid;
        max = list.size() -1;
        min = 0;

        while (min < max){
            mid = (min + max) / 2;
            String str = list.get(mid);
            int num = str.compareTo(key);
            if(num>0)
                max = mid - 1;
            else if (num < 0)
                min = mid + 1;
            else
                return mid;
        }

        // min > max, 未找到
        return -min - 1;
    }
}
