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
        XLog.init().setLogLevel(BuildConfig.DEBUG ? XLog.LogLevel.FULL : XLog.LogLevel.NONE).setMethodCount(2).hideThreadInfo();



        XLog.i("i am a log");
    }
}
