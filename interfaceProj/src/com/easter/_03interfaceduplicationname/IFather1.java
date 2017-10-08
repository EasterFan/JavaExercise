package com.easter._03interfaceduplicationname;

/**
 * Created by easter on 17-10-8.
 */
public interface IFather1 {

    String sameStr = "我是IFather1同名变量";

    //两个父接口中同名默认方法
    default void fatherSame(){
        System.out.println("我是IFather1中的重名默认方法");
    }
}
