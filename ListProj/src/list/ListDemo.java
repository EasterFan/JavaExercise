package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by easter on 17-11-13.
 * List接口相对Collection接口的特性方法 -- 在增删查改时添加了序号参数
 *
 *增删:  add(index,element) addAll(index,collection)	remove(index)
 *
 *查: get(index)
 *   subList(from,to)
 *   listIterator()
 *
 *改: set(index,element)
 *
 */
public class ListDemo {
    public static void main(String args[]){

        List list = new ArrayList();
        list.add("spring");
        list.add("summer");
        list.add("fall");
        list.add("winter");

        // 查 -- get
        System.out.println("get:"+list.get(1));

        // 查 -- subList
        List list1 = list.subList(0,2);

        for(Iterator iterator=list1.iterator();iterator.hasNext();){
            System.out.println("list1:"+iterator.next());
        }

        // 改 -- set
        list.set(0,"night");
        for(Iterator iterator=list.iterator();iterator.hasNext();){
            System.out.println("list: "+iterator.next());
        }
    }
}
