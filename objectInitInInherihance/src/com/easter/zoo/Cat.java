package com.easter.zoo;

/**
 * 子类
 */
public class Cat extends Animal {
    private double weight;
    public int temp = 11;
    public static String str3 = "我是子类静态属性1";
    public static String str4 = "我是子类静态属性2";

    static {
        System.out.print("我是子类静态代码块\n");
    }

    {
        System.out.print("我是子类构造代码块\n");
    }

    public Cat(){
        System.out.print("我是子类无参构造方法\n");
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
