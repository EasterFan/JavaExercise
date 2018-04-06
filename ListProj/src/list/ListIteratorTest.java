package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * ListIterator 的用法
 */
public class ListIteratorTest {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("July");
        list.add("Sept");
        list.add("Nov");
        list.add("Dec");

        // 竟然在1.8下不报错...

//        Iterator it = list.iterator();
//        while (it.hasNext()){
//            if(it.next().equals("Sept")){
//                list.remove("Sept");
//            }
//            System.out.println(it.next());
//        }

        ListIterator li = list.listIterator();
        while (li.hasNext()){
            Object obj = li.next();
            if(obj.equals("Sept")){
                // 增删改查都可以
                li.remove();  // 删除当前迭代对象
            }
        }

        for(ListIterator li2 = list.listIterator();li2.hasNext();){
            System.out.println(li2.next());
        }
    }
}
