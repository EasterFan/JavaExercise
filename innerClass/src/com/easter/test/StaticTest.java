package com.easter.test;

import com.easter.staticinner.Person;

/**
 * Created by easter on 17-10-9.
 */
public class StaticTest {
    public static void main(String args[]){
        // 获取静态内部类实例对象
        Person.Heart myheart = new Person.Heart();
        myheart.beat();
    }
}
