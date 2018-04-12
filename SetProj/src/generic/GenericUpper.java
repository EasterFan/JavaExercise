package generic;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 泛型限定 -- 上限
 * 一个迭代器遍历子类和父类
 */
public class GenericUpper {
    public static void main(String[] args) {
        ArrayList<Person11> alp = new ArrayList<Person11>();
        ArrayList<Student11> als = new ArrayList<Student11>();

        alp.add(new Person11("pp1"));
        alp.add(new Person11("pp2"));
        alp.add(new Person11("pp3"));

        als.add(new Student11("s44"));
        als.add(new Student11("s55"));
        als.add(new Student11("s66"));

//        printColl(alp);
        printColl(als);

    }

    // 遍历Person 11 和 Person11 的所有子类
    public static void printColl(ArrayList< ? extends Person11> per){
        for(Iterator<? extends Person11> it = per.iterator(); it.hasNext();){
            System.out.println(it.next().getName());
        }
    }
}

/**
 * 子类
 */
class Student11 extends Person11 {

    Student11(String name){
        super(name);
    }
}

/**
 * 父类
 */
class Person11{
    private String name;

    public Person11(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}