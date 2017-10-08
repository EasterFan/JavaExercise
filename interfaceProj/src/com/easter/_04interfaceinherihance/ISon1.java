package com.easter._04interfaceinherihance;

/**
 * 接口多继承案例
 * 当两个父接口中出现同名默认方法时，子接口需要重写这个默认方法
 */
public interface ISon1 extends IFather1,IFather2 {
    void ISon_run();

}
