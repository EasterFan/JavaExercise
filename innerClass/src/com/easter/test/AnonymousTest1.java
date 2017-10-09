package com.easter.test;

import com.easter.anonymous.Man;
import com.easter.anonymous.Person;
import com.easter.anonymous.Woman;

/**
 * Created by easter on 17-10-9.
 */
public class AnonymousTest1 {
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
