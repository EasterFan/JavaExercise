package com.example.easter.easter_ui;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * 为checkbox添加监听器OnCheckedChangeListener
 */

public class CheckBoxActivity extends AppCompatActivity {

    private CheckBox cb1, cb2, cb3, cb4;
    private Button btn_all, btn_none,btn_getResult;
    private TextView showResult;
    private List<String> lists;

    private MyCheckBoxListener mylistener;
    private MyButtonLisener mybtnlistener;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);
        initView();
        // 初始化/生成集合对象
        initDate();
        setListener();
    }

    /**
     * 初始化集合对象
     */
    private void initDate(){
        lists = new ArrayList<>();
    }

    /**
     * 初始化控件
     */
    private void initView() {

        cb1 = (CheckBox) findViewById(R.id.cb1);
        cb2 = (CheckBox) findViewById(R.id.cb2);
        cb3 = (CheckBox) findViewById(R.id.cb3);
        cb4 = (CheckBox) findViewById(R.id.cb4);
        btn_all = (Button)findViewById(R.id.btn_all);
        btn_none = (Button)findViewById(R.id.btn_none);
        btn_getResult = (Button)findViewById(R.id.btn_getResult);
        showResult = (TextView)findViewById(R.id.showResult);
    }

    /**
     * 添加监听器
     */
    private void setListener(){
        mylistener = new MyCheckBoxListener();
        mybtnlistener = new MyButtonLisener();

        // checkbox添加监听器
        cb1.setOnCheckedChangeListener(mylistener);
        cb2.setOnCheckedChangeListener(mylistener);
        cb3.setOnCheckedChangeListener(mylistener);
        cb4.setOnCheckedChangeListener(mylistener);

        // 三个按钮监听器
        btn_all.setOnClickListener(mybtnlistener);
        btn_none.setOnClickListener(mybtnlistener);
        btn_getResult.setOnClickListener(mybtnlistener);

    }

    class MyCheckBoxListener implements CompoundButton.OnCheckedChangeListener {

        /**
         * 当选中状态发生变化时触发
         *
         * @param compoundButton
         * @param ischecked
         */
        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean ischecked) {
            // 传入的参数CompoundButton是checkbox的父类，我们操作的是checkbox，需要先向下转型
            CheckBox checkbox = (CheckBox) compoundButton;

            switch (checkbox.getId()) {
                case R.id.cb1:
                    if(ischecked){
                    Toast.makeText(CheckBoxActivity.this, "东篱把酒黄昏后"+ischecked, Toast.LENGTH_SHORT).show();
                    cb1.setTextColor(Color.RED);
                    }else{
                        cb1.setTextColor(Color.BLACK);
                    }
                    break;
                case R.id.cb2:
                    Toast.makeText(CheckBoxActivity.this, "北国的雪"+ischecked, Toast.LENGTH_SHORT).show();
                    break;
                case R.id.cb3:
                    Toast.makeText(CheckBoxActivity.this, "南疆的土"+ischecked, Toast.LENGTH_SHORT).show();
                    break;
                case R.id.cb4:
                    Toast.makeText(CheckBoxActivity.this, "西边吹来的风"+ischecked, Toast.LENGTH_SHORT).show();
            }
        }
    }

    class MyButtonLisener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btn_all:
                    cb1.setChecked(true);
                    cb2.setChecked(true);
                    cb3.setChecked(true);
                    cb4.setChecked(true);

                    break;
                case R.id.btn_none:
                    cb1.setChecked(false);
                    cb2.setChecked(false);
                    cb3.setChecked(false);
                    cb4.setChecked(false);

                    break;
                case R.id.btn_getResult:
                    // 将选中的结果存放到lists中
                    if(cb1.isChecked()){
                        lists.add(cb1.getText().toString());
                    }
                    if(cb2.isChecked()){
                        lists.add(cb2.getText().toString());
                    }
                    if(cb3.isChecked()){
                        lists.add(cb3.getText().toString());
                    }
                    if(cb4.isChecked()){
                        lists.add(cb4.getText().toString());
                    }

                    // 将lists结果显示到textView上
                    showResult.setText(lists.toString());
                    lists.clear();
                    break;
            }
        }
    }
}
