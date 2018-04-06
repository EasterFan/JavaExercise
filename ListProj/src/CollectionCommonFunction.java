import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Collection接口共性方法
 */


public class CollectionCommonFunction {
    public static void main(String args[]){

        // 增
        List list = new ArrayList();
        List list1 = new ArrayList();

        list.add("spring");
        list.add("summer");
        list.add("fall");
        list.add("winter");
        list.add("night");
        list.add("light");

        list1.add("spring");
        list1.add("fall");


        // 删
        System.out.println("================");
        list.remove("summer");


        // 改 -- removeAll -- 删除交集
        list.removeAll(list1);
        for(Iterator iterator=list.iterator();iterator.hasNext();){
            System.out.println("删除交集"+iterator.next());
        }


        // 改 -- retainAll -- 保留交集 -- 交集为0, list为0
        list.retainAll(list1);
        for(Iterator iterator=list.iterator();iterator.hasNext();){
            System.out.println("保留交集"+iterator.next());
        }

        System.out.println("==========");

        // 查 --- 迭代器遍历
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println("iterator遍历结果:"+it.next());
        }


        // 迭代器内存友好写法
        for(Iterator iterator=list.iterator();iterator.hasNext();){
            System.out.println(iterator.next());
        }
    }
}
