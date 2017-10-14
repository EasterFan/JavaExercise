package com.example.easter.datechooser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class DateChooseActivity extends AppCompatActivity {
    private TimePicker time;
    private DatePicker date;
    private TextView text;
    private int Year,Month,Day,Hour,Minute;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datechooser);

        initView();
        getCurrentTime();
        initPicker();

    }



    private void initView(){
        time = (TimePicker)findViewById(R.id.time);
        date = (DatePicker) findViewById(R.id.date);
        text = (TextView) findViewById(R.id.text);
    }

    /**
     * 获取系统当前时间
     */
    private void getCurrentTime(){
        Calendar calendar = Calendar.getInstance();
        Year = calendar.get(Calendar.YEAR);
        Month = calendar.get(Calendar.MONTH);
        Day = calendar.get(Calendar.DAY_OF_MONTH);
        Hour = calendar.get(Calendar.HOUR);
        Minute = calendar.get(Calendar.MINUTE);
    }

    private void initPicker(){
        //设置时间选择器为24小时制
        time.setIs24HourView(true);
        //设置时间选择器为当前时间
        time.setCurrentHour(Hour);
        time.setCurrentMinute(Minute);
        time.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker timePicker, int i, int i1) {
                Toast.makeText(DateChooseActivity.this, "时间监听器", Toast.LENGTH_SHORT).show();
            }
        });


        date.init(Year, Month, Day, new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker datePicker, int i, int i1, int i2) {
                Toast.makeText(DateChooseActivity.this, "日期监听器", Toast.LENGTH_SHORT).show();
            }
        });
    }


}


