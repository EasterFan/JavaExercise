package com.easter.test;

import com.easter._01interfaceachievement.Android;
import com.easter._01interfaceachievement.Camara;
import com.easter._01interfaceachievement.IPhoto;

/**
 * Created by easter on 17-10-8.
 */
public class _01AchievementTest {
    public static void main(String args[]){
        // 接口引用指向Android/Camara等使用接口的类
        IPhoto ip_Android = new Android();
        // 接口对象只能调用接口中的方法，不能调用Android中的其他方法
        ip_Android.photo();


        IPhoto ip_Camara = new Camara();
        ip_Camara.photo();
    }
}
