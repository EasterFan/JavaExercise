package com.example.easter.buttondemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * 监听方法二：匿名内部类
 */

public class SecondActivity extends AppCompatActivity {

    private Button btn2;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button2);

        // 1.获取按钮对象
        btn2 = (Button)findViewById(R.id.but_02);

        // 2.按钮绑定点击事件
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SecondActivity.this, "btn2 clicked", Toast.LENGTH_SHORT).show();

                // 跳转
                Intent intent = new Intent();

                intent.setClass(SecondActivity.this,ThirdActivity.class);

                startActivity(intent);
            }
        });
    }


}
