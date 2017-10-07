package com.easter.singleton;

/**
 * 单例模式-饿汉式：创建对象实例时立刻初始化   空间换时间
 */
public class SingletonHunger {
    // 1. 创建私有构造方法
    private SingletonHunger(){

    }

    // 2. 创建该类私有静态实例
    private static SingletonHunger Hunger = new SingletonHunger();

    // 3. 创建公有静态方法，返回静态实例
    public static SingletonHunger getHunger(){

        return Hunger;
    }


}
