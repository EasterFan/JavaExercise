package com.example.easter.radiobutton;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * 单选RadioButton实现监听，单选性别男女
 */

public class RadioButtonActivity extends AppCompatActivity {

    private RadioButton rb_man,rb_woman;
    private RadioGroup rg;
    private MyRadioButtonListener myRadioButtonListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radiobutton);
        initView();
        setListener();
    }

    private void initView(){
        rb_man = (RadioButton) findViewById(R.id.rb_man);
        rb_woman = (RadioButton) findViewById(R.id.rb_woman);
        rg = (RadioGroup) findViewById(R.id.rg_sex);
    }

    // 监听器绑在RadioGroup上，而不是RadioButton
    private void setListener(){
        myRadioButtonListener = new MyRadioButtonListener();
        rg.setOnCheckedChangeListener(myRadioButtonListener);

    }

    private class MyRadioButtonListener implements RadioGroup.OnCheckedChangeListener{

        @Override
        public void onCheckedChanged(RadioGroup radioGroup, @IdRes int checkedId) {

            // 选中状态改变时被触发
            switch (checkedId){
            case R.id.rb_man:
                Log.i("sex","当前用户的选择为："+rb_man.getText().toString());
                Toast.makeText(RadioButtonActivity.this, "当前用户的选择为："+rb_man.getText().toString(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.rb_woman:
                Log.i("sex","当前用户的选择为："+rb_woman.getText().toString());
                Toast.makeText(RadioButtonActivity.this, "当前用户的选择为："+rb_woman.getText().toString(), Toast.LENGTH_SHORT).show();
                break;
        }
        }
    }

}
