package com.easter.test;

import com.easter.zoo.Animal;
import com.easter.zoo.Cat;
import com.easter.zoo.Dog;

/**
 * Created by easter on 17-10-7.
 */
public class PolyTest {
    public static void main(String args[]){
        Animal animal = new Animal();

        // 向上转型：把子类对象赋给父类引用
        Animal cat_up = new Cat();
        Animal dog_up = new Dog();


        animal.eat();
        cat_up.eat();
        dog_up.eat();
        System.out.print("====================\n");
        // 向上转型的animal_cat不能再调用自己的run()方法了
        // .run();


        // 向下转型，大类转小类，向上转型的还原，只有原来是小类的，才可以被强转还原成小类
        if(cat_up instanceof Cat){
            Cat cat_down = (Cat) cat_up;
            cat_down.eat();
            cat_down.run();
            System.out.print("cat_up可以向下转型为Cat\n");
        }


        if(animal instanceof Cat){
            Cat cat_down_animal = (Cat)animal;  //animal原来是大类，不能强转成小类
            cat_down_animal.run();
            cat_down_animal.eat();
            System.out.print("animal可以向下转型为Cat\n");
        }


        if(dog_up instanceof Cat){
            Cat cat_down_dog = (Cat)dog_up;    // dog_up原来是Dog类，不能强转成Cat类
            cat_down_dog.eat();
            cat_down_dog.run();
            System.out.print("dog_up可以向下转型为Cat\n");
        }


    }
}
