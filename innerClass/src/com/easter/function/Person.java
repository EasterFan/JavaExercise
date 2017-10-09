package com.easter.function;

/**
 * Created by easter on 17-10-9.
 */
public class Person {
    public int age;

    public void eat(){
        System.out.println("我是person类方法");
    }

    public Object getHeart(){

        // 方法内部类 设为public为了跨包测试
        class Heart{

            public void say(){
                System.out.println("我是方法内部类中的say方法");
            }
            public String beat(){
                String str = "心脏在跳动";
                return str;
            }
        }
        // 因为方法内部类中的方法，无法被外部类直接访问，故方法内部类返回时会直接返回方法
        return new Heart().beat();
    }

}
