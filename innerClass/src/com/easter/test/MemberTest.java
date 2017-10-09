package com.easter.test;

import com.easter.member.Person;

/**
 * Created by easter on 17-10-8.
 */
public class MemberTest {
    public static void main(String args[]){
        Person tom = new Person();
        tom.setAge(20);

        // 获取内部类对象实例  方法一：new 外部类 new 内部类
        Person.Heart myheart = new Person().new Heart();
        String str = myheart.beat();
        System.out.println(str);

        // 获取内部类对象实例  方法二：外部类对象.new 内部类
        Person.Heart myheart2 = tom.new Heart();
        String str2 = myheart2.beat();
        System.out.println(str2);

        // 获取内部类对象实例  方法三：外部类对象.getHeart()
        Person.Heart myheart3 = tom.getHeart();
        String str3 = myheart3.beat();
        System.out.println(str3);
    }
}

