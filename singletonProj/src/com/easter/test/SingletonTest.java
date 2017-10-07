package com.easter.test;

import com.easter.singleton.SingletonHunger;
import com.easter.singleton.SingletonLazy;

/**
 * 创建多个对象，如果返回的是同一个对象，测试通过
 */
public class SingletonTest {
    public static void main(String args[]){
        SingletonHunger hunger1 = SingletonHunger.getHunger();
        SingletonHunger hunger2 = SingletonHunger.getHunger();

        SingletonLazy lazy1 = SingletonLazy.getLazy();
        SingletonLazy lazy2 = SingletonLazy.getLazy();

        System.out.print(hunger1==hunger2);// true，说明引用地址相同
        System.out.print(lazy1==lazy2);// true，说明引用地址相同
    }

}
