package com.easter.test;

/**
 * 异常链
 */
public class _06_ThroableLine {
    public static void main(String args[]){
        try {
            test3();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void test1() throws NetBarAgeException {
        throw new NetBarAgeException();
    }

    public static void test2() throws Exception {
        try {
            test1();
        } catch (NetBarAgeException e) {
            throw new Exception("我是test2中抛出的异常",e);
        }
    }

    public static void test3() throws Exception {
        try {
            test2();
        } catch (Exception e) {

            // 封装前两个异常
            Exception e1 = new Exception("我是test3中抛出的异常");
            e1.initCause(e);
            throw e1;



//            throw new Exception("我是test3中抛出的异常");
        }

    }
}
