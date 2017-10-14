package com.example.easter.progressbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

/**
 * progressBar三种进度条
 */
public class ProgressBarActivity extends AppCompatActivity {

    private ProgressBar bar;
    private Button btn01,btn02;
    private MyBtnListener myBtnListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progressbar);
        initView();
        addListener();

    }

    /**
     * 初始化组件
     */
    private void initView(){
        // 获取对象
        btn01 = (Button) findViewById(R.id.btn_01);
        btn02 = (Button) findViewById(R.id.btn_02);
        bar = (ProgressBar) findViewById(R.id.bar);

        // 初始化progressBar
        bar.setMax(100);
        bar.setProgress(10);
        bar.setSecondaryProgress(20);
    }


    class MyBtnListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btn_01:
                bar.incrementProgressBy(20);
                    break;
                case R.id.btn_02:
                bar.incrementSecondaryProgressBy(40);
                    break;
            }
        }
    }

    /**
     * 添加监听器
     */
    private void addListener(){
        myBtnListener = new MyBtnListener();
        btn01.setOnClickListener(myBtnListener);
        btn02.setOnClickListener(myBtnListener);
    }

}
