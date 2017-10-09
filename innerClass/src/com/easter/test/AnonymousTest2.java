package com.easter.test;


import com.easter.anonymous.Person;

/**
 * Created by easter on 17-10-9.
 */
public class AnonymousTest2 {

    // 根据传入的性别，输出不同的语句---匿名内部类
    // 方法二：通过匿名内部类，不需要Man和Woman子类

    public void getRead(Person person){
        person.read();
    }

    public static void main(String args[]){
        AnonymousTest2 test2 = new AnonymousTest2();

        //Person 是抽象类，没有实例化对象
        test2.getRead(new Person() {
            @Override
            public void read() {
                System.out.println("我是读书的男人");
            }
        });

        test2.getRead(new Person() {
            @Override
            public void read() {
                System.out.println("我是读书的女人");
            }
        });
    }
}
