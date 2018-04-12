package generic;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 泛型限定 -- 通配符
 * 一个迭代器遍历任意类型的 ArrayList
 */

public class GenericFanwei {
    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<String>();
        ArrayList<Integer> arr2 = new ArrayList<Integer>();

        arr1.add("name1");
        arr1.add("name2");
        arr1.add("name3");

        arr2.add(4);
        arr2.add(5);
        arr2.add(6);

        printColl(arr1);
        printColl(arr2);
    }

    // 静态工具类 -- 通配符
    public static void printColl(ArrayList<?> arr){
        for(Iterator<?> it = arr.iterator();it.hasNext();){
            System.out.println(it.next());
            // 不可调用原来的属性
//            System.out.println(it.next().length);
        }
    }

    // 静态工具类 -- 泛型(这种写法能够操作具体对象的属性)
    public static <T> void printColl2(ArrayList<T> arr){
        for(Iterator<?> it = arr.iterator();it.hasNext();){
            T t = (T)it.next();
            System.out.println(it.next());
        }
    }
}
