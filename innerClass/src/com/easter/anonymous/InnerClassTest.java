package com.easter.anonymous;

/**
 * 补全Test中的匿名内部类 -- 匿名内部类接口实现
 */

interface Inner{
    void  method();
}

class Test{
    // 补全代码,用匿名内部类
    static Inner function(){
        Inner myInner = new Inner() {
            @Override
            public void method() {
                System.out.println("method run");
            }
        };
        return myInner;
    }
}

public class InnerClassTest {
    public static void main(String[] args) {
        // Test 类中有一个 function 方法, 该方法的返回值是一个 Inner 子类对象, 调用 method 方法
        Test.function().method();
    }
}

// 既没有继承也没有接口,使用匿名内部类的奇淫技巧 -- Object
class InnerTest{
    public static void main(String[] args) {

        // 所有对象都是 Object 子类
        new Object(){
            void function(){
                System.out.println("function run");
            }
        }.function();
    }
}
