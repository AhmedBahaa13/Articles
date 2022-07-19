package com.techzonelabs.articles.peresentation;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.techzonelabs.articles.data.models.Article;
import com.techzonelabs.articles.databinding.FragmentArticlesBinding;


public class ArticlesFragment extends Fragment {
    private static final String TAG = "ArticlesFragment";
    private FragmentArticlesBinding binding;
    private Article article;

    public ArticlesFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentArticlesBinding.inflate(inflater);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        assert getArguments() != null;
       article = (Article) getArguments().getSerializable("article");
       binding.dateValue.setText(article.published_date.substring(0,10));
       binding.titleVlaue.setText(article.title);
       binding.publishedByValue.setText(article.byline);
       binding.summaryValue.setText(article.myAbstract);
        Glide.with(binding.imageView).load(article.multimedia.get(2).url).into(binding.imageView);
        Log.d(TAG, "onViewCreated: Article From Args"+article.toString());
    }
}