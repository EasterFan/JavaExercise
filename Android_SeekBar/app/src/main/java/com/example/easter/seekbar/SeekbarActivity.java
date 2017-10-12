package com.example.easter.seekbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.SeekBar;

public class SeekbarActivity extends AppCompatActivity {
    private SeekBar seek;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekbar);

        seek = (SeekBar) findViewById(R.id.seek);
        // 最大拖动进度
        seek.setMax(100);
        //当前进度
        seek.setProgress(30);

        seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            /**
             * 拖动过程中触发
             * 1.当前绑定的seekBar对象
             * 2.当前进度数值
             * 3.是否为用户手动触发
             */
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                Log.i("progress",seekBar.getProgress()+"");
            }

            @Override
            /**
             * 开始拖动时触发
             */
            public void onStartTrackingTouch(SeekBar seekBar) {
                Log.i("progress","开始"+seekBar.getProgress()+"");
            }

            @Override
            /**
             * 结束拖动触发
             */
            public void onStopTrackingTouch(SeekBar seekBar) {
                Log.i("progress","结束"+seekBar.getProgress()+"");
            }
        });
    }
}
