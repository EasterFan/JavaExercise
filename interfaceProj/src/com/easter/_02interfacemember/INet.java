package com.easter._02interfacemember;

/**
 * 一个接口有五部分组成：常量，抽象方法，默认方法，静态方法，接口实例
 */
public interface INet {
    // 1. 默认为常量加上修饰符：public static final
    String str = "我是接口常量";

    // 2. 默认为方法加上修饰符：public abstract
    void net();

    // 3. default 默认方法 可以带方法体
    default void network(){
        System.out.print("我是接口中的默认方法");
    }

    // 4. static 静态方法 可以带方法体
    static void stop(){
        System.out.print("我是接口中的静态方法");
    }
}
