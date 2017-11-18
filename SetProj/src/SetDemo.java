import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by easter on 17-11-13.
 * set集的增删查改--set存储String类
 */
public class SetDemo {
    public static void main(String args[]){

        // 将英文单词添加到HashSet中
        Set set = new HashSet();

        // 添加元素
        set.add("blue");
        set.add("red");
        set.add("gray");
        set.add("pink");


        // 将set放入迭代器中
        Iterator it = set.iterator();
        // 遍历迭代器并输出
        while (it.hasNext()){
            // 显示元素
            System.out.println(it.next()+" ");
        }
        //在set中插入新单词
        set.add("green");

        // 插入重复元素，插入失败但不报错
        set.add("blue");


    }
}
