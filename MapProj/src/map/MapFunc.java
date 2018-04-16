package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * map 通用方法
 */

public class MapFunc {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String, String>();

        map.put("001","mm1");
        map.put("002","mm2");
        // put 返回上一个键的值
        System.out.println("put: "+map.put("003","mm3"));
        map.put("004","mm4");
        map.put("005","mm5");

        // 全部删除
//        map.clear();
        System.out.println(map);

        // 方法一: 遍历 Map 集合
        Set<String> key = map.keySet();
        for(Iterator<String> it = key.iterator();it.hasNext();){
            String key1 = it.next();
            String value = map.get(key1);
            System.out.println(key1 +"...."+ value);
        }

        // 方法二: 遍历 Map 集合
        Set<Map.Entry<String,String>> mapentry = map.entrySet();

        for(Iterator<Map.Entry<String,String>> it = mapentry.iterator();it.hasNext();){
            Map.Entry<String,String> me = it.next();

            String entrykey = me.getKey();
            String entryvalue = me.getValue();
            System.out.println("key: "+ entrykey + ",value: " + entryvalue);
        }
    }
}
