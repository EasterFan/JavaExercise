package com.example.easter.togglebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ToggleButton;

/**
 * 点击ToggleButton，图片改变
 */
public class TogglebtnActivity extends AppCompatActivity {
    private ToggleButton tb;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_togglebtn);
        tb = (ToggleButton) findViewById(R.id.tb);
        imageView = (ImageView) findViewById(R.id.imageView);

        tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tb.isChecked()){
                    Toast.makeText(TogglebtnActivity.this, tb.getText(), Toast.LENGTH_SHORT).show();
                    imageView.setImageResource(R.drawable.bg3);
                }else {
                    Toast.makeText(TogglebtnActivity.this, tb.getText(), Toast.LENGTH_SHORT).show();
                    imageView.setImageResource(R.drawable.bg2);
                }
            }
        });
    }
}