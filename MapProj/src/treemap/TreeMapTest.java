package treemap;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/**
 * 学生自带的比较性是按照姓名排序
 * 自定义一个比较器, 对学生对象的年龄进行升序排序
 * 数据是以键值对的形式存储的, -- TreeMap
 */

public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<Student,String> treeMap = new TreeMap<Student,String>(new StuAgeComparator());

        treeMap.put(new Student("easter",50),"earth");
        treeMap.put(new Student("summer",3),"sky");
        treeMap.put(new Student("winter",6),"snow");
        treeMap.put(new Student("fall",40),"leaves");
        treeMap.put(new Student("fall",3),"leaves");

        // 遍历 -- keySet
        Set<Student> stuset = treeMap.keySet();
        for(Iterator<Student> it = stuset.iterator(); it.hasNext();){
            Student key = it.next();
            String value = treeMap.get(key);
            System.out.println(key.getName() +"...." +key.getAge()+"..."+ value);
        }
    }
}

// 自定义的年龄比较器
class StuAgeComparator implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2) {
//        int num = new Integer(s1.getAge()).compareTo(new Integer(s2.getAge()));
        int num = s1.getAge() - s2.getAge();
        if(num == 0)
            return s1.getName().compareTo(s2.getName());
        return num;
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


