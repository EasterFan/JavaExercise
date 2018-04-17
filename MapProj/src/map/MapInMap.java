package map;

import java.util.*;

/**
 * 一个学校, 对应多个班级,
 * 一个班级,对应多个学生,
 * 每个学生学号对应一个姓名
 *
 * 操作:
 * 取出一个教室里的所有学生信息
 * 取出一个学校里的所有学生信息
 */
public class MapInMap {
    public static void main(String[] args) {
        TreeMap<String,String> classroom1 = new TreeMap<String, String>();
        TreeMap<String,String> classroom2 = new TreeMap<String, String>();
        TreeMap<String,TreeMap<String,String>> schoolMap = new TreeMap<String,TreeMap<String,String>>();

        classroom1.put("0001","spring");
        classroom1.put("002","summer");
        classroom1.put("004","winter");
        classroom1.put("003","fall");

        classroom2.put("0005","spring2");
        classroom2.put("006","summer2");
        classroom2.put("008","winter2");
        classroom2.put("007","fall2");

        schoolMap.put("classname01",classroom1);
        schoolMap.put("classname02",classroom2);

        getSchoolmStu(schoolMap);
    }

    // 取出一个教室里的所有学生
    public static void getClassroomStu(TreeMap<String,String> treeMap){
        Set<String> key = treeMap.keySet();
        for(Iterator<String> it = key.iterator();it.hasNext();){
            String id = it.next();
            String name = treeMap.get(id);
            System.out.println(id + "..." + name);
        }
    }

    // 取出一个学校里的所有学生
    public static void getSchoolmStu(TreeMap<String,TreeMap<String,String>> schoolMap){
        Set<Map.Entry<String,TreeMap<String,String>>> enSet = schoolMap.entrySet();
        for(Iterator<Map.Entry<String,TreeMap<String,String>>> it = enSet.iterator();it.hasNext();){
            Map.Entry<String,TreeMap<String,String>> en = it.next();
            TreeMap<String,String> classroom = en.getValue();
            getClassroomStu(classroom);
        }
    }
}
