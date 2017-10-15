package com.easter.test;

/**
 * Throws继承中的父类
 */
public class _07_ThrowsInherianceFather {

    public void fatherTest() throws NetBarAgeException {
        throw new NetBarAgeException();
    }

    public class SonNetBarAgeException extends NetBarAgeException{

    }
}
