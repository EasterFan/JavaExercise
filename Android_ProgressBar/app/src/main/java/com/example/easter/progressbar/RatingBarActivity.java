package com.example.easter.progressbar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.RatingBar;
import android.widget.Toast;

/**
 * RatingBar的监听器
 */

public class RatingBarActivity extends AppCompatActivity {
    private RatingBar star;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progressbar);

        star = (RatingBar)findViewById(R.id.star);
        star.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                //1.当前绑定的bar对象
                //2.当前评分的进度
                //3.是否来自用户
                Toast.makeText(RatingBarActivity.this, "评分完成", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
