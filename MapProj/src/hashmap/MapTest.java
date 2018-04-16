package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 每一个学生都有对应的归属地,
 * 学生 Student ,地址 String
 * 学生属性: 姓名, 年龄
 * 姓名和年龄相同, 视为同一学生
 * 保证学生的唯一性
 *
 * 1. 描述学生
 * 2. 定义 map 容器, 学生为键, 地址为值
 * 3. 遍历输出( hash 表无序存储)
 */


public class MapTest {
    public static void main(String[] args) {
        HashMap<Student,String> map = new HashMap<Student,String>();

        map.put(new Student("easter",50),"earth");
        map.put(new Student("summer",3),"sky");
        map.put(new Student("winter",6),"snow");
        map.put(new Student("fall",40),"leaves");

        // 遍历 -- keySet
        Set<Student> stuset = map.keySet();
        for(Iterator<Student> it = stuset.iterator();it.hasNext();){
            Student key = it.next();
            String value = map.get(key);
            System.out.println(key.getName() +"...." + value);
        }

        System.out.println("======");

        // 遍历:EntrySet
        Set<Map.Entry<Student,String>> entry = map.entrySet();
        for(Iterator<Map.Entry<Student,String>> it = entry.iterator();it.hasNext();){
            Map.Entry<Student,String> me = it.next();
            Student key = me.getKey();
            String value = me.getValue();
            System.out.println(key.getName() + "...." + value);
        }
    }

}

// 学生对象有可能被存储到二叉树中, 使其具备比较性

class Student implements Comparable<Student>{
    private String name;
    private int age;

    Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return age == student.age &&
//                Objects.equals(name, student.name);

        if(!(obj instanceof Student))
            throw new ClassCastException("类型不匹配");
        Student s = (Student)obj;
        return this.name.equals(s.name) && this.age == s.age;

    }

    @Override
    public int hashCode() {
//        return Objects.hash(name, age);
        return name.hashCode() + age * 34;
    }

    @Override
    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
        return name + ":" + age;
    }

    // 按照姓名排序, 姓名相同,按照年龄排序
    /*
    @Override
    public int compareTo(Object obj) {
        if(!(obj instanceof Student))
            throw new ClassCastException("类型不匹配");
        Student s = (Student)obj;

        int num = this.name.compareTo(s.name);
        if(num == 0)
            return this.age - s.age;
        return num;
    }
    */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student s) {
        int num = this.name.compareTo(s.name);
        if(num == 0)
            return this.age - s.age;
        return num;
    }
}

