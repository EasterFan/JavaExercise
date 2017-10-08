package com.easter.test;

import com.easter._03interfaceduplicationname.IFather1;
import com.easter._03interfaceduplicationname.Son;

/**
 * Created by easter on 17-10-8.
 */
public class _03Duplication {
    public static void main(String args[]){
        IFather1 son = new Son();
        Son son1 = new Son();

        // 父类，两个接口同名默认方法
        son.fatherSame();

        // 父类，两个接口同名变量
        String sameStr = son1.sameStr;
        System.out.println(sameStr);



    }

}
