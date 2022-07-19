package com.techzonelabs.articles.data;

import com.techzonelabs.articles.data.models.Result;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface ArticlesApi {

    @GET("svc/topstories/v2/home.json?api-key=VZZ5mGMGPRy4yuoCiVvChq9VNCbhG29n")
    public Observable<Result> getArticles();
}
