package utilCollections;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * 对比较器的反转
 * 字符串排序 -- 从大到小
 */
public class ReverseOrder {
    public static void main(String[] args) {

        // 用 reverseOrder 逆转比较器
        TreeSet<String> tree = new TreeSet<>(Collections.reverseOrder(new StrLengthComparator1()));

        tree.add("sjhj");
        tree.add("kdjasjhj");
        tree.add("k");
        tree.add("hsfkjshgkshgh");
        tree.add("hhh");

        System.out.println(tree);
    }
}


/**
 * 自定义比较器 -- 字符串长度从小到大排序
 */
class StrLengthComparator1 implements Comparator<String> {
    @Override
    public int compare(String s, String t1) {
        return s.length() - t1.length();
        // reverseOrder 逆转原理
//        return t1.length() - s.length();
    }
}

