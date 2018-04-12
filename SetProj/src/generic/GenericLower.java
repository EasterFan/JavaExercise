package generic;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * 泛型限定 -- 下限
 */
public class GenericLower {
    public static void main(String[] args) {
        TreeSet<Student22> ss2 = new TreeSet<Student22>();
        TreeSet<Person22> pp2 = new TreeSet<Person22>(new Comp());

        ss2.add(new Student22("ss1"));
        ss2.add(new Student22("ss2"));
        ss2.add(new Student22("ss3"));

        pp2.add(new Person22("pp1"));
        pp2.add(new Person22("pp2"));
        pp2.add(new Person22("pp3"));

        printSuper(ss2);
        printSuper(pp2);
    }

    // 下限, 接收 Student22 和 Student22 的所有父类
    public static void printSuper(TreeSet<? super Student22> tree){
        for(Iterator<? super Student22> it = tree.iterator();it.hasNext();){
            System.out.println(it.next().toString());
        }
    }
}

/**
 * 子类
 */
class Student22 extends Person22 implements Comparable<Person22>{

    Student22(String name){
        super(name);
    }

    @Override
    public int compareTo(Person22 person22) {
        return 1;
    }
}

class Comp implements Comparator<Person22>{

    @Override
    public int compare(Person22 person22, Person22 t1) {
        return person22.getName().compareTo(t1.getName());
    }
}


/**
 * 父类
 */
class Person22 {
    private String name;

    public Person22(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}


