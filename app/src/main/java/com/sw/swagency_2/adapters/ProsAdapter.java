package com.sw.swagency_2.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.sw.swagency_2.R;
import com.sw.swagency_2.models.Advantage;

import java.util.List;

/**
 * Created by Odinn on 01.04.2017.
 */

public class ProsAdapter extends RecyclerView.Adapter<ProsAdapter.ViewHolder>{
    private List<Advantage> list;

    public ProsAdapter(List<Advantage> list) {
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_listview, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Advantage item = list.get(position);
        holder.tvTitle.setText(item.getTitle());
        Picasso.with(holder.ivPros.getContext())
                .load(item.getImg())
                .resize(220, 220)
                .into(holder.ivPros);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvTitle;
        private ImageView ivPros;
        public ViewHolder(View itemView) {
            super(itemView);
            tvTitle = (TextView) itemView.findViewById(R.id.tvProsItem);
            ivPros = (ImageView) itemView.findViewById(R.id.ivProsItem);
        }
    }
}
