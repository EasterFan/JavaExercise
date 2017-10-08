package com.easter._01interfaceachievement;

/**
 * Created by easter on 17-10-8.
 */
public class Android implements IPhoto {

    @Override
    public void photo() {
        System.out.println("我是Android手机的拍照功能");
    }
}
