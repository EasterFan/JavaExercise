package com.easter._03interfaceduplicationname;

/**
 * 多接口默认方法重名，常量重名
 */
public class Son extends Father implements IFather1,IFather2{

   public String sameStr = "我是子类同名变量";


    //实现类需要重写两个父接口中同名默认方法，不写的话，优先调用父类同名默认方法
//    public void fatherSame(){
//        System.out.println("我是子类中的重名默认方法");
//    }


}
