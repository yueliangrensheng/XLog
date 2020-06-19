# XLog
> a Android Log lib

# how to use

- 1. first init (optional)
```
//在Application  or Activity 的 onCreate()方法调用如下方法

//Log init
Log.init()
    .setLogLevel(BuildConfig.DEBUG ? Log.LogLevel.FULL : Log.LogLevel.NONE)//配置显示log与否
    .setMethodCount(2)//显示方法调用层级数量
    .hideThreadInfo()//隐藏线程信息
;

```
