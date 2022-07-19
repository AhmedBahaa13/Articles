package com.techzonelabs.articles;

import android.app.Application;

import com.techzonelabs.articles.di.ApiComponent;
import com.techzonelabs.articles.di.ApiModule;
import com.techzonelabs.articles.di.DaggerApiComponent;

public class MyApplication extends Application {

    private ApiComponent mApiComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mApiComponent = DaggerApiComponent.builder()
                .apiModule(new ApiModule())
                .build();
    }

    public ApiComponent getApiComponent() {
        return mApiComponent;
    }
}
