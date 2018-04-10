package generic;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * 泛型的使用 -- 省略上下转型
 *
 * 按照字符串长度排序 -- 长度相同,按照名称排序
 */

public class StringTreeSetWithoutClassCast {

        public static void main(String[] args) {
            TreeSet<String> treeSet = new TreeSet<String>(new StringComparaor1());

            treeSet.add("abcdfe");
            treeSet.add("sss");
            treeSet.add("d");
            treeSet.add("sdfg");
            treeSet.add("ddd");

            // 迭代器的泛型
            for(Iterator<String> it = treeSet.iterator(); it.hasNext();){
                System.out.println(it.next());
            }
        }
    }

/**
 * 比较器的泛型
 */
class StringComparaor1 implements Comparator<String> {

    @Override
    public int compare(String s, String t1) {
        int num = s.length() - t1.length();
        if(num == 0)
            return s.compareTo(t1);
        return num;
    }

    // 原来没有泛型的写法
    /*
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
    */
}