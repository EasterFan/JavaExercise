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
