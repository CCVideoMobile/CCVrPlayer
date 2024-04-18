package com.bokecc.ccsskt.example;

import android.app.Application;

import com.bokecc.common.application.ApplicationData;
import com.bokecc.common.crash.CCCrashManager;

/**
 * Application
 */
public class CCApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //公共库初始化
        ApplicationData.getInstance().init(this,true);
    }

    /**
     * 程序终止的时候执行
     */
    @Override
    public void onTerminate() {
        super.onTerminate();
        ApplicationData.getInstance().onTerminate();
    }

}
