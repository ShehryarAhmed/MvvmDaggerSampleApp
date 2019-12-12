package com.dotinfiny.mvvmexampleapp.base;

import android.app.Application;
import android.content.Context;
import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    private Application application;
    public ApplicationModule(Application application) {
    }

    @Provides
    Context provideApplicationContext(){
        return application;
    }
}
