package treeset;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * 学生对象
 */
class Student2 implements Comparable{
    private String name;
    private int age;

    public Student2(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // 学生对象的排序规则 -- 按照年龄排序
    @Override
    public int compareTo(Object obj) {
        if(!(obj instanceof Student))
            throw new RuntimeException("传入的不是学生类");
        Student2 stu = (Student2)obj;

        // 判断主要条件和次要条件
        if(this.age > stu.age)
            return 1;
        // 当年龄相同的情况下(如果返回值为0,则则记录存不进去), 应该再判断姓名, 按照姓名排序
        if(this.age == stu.age)
            return this.name.compareTo(stu.name);
        return -1;
    }
}

/**
 * 对象不具备比较性, 或者具备的不是要求的比较性
 */

public class TreeSetOrderByCollection {
    public static void main(String[] args) {
        TreeSet tree = new TreeSet(new MyComparator());

        tree.add(new Student2("name1",12));
        tree.add(new Student2("name4",8));
        tree.add(new Student2("name3",22));
        tree.add(new Student2("name2",18));
        tree.add(new Student2("name1",20));

        for(Iterator it = tree.iterator();it.hasNext();){
            Object obj = it.next();
            if(obj instanceof Student2){
                Student2 stu = (Student2) obj;
                System.out.println(stu.getName() + "..." + stu.getAge());
            }else {
                throw new RuntimeException("传入的不是学生类");
            }

        }
    }
}


/**
 * 比较器
 */

class MyComparator implements Comparator{

    @Override
    public int compare(Object o, Object t1) {
        Student2 stu1 = (Student2) o;
        Student2 stu2 = (Student2) t1;

        // 按照姓名排序
        int num = stu1.getName().compareTo(stu2.getName());
        // 如果姓名相同, 按照年龄排序
        if(num == 0){
            if(stu1.getAge() > stu2.getAge())
                return 1;
            if(stu1.getName() == stu2.getName())
                return 0;
        }
        return num;
    }
}




