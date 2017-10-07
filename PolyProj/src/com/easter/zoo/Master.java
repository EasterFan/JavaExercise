package com.easter.zoo;

/**
 * 一个多态的案例
 */
public class Master {
    /**
     * 完成效果：主人有一个喂宠物的方法
     * 喂猫：吃完东西后，主人带猫跑步
     * 喂狗：吃完东西后，主人带狗睡觉
     * 实现：向下转型
     */
    public void feed(Animal animal){
        if(animal instanceof Cat){
            Cat cat = (Cat)animal;
            cat.eat();
            cat.run();
        }else if(animal instanceof Dog){
            Dog dog = (Dog)animal;
            dog.eat();
            dog.sleep();
        }
    }


    /**
     *
     * @param isManyTime
     * @return
     */
    public Animal raise(boolean isManyTime){
        Animal animal;
        if(isManyTime == true){
            animal = new Dog();
            System.out.println("时间多，养狗");
        }else {
            animal = new Cat();
            System.out.println("时间少，养猫");
        }

        return animal;
    }
}
