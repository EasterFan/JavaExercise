package com.easter.member;

/**
 * Created by easter on 17-10-8.
 */

// 外部类
public class Person {
    private int age;


    // 获取内部类的方法
    public Heart getHeart(){
        return new Heart();
    }

    //成员内部类  设为public为了跨包测试
    public class Heart{
        public String beat(){
            String str = "心脏在跳动";
            return str;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class MemberTest {
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

