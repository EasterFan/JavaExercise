package com.easter.staticinner;

/**
 * Created by easter on 17-10-9.
 */
public class Person {
    private int age;

    public void eat(){

    }


    // 获取内部类的方法
    public Heart getHeart(){
        return new Heart();
    }

    //静态内部类
    public static class Heart{
        public void beat(){

            // 通过对象实例调用外部类方法
            new Person().eat();

            String str = "心脏在跳动";
            System.out.println(str);

        }
    }
}
