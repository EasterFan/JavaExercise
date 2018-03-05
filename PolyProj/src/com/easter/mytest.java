package com.easter;

/**
 * 多态 -- Object向下转型
 */

class MyDemo{

    /**
     * 重写 equals
     */
    int num;

    MyDemo(int num){
        this.num = num;
    }

    public boolean equals(Object obj){

        // obj 向下转型为 demo,因为 obj 中没有num属性, MyDemo中有 num
        if(!(obj instanceof MyDemo))
            return false;
        MyDemo demo = (MyDemo) obj;
        return this.num == demo.num;
    }
}

public class mytest {
    public static void main(String[] args) {
        MyDemo d1 = new MyDemo(4);
        MyDemo d2 = new MyDemo(4);
        // 重写后对象只比较值,而非堆内存地址
        System.out.println(d1.equals(d2));
    }

}
