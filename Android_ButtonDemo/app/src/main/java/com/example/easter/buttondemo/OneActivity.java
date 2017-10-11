package com.example.easter.buttondemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * 方法一：成员内部类
 */
public class OneActivity extends AppCompatActivity {

    private Button btn_01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 1.获取布局文件
        setContentView(R.layout.activity_button1);
        // 2. 获取按钮对象
        btn_01 = (Button) findViewById(R.id.but_01);
        // 3. 创建监听器对象
        MyButtonListener mybuttonlistener = new MyButtonListener();
        // 4. 按钮绑定监听事件
        btn_01.setOnClickListener(mybuttonlistener);
    }

    class MyButtonListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            // 绑定的按钮被点击时调用，view为绑定的控件
            // 吐司
            Toast.makeText(OneActivity.this, "button 1 clicked", Toast.LENGTH_SHORT).show();

            // 实现跳转
            // 创建一个intent对象
            Intent intent = new Intent();
            // 调用setClass方法设置启动哪一个Activity
            intent.setClass(OneActivity.this,SecondActivity.class);
            // 调用startActivity
            startActivity(intent);
        }
    }

}
