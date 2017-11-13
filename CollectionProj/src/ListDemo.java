import java.util.ArrayList;
import java.util.List;

/**
 * Created by easter on 17-11-13.
 * Arraylist添加string类
 */
public class ListDemo {
    public static void main(String args[]){

        // 用ArrayList存储
        List list = new ArrayList();
        list.add("spring");
        list.add("summer");
        list.add("fall");
        list.add("winter");

        // 遍历输出所有list内容
        for (int i = 0;i<list.size();i++){
            System.out.print(list.get(i)+",");
        }

        // 删除春秋，remove的两种方法
        System.out.println("================");
        list.remove(0);
        list.remove("summer");
        for (int i = 0;i<list.size();i++){
            System.out.print(list.get(i)+",");
        }

    }
}
