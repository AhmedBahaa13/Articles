package com.techzonelabs.articles.di;

import com.google.gson.Gson;
import com.techzonelabs.articles.data.ArticlesApi;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class ApiModule {
    String mBaseUrl = "https://api.nytimes.com/";

    @Provides
    @Singleton
    Retrofit provideRetrofit() {
        return new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl(mBaseUrl)
                .build();
    }
    @Provides
    @Singleton
    ArticlesApi provideServiceApi(Retrofit retrofit) {
        return retrofit.create(ArticlesApi.class);
    }
}
