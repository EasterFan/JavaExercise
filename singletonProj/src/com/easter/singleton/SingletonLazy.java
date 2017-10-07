package com.easter.singleton;

/**
 * 单例模式-懒汉式：创建对象实例时不立刻初始化，在开放的静态方法中实例化   时间换空间
 */
public class SingletonLazy {
    //1. 创建私有构造方法
    private SingletonLazy(){

    }

    //2. 创建静态的该类的实例对象
    private static SingletonLazy lazy = null;

    //3. 创建开放的静态方法提供实例对象
    public static SingletonLazy getLazy(){
        // 第一次获取时是null，因为是静态的，以后再调取就不是null了，故加此判断
        if(lazy == null)
            lazy = new SingletonLazy();

        return lazy;
    }
}
