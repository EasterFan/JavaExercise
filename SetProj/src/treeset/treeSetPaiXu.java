package treeset;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * 自定义类要实现接口, 使实体类具备可比较性
 */
class Student implements Comparable{
    private String name;
    private int age;

    public Student(String name, int age){
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
        Student stu = (Student)obj;

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
 * 向treeSet集合中添加学生类对象,
 * 想要按照学生的年龄排序
 * (年龄相同, 按照姓名排序)
 */
public class treeSetPaiXu {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();

        ts.add(new Student("name1",10));
        ts.add(new Student("name2",17));
        ts.add(new Student("name4",17));
        ts.add(new Student("name3",6));

        Iterator it = ts.iterator();
        while (it.hasNext()){
            Student stu = (Student)it.next();
            System.out.println(stu.getName()+"...."+stu.getAge());
        }
    }
}

