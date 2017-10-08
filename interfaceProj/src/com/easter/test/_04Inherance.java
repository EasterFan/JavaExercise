package com.easter.test;

import com.easter._04interfaceinherihance.ISon1;
import com.easter._04interfaceinherihance.InterfaceInherihance;

/**
 * Created by easter on 17-10-8.
 */
public class _04Inherance {
    public static void main(String args[]){
        // 接口实例
        ISon1 son = new InterfaceInherihance();


        //子接口自己的抽象方法
        son.ISon_run();
        // 子接口重写的父接口的抽象方法
        son.IFather_run();
        son.IFather2_run();
    }
}
