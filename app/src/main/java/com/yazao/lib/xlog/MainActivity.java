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
        Log.init()
                .setLogLevel(BuildConfig.DEBUG ? Log.LogLevel.FULL : Log.LogLevel.NONE)//配置显示log与否
                .setMethodCount(2)//显示方法调用层级数量
                .hideThreadInfo()//隐藏线程信息
        ;


        //example
        Log.i("i am a log");
    }
}
