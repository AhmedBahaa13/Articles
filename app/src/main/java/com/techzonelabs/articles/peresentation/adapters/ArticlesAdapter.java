package com.techzonelabs.articles.peresentation.adapters;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.android.material.imageview.ShapeableImageView;
import com.techzonelabs.articles.R;
import com.techzonelabs.articles.data.models.Article;
import java.util.ArrayList;
import java.util.List;

public class ArticlesAdapter extends RecyclerView.Adapter<ArticlesAdapter.ItemViewHolder> {
    private ArrayList<Article> list = new ArrayList<>();
    private RecyclerItemsClickListener listener ;

    public ArticlesAdapter(RecyclerItemsClickListener listener) {
        this.listener = listener;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ItemViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.article_item,parent,false));
    }

    @SuppressLint("CheckResult")
    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        Article article = list.get(position);
        holder.title.setText(article.title);
        holder.publisher.setText(article.byline);
        holder.date.setText(article.published_date.substring(0,10));
        Glide.with(holder.imageView).load(article.multimedia.get(2).url).into(holder.imageView);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.itemOnClick(article,view);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    @SuppressLint("NotifyDataSetChanged")
    public void setArticlesList(List<Article> list){
        if (list != null) {
            this.list = (ArrayList<Article>) list;
        }
        notifyDataSetChanged();
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder {
        TextView title,publisher,date;
        ShapeableImageView imageView;
        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            publisher = itemView.findViewById(R.id.publisher);
            date = itemView.findViewById(R.id.date);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }

    public interface RecyclerItemsClickListener{
        void itemOnClick(Article article,View view);
    }
}
