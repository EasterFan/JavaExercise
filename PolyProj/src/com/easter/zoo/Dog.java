package com.easter.zoo;

/**
 * Created by easter on 17-10-7.
 */
public class Dog extends Animal {
    // 狗类特有属性：性别
    private String sex;

    public Dog(){

    }

    public Dog(String name,int age,String sex){
        super(name,age);
        this.setSex(sex);

    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    // 狗类特有方法：睡觉
    public void sleep(){
        System.out.print("我是子类狗的特有睡觉方法\n");
    }

    // 狗类重写父类eat方法

    public void eat(){
        System.out.print("我是子类狗，我重写了父类的eat方法\n");
    }


}
