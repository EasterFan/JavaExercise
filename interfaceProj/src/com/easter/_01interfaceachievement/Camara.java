package com.easter._01interfaceachievement;

/**
 * Created by easter on 17-10-8.
 */
public class Camara implements IPhoto{
    @Override
    public void photo() {
        System.out.println("我是Camara相机的拍照功能");
    }
}
