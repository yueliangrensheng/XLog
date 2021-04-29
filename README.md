# XLog
> a Android Log lib

## how to use

1. app/build.gradle 配置如下：
   
```
dependencies {
   ...

   implementation 'com.yazao:xlog:1.0.1'
}
```
   
 2. init (optional)

在Application or Activity 的 onCreate()方法调用如下方法：

```
//Log init
Log.init()
    .setLogLevel(BuildConfig.DEBUG ? Log.LogLevel.FULL : Log.LogLevel.NONE)//配置显示log与否 // defalut ： LogLevel.FULL
    .setMethodCount(2)//显示方法调用层级数量  //default: 2
    .hideThreadInfo()//隐藏线程信息 // defalut: 显示线程信息
;

```

3. use
```

// example
 Log.i("I am a log");

```
