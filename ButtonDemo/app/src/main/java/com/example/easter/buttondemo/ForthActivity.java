package com.example.easter.buttondemo;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/**
 * 第四种监听方法：通过XML布局文件定义onClick属性
 * 最简单最不常用的方法
 */

public class ForthActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button4);
    }

    // 这里要传入View对象，自定义的MyOnClick方法相当于OnClick方法
    public void MyOnClick(View view){
        Toast.makeText(this, "btn4 clicked", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent();
        // 调用setClass方法设置启动哪一个Activity
        intent.setClass(ForthActivity.this,FiveActivity.class);
        // 调用startActivity
        startActivity(intent);

    }
}
