package com.easter._04interfaceinherihance;

/**
 * 接口多继承案例
 * 实现子接口的实现类要实现该子接口和其所有父接口的抽象方法
 */
public class InterfaceInherihance implements ISon1 {
    @Override
    public void IFather2_run() {
        System.out.println("我是实现ISon接口的实现类，我重写了IFather2_run");
    }

    @Override
    public void IFather_run() {
        System.out.println("我是实现ISon接口的实现类，我重写了IFather_run");
    }

    @Override
    public void ISon_run() {
        System.out.println("我是实现ISon接口的实现类，我重写了ISon_run");
    }
}
