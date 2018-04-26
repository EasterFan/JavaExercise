package systemproj;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * JVM 启动时, 获取当前系统环境
 */
public class SystemProperty {
    public static void main(String[] args) {
        Properties pro  = System.getProperties();

        // 向系统中添加自定义信息
        System.setProperty("auther","easter");

        // Properties 是 HashTable 的子类, 故可以用 map 的方法遍历 Properties
        // 该集合中存储的都是 String 字符串, 没有泛型定义
        Set<Map.Entry<Object,Object>> entrySet = pro.entrySet();

        for (Iterator<Map.Entry<Object,Object>> it = entrySet.iterator();it.hasNext();){
            Map.Entry<Object,Object> en = it.next();
            String key = (String)en.getKey();
            String value = (String)en.getValue();
            System.out.println("输出:" + key +"......." + value);
        }
    }
}
