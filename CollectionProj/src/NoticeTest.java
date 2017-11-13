import java.util.ArrayList;
import java.util.Date;

/**
 * Created by easter on 17-11-13.
 * Arraylist添加自定义类
 */
public class NoticeTest {

    public static void main(String args[]){
        // 生成三条公告
        Notice n1 = new Notice(1,"早上来了","早上", new Date());
        Notice n2 = new Notice(2,"中午来了","中午", new Date());
        Notice n3 = new Notice(3,"晚上来了","晚上", new Date());

        // 添加公告到list
        ArrayList notice_list = new ArrayList();
        notice_list.add(n1);
        notice_list.add(n2);
        notice_list.add(n3);

        // 显示公告----get()返回的是Object，要将其强转为Notice

        System.out.println("所有公告内容");
        for(int i = 0;i<notice_list.size();i++){
            System.out.println(i+1+((Notice)(notice_list.get(i))).getTitle());
        }

        // 在第一条公告后添加新公告
        Notice n4 = new Notice(4,"晌午来了","晌午",new Date());
        notice_list.add(1,n4);

        // 显示公告----get()返回的是Object，要将其强转为Notice
        System.out.println("所有公告内容");
        for(int i = 0;i<notice_list.size();i++){
            System.out.println(i+1+((Notice)(notice_list.get(i))).getTitle());
        }

        // 删除早上的公告--用index或对象删除
        notice_list.remove(n4);

        // 显示公告----get()返回的是Object，要将其强转为Notice
        System.out.println("所有公告内容");
        for(int i = 0;i<notice_list.size();i++){
            System.out.println(i+1+((Notice)(notice_list.get(i))).getTitle());
        }

        // 修改公告--将中午改为傍晚
        n2.setTitle("傍晚来了");
        notice_list.set(1,n2);
        System.out.println("所有公告内容");
        for(int i = 0;i<notice_list.size();i++){
            System.out.println(i+1+((Notice)(notice_list.get(i))).getTitle());
        }
    }
}
