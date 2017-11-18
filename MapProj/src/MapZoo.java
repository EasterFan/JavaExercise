import java.util.*;

/**
 * 一个字典的功能----Map存放字符串类
 - 显示HashMap中的内容
 - 查找某个单词的注释并显示
 */
public class MapZoo {
    public static void main(String args[]){

        // 定义一个hashmap对象
        Map<String,String> zoo = new HashMap<>();
        System.out.println("请输入三组单词对应的注释，并存放到HashMap中");

        Scanner console = new Scanner(System.in);

        // 1.添加数据
        int i = 0;
        while(i<3){
            System.out.println("请输入key值（单词）：");
            String key = console.next();
            System.out.println("请输入value值（注释）：");
            String value = console.next();
            zoo.put(key,value);
            i++;
        }

        // 2.打印输出value值（迭代器）
        System.out.println("*****************");
        System.out.println("使用迭代器输出所有的value");

        Iterator<String> iterator = zoo.values().iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+"");
        }

        // 3.打印输出所有key和value的值
        System.out.println();
        System.out.println("****************");
        System.out.println("打印输出所有key和value的值");

        // 整个Entry的格式：[1=dog, 2=cat, 3=fish]
        Set<Map.Entry<String,String>> entrySet = zoo.entrySet();

        // 增强型for循环遍历EntrySet
        for(Map.Entry<String,String> entry:entrySet){
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }


        // 4.通过单词查找到注释
        System.out.println("输入你要查找的单词key");
        String search = console.next();
        if(zoo.containsKey(search)){
            System.out.println("已找到单词"+zoo.get(search));
        }else {
            System.out.println("没有找到单词");
        }

    }
}
