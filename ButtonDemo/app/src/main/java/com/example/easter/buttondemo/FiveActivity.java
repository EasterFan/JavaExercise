package com.example.easter.buttondemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * 多个按钮使用同一个监听器，使用成员内部类通过switch方法，用id区别
 */

public class FiveActivity extends AppCompatActivity {
    private Button btn1,btn2,btn3;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_buttons);

        // 获取按钮对象
        btn1 = (Button)findViewById(R.id.button1);
        btn2 = (Button)findViewById(R.id.button2);
        btn3 = (Button)findViewById(R.id.button3);

        MyBtnsListener mybtns = new MyBtnsListener();
        btn1.setOnClickListener(mybtns);
        btn2.setOnClickListener(mybtns);
        btn3.setOnClickListener(mybtns);
    }

    class MyBtnsListener implements View.OnClickListener{
        @Override
        // 传入的view是指监听的对象
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.button1:
                    Toast.makeText(FiveActivity.this, "这是同组的第一个按钮", Toast.LENGTH_SHORT).show();
                case R.id.button2:
                    Toast.makeText(FiveActivity.this, "这是同组的第二个按钮", Toast.LENGTH_SHORT).show();
                case R.id.button3:
                    Toast.makeText(FiveActivity.this, "这是同组的第三个按钮", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
