package com.yazao.lib.xlog;

import android.os.Bundle;

import com.yazao.lib.xlog.demo.R;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Log日志
        Log.init().setLogLevel(BuildConfig.DEBUG ? Log.LogLevel.FULL : Log.LogLevel.NONE).setMethodCount(2).hideThreadInfo();



        Log.i("i am a log");
    }
}
