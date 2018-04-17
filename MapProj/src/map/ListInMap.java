package map;

import java.util.*;

/**
 * 一个学校, 对应多个班级,
 * 一个班级,对应多个学生,
 * 每个学生对象,有姓名和学号属性
 *
 *
 * 操作:
 * 取出一个教室里的所有学生信息
 * 取出一个学校里的所有学生信息
 */
public class ListInMap {
    public static void main(String[] args) {
        ArrayList<Student> classroom01 = new ArrayList<Student>();
        ArrayList<Student> classroom02 = new ArrayList<Student>();
        TreeMap<String,ArrayList<Student>> schoolMap = new TreeMap<>();

        classroom01.add(new Student("001","spring"));
        classroom01.add(new Student("002","summer"));
        classroom02.add(new Student("001","fall"));
        classroom02.add(new Student("002","winter"));
        schoolMap.put("classname01",classroom01);
        schoolMap.put("classname02",classroom02);

        getSchoolStu(schoolMap);
    }

    // 取出班级里所有学生对象
    public static void getClassStu(ArrayList<Student> classroom){
        for(Iterator<Student> it = classroom.iterator();it.hasNext();){
            System.out.println(it.next().toString());
        }
    }

    // 取出学校里所有学生对象
    public static void getSchoolStu(TreeMap<String,ArrayList<Student>> schoolMap){
        Set<Map.Entry<String,ArrayList<Student>>> enSet = schoolMap.entrySet();
        for(Iterator<Map.Entry<String,ArrayList<Student>>> it = enSet.iterator();it.hasNext();){
            getClassStu(it.next().getValue());
        }
    }
}

class Student{
    private String id;
    private String name;

    public Student(String id,String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "id: "+id+",name: "+name;
    }
}


