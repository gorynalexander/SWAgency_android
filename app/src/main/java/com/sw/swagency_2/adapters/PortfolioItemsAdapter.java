package com.sw.swagency_2.adapters;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;
import com.sw.swagency_2.ItemDetailsActivity;
import com.sw.swagency_2.R;
import com.sw.swagency_2.models.PortfolioItem;

import java.util.List;

/**
 * Created by Odinn on 01.04.2017.
 */

public class PortfolioItemsAdapter extends RecyclerView.Adapter<PortfolioItemsAdapter.ViewHolder> {
    private List<PortfolioItem> list;

    public PortfolioItemsAdapter(List<PortfolioItem> list) {
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_portfolio, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final PortfolioItem item;
        item = list.get(position);
        holder.tvTitle.setText(item.getTitle());
        Picasso.with(holder.ivPortfolioItem.getContext())
                .load(item.getImg())
                .resize(1050, holder.ivPortfolioItem.getHeight())
                .into(holder.ivPortfolioItem);

        holder.ivPortfolioItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), ItemDetailsActivity.class);
                intent.putExtra("link" , item.getLink());
                intent.putExtra("description" , item.getDescription());
                intent.putExtra("image" , item.getImg());
                intent.putExtra("title" , item.getTitle());
                view.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvTitle;
        private ImageView ivPortfolioItem;
        public ViewHolder(View itemView) {
            super(itemView);
            tvTitle = (TextView) itemView.findViewById(R.id.tvPortfolioItem);
            ivPortfolioItem = (ImageView) itemView.findViewById(R.id.ivPortfolioItem);
        }
    }
}
