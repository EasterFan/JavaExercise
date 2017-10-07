package com.easter.zoo;

/**
 * 父类
 */
public class Animal {
    // 全部成员属性
    private String name;
    private int month;
    private String species;

    // 用于测试的静态属性和静态方法

    private static String str1 = "我是父类静态属性1";
    private static String str2 = "我是父类静态属性2";

    static {
        System.out.print("我是父类静态代码块\n");
    }

    {
        System.out.print("我是父类构造代码块\n");
    }

    // 父类构造方法不允许被重写
    public Animal(){
        System.out.print("我是父类无参构造方法\n");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
