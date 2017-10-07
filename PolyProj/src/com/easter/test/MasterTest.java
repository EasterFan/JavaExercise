package com.easter.test;

import com.easter.zoo.Cat;
import com.easter.zoo.Dog;
import com.easter.zoo.Master;

/**
 * Created by easter on 17-10-7.
 */
public class MasterTest {
    public static void main(String args[]){
        Master master = new Master();

        // 根据喂养的对象，决定饭后活动
        Cat cat = new Cat();
        Dog dog = new Dog();

        master.feed(cat);
        master.feed(dog);

        // 根据主人时间判断该养哪种宠物
        boolean isManyTime = true;
        master.raise(isManyTime);
    }
}
