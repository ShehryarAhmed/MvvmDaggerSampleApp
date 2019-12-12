package com.dotinfiny.mvvmexampleapp.base;

import android.app.Application;
import dagger.android.DaggerActivity;
import dagger.android.DaggerApplication;
import dagger.android.support.DaggerAppCompatActivity;

public class MyApplication extends Application {

    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }
}
