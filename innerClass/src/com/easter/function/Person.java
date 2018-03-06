package com.easter.function;

/**
 * Created by easter on 17-10-9.
 */
public class Person {
    public int age=5;

    public void eat(){
        System.out.println("我是person类方法");
    }

    public Object getHeart(){

        int y = 4;
        int x = 3;

        // 方法内部类 设为public为了跨包测试
        class Heart{

            public String beat(){
                String str = "心脏在跳动";
                int y = 44;

                // 只能访问被final修饰的局部变量.
                System.out.println("局部内部类访问类外final 成员"+y+age);
                System.out.println("局部内部类访问类外final 成员"+x);
                return str;
            }
        }
        // 因为方法内部类中的方法，无法被外部类直接访问，故方法内部类返回时会直接返回方法
        return new Heart().beat();
    }

}

class FunctionTest {
    public static void main(String args[]){

        Person tom = new Person();
        Object str = tom.getHeart();

        System.out.println(str);
    }
}
