package treeset;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * 按照字符串长度排序
 *
 * 字符串本身具备自然排序, 按照字母排序, 而不是长度
 */
public class StringTreeSetDemo {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet(new StringComparaor());

        treeSet.add("abcdfe");
        treeSet.add("sss");
        treeSet.add("d");
        treeSet.add("sdfg");
        treeSet.add("ddd");

        for(Iterator it = treeSet.iterator(); it.hasNext();){
            System.out.println(it.next());
        }
    }
}

class StringComparaor implements Comparator{

    @Override
    public int compare(Object o, Object t1) {
        String str1 = (String) o;
        String str2 = (String) t1;

        // 先按长度排序, 长度相同, 则按照名称自然排序
        int num = str1.length() - str2.length();

        // 也可以使用包装类封装 -- 包装类本身是按数字排序
//        int num = new Integer(str1.length()).compareTo(new Integer(str2.length()));
        if(num == 0){
            return str1.compareTo(str2);
        }
        return num;
    }
}