package com.techzonelabs.articles.peresentation;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.techzonelabs.articles.R;
import com.techzonelabs.articles.data.models.Article;
import com.techzonelabs.articles.data.models.Result;
import com.techzonelabs.articles.databinding.FragmentHomeBinding;
import com.techzonelabs.articles.peresentation.adapters.ArticlesAdapter;
import com.techzonelabs.articles.peresentation.viewModels.ArticlesViewModel;


public class HomeFragment extends Fragment implements ArticlesAdapter.RecyclerItemsClickListener {
    private FragmentHomeBinding binding;
    private ArticlesViewModel viewModel;
    private ArticlesAdapter adapter;
    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater);
        viewModel = new ViewModelProvider(this).get(ArticlesViewModel.class);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
     setUpRecyclerView();
     getData();
    }
    private void getData(){
        viewModel.makeCall();
        viewModel.liveData.observe(getViewLifecycleOwner(), new Observer<Result>() {
            @Override
            public void onChanged(Result result) {
                if (adapter!=null)
                    adapter.setArticlesList(result.articles);
            }
        });
    }
    private void setUpRecyclerView(){
        adapter = new ArticlesAdapter(this);
        binding.recyclerView.setAdapter(adapter);
    }

    @Override
    public void itemOnClick(Article article,View view) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("article",article);
      Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_articlesFragment,bundle);
    }
}