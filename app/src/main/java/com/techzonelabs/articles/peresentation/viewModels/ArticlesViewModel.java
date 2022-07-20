package com.techzonelabs.articles.peresentation.viewModels;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.techzonelabs.articles.MyApplication;
import com.techzonelabs.articles.data.ArticlesApi;
import com.techzonelabs.articles.data.Resource;
import com.techzonelabs.articles.data.models.Result;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;


public class ArticlesViewModel extends AndroidViewModel {

    private final String TAG = "ArticlesViewModel";
    @Inject
    ArticlesApi api;

    public MutableLiveData<Resource> liveData;

    public ArticlesViewModel(@NonNull Application application) {
        super(application);
        liveData = new MutableLiveData<>();
        ((MyApplication)application).getApiComponent().inject(ArticlesViewModel.this);
    }

    public void makeCall() {
        liveData.postValue(new Resource.Loading());
        Observable<Result> observable = api
                .getArticles()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
        Observer<Result> observer = new Observer<Result>() {
            @Override
            public void onSubscribe(Disposable d) {
            }

            @Override
            public void onNext(Result result) {
            liveData.postValue(new Resource.Success<>(result));
                Log.d(TAG, "onNext: Result" + result.toString());
            }

            @Override
            public void onError(Throwable e) {
                liveData.postValue(new Resource.Error<>(e.getMessage()));
                Log.d(TAG, "onError: Call Api Error" + e.getMessage());
            }

            @Override
            public void onComplete() {

            }
        };
        observable.subscribe(observer);
    }

}
