package com.example.easter.buttondemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * 第三种监听方法：Activity直接实现监听器接口
 * 当界面元素比较复杂时，不建议采取此方法
 */

// 让Activity实现接口
public class ThirdActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn3;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button3);

        btn3 = (Button)findViewById(R.id.but_03);
        // 传入当前对象
        btn3.setOnClickListener(this);

    }

    public void onClick(View view){
        Toast.makeText(this, "button3 clicked", Toast.LENGTH_SHORT).show();
        // 跳转
        Intent intent = new Intent();

        intent.setClass(ThirdActivity.this,ForthActivity.class);

        startActivity(intent);
    }

}
