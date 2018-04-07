package arraylist;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/**
 * Created by easter on 17-11-13.
 * Arraylist添加自定义类
 */
public class NoticeTest {

    public static void main(String args[]){
        // 生成三条公告
        Notice n1 = new Notice(1,"早上来了","早上", new Date());
        Notice n8 = new Notice(1,"早上来了","早上", new Date());
        Notice n2 = new Notice(2,"中午来了","中午", new Date());
        Notice n3 = new Notice(3,"晚上来了","晚上", new Date());

        // 添加公告到list  [[公告编号：1,标题：早上来了，作者：早上，创建时间Sat Nov 18 17:31:56 CST 2017], [公告编号：2,标题：中午来了，作者：中午，创建时间Sat Nov 18 17:31:56 CST 2017], [公告编号：3,标题：晚上来了，作者：晚上，创建时间Sat Nov 18 17:31:56 CST 2017]]
        ArrayList<Notice> notice_list = new ArrayList<>();
        notice_list.add(n1);
        notice_list.add(n2);
        notice_list.add(n3);
        notice_list.add(n8);

        System.out.println(notice_list);

        // 显示公告----get()返回的是Object，要将其强转为Notice

        System.out.println("所有公告内容");
        for(int i = 0;i<notice_list.size();i++){
            System.out.println(i+1+(notice_list.get(i)).getTitle());
        }

        // 在第一条公告后添加新公告
        Notice n4 = new Notice(4,"晌午来了","晌午",new Date());
        notice_list.add(1,n4);

        // 显示公告----get()返回的是Object，要将其强转为Notice
        System.out.println("所有公告内容");
        for(int i = 0;i<notice_list.size();i++){
            System.out.println(i+1+(notice_list.get(i)).getTitle());
        }

        // 删除早上的公告--用index或对象删除
        notice_list.remove(n4);

        // 显示公告----get()返回的是Object，要将其强转为Notice
        System.out.println("所有公告内容");
        for(int i = 0;i<notice_list.size();i++){
            System.out.println(i+1+(notice_list.get(i)).getTitle());
        }

        // 修改公告--将中午改为傍晚
        n2.setTitle("傍晚来了");
        notice_list.set(1,n2);
        System.out.println("所有公告内容");
        for(int i = 0;i<notice_list.size();i++){
            System.out.println(i+1+(notice_list.get(i)).getTitle());
        }

        // 去重 -- 要在实体类中重写 equals 方法, 否则不能去重
        notice_list = quChong(notice_list);
        for(Iterator it = notice_list.iterator();it.hasNext();){
            System.out.println(it.next());
        }

    }

    /**
     * 普通去重
     * @param arrayList
     * @return
     */
    public static ArrayList quChong(ArrayList arrayList){
        ArrayList arr = new ArrayList();
        for(Iterator it = arrayList.iterator(); it.hasNext();){
            Object obj = it.next();
            if(!arr.contains(obj)){
                arr.add(obj);
            }
        }
        return arr;
    }
}
