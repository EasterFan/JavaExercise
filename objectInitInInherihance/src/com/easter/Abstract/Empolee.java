package com.easter.Abstract;

/**
 * 抽象类:Pro 和 Manager 继承 Empolee,
 * Pro 工资为pay, Manager 工资为 bonus
 */
public abstract class Empolee {
    String name;
    int age;

    Empolee(String name,int age){
        this.name = name;
        this.age = age;
    }

   abstract void work();
}



class Pro extends Empolee{
    int pay;

    Pro(String name,int age,int pay){
        super(name,age);
        this.pay = pay;
    }

    @Override
    void work() {
        System.out.println("Pro work");
    }
}

class Manager extends Empolee{
    int bonus;

    Manager(String name,int age,int bonus){
        super(name,age);
        this.bonus = bonus;
    }

    @Override
    void work() {
        System.out.println("Manager work");
    }


    public static void main(String[] args) {
        Pro pro = new Pro("pro",12,10);
        Manager manager = new Manager("manager",22,11);

        pro.work();
        manager.work();
    }
}
