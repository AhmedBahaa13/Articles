package com.techzonelabs.articles.di;

import com.techzonelabs.articles.peresentation.viewModels.ArticlesViewModel;

import javax.inject.Singleton;
import dagger.Component;

@Singleton
@Component(modules = ApiModule.class)
public interface ApiComponent {
    void inject(ArticlesViewModel articlesViewModel);
}
