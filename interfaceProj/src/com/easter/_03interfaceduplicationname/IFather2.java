package com.easter._03interfaceduplicationname;

/**
 * Created by easter on 17-10-8.
 */
public interface IFather2 {

    String sameStr = "我是IFather2同名变量";

    //两个接口中同名默认方法
    default void fatherSame(){
        System.out.println("我是IFather2中的重名默认方法");
    }
}
