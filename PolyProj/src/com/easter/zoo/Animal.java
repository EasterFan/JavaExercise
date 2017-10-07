package com.easter.zoo;

/**
 * Created by easter on 17-10-7.
 */
public class Animal {
    // 公共属性：姓名，年龄
    private String name;
    private int age;

    public Animal(){

    }

    public Animal(String name,int age){
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //公共方法：吃
    public void eat(){
        System.out.print("我是父类吃东西\n");
    }
}
