package com.easter.test;

import com.easter._02interfacemember.Android;
import com.easter._02interfacemember.INet;

/**
 * 接口成员的组成和调用
 */
public class _02Member {
    public static void main(String args[]){

        // 5. 接口实例
        INet iNet = new Android();

        // 接口常量：接口名调用
        String str = INet.str;
        // 接口常量：接口实例调用
        String str2 = iNet.str;
        System.out.print("============");


        // 静态方法：只能由接口名调用
        INet.stop();
        System.out.print("============");

        // 默认方法：通过接口实例调用
        iNet.network();
        // 默认方法：通过接口名调用
//        INet.super.network();   // 为什么报错？

    }
}
