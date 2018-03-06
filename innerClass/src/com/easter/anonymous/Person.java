package com.easter.anonymous;

/**
 * Created by easter on 17-10-9.
 */

/**
 * 抽象父类
 */
public abstract class Person {
    private String name;
    // 抽象方法
    public abstract void read();
}

/**
 * 子类
 */
class Man extends Person {
    @Override
    public void read() {
        System.out.println("i'm man");
    }
}

/**
 * 子类
 */
class Woman extends Person {

    @Override
    public void read() {
        System.out.println("i'm woman");
    }
}

class AnonymousTest1 {
    // 根据传入的性别，输出不同的语句---多态
    // 方法一：通过多态，传入person实例，然后去找person的子类man或者woman
    public void getRead(Person person){
        person.read();
    }

    public static void main(String args[]){
        AnonymousTest1 test = new AnonymousTest1();
        Man man = new Man();
        Woman woman = new Woman();


        test.getRead(man);
        test.getRead(woman);
    }
}

class AnonymousTest2 {

    // 根据传入的性别，输出不同的语句---匿名内部类
    // 方法二：通过匿名内部类，不需要Man和Woman子类

    public void getRead(Person person){
        person.read();
    }

    public static void main(String args[]){
        AnonymousTest2 test2 = new AnonymousTest2();

        //Person 是抽象类，没有实例化对象 - 实例化的是子类对象
        test2.getRead(new Person() {
            @Override
            public void read() {
                System.out.println("i'm man");
            }
        });

        test2.getRead(new Person() {
            @Override
            public void read() {
                System.out.println("i'm woman");
            }
        });
    }
}


