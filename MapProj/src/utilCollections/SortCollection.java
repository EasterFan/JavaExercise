package utilCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 集合工具 -- Collection -- sort
 * 只能对 List 数组排序 -- 自然排序, 或传入排序规则 Comparator
 */
public class SortCollection {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("ddd");
        list.add("jdhfgtg");
        list.add("aaal");
        list.add("kjdff");
        list.add("m");

        sortByDefault(list);
        sortByLength(list,new StrLengthComparator());

    }

    // 自然顺序排序
    public static void sortByDefault(ArrayList<String> list){
        Collections.sort(list);
        System.out.println(list);
    }

    // 按照字符串长度排序 -- 自定义排序
    public static void sortByLength(ArrayList<String> list,StrLengthComparator comparator){
        Collections.sort(list,comparator);
        System.out.println(list);
    }

}

/**
 * 字符串长度比较器
 */
class StrLengthComparator implements Comparator<String>{
    @Override
    public int compare(String s, String t1) {
        return s.length() - t1.length();
    }
}
