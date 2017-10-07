package com.easter.zoo;

/**
 * Created by easter on 17-10-7.
 */
public class Cat extends Animal {

    // 子类属性：体重
    private double weight;

    public Cat(){

    }

    public Cat(String name,int age,double weight){
        super(name,age);
        this.setWeight(weight);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // 子类方法：跑动
    public void run(){
        System.out.print("我是子类猫特有的跑步方法\n");
    }

    // 子类吃东西（重写父类吃东西）
    public void eat(){
        System.out.print("我是子类猫，我重写了父类的eat方法\n");
    }
}
