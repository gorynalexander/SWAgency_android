package com.sw.swagency_2.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.sw.swagency_2.R;
import com.sw.swagency_2.adapters.ProsAdapter;
import com.sw.swagency_2.models.Advantage;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Odinn on 31.03.2017.
 */

public class AboutUsFragment extends Fragment {
    private RecyclerView rvPros;
    private ProsAdapter prosAdapter;
    private RecyclerView.LayoutManager rvLayoutManager;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_about_us, container, false);
        ImageView ivLogo = (ImageView) view.findViewById(R.id.ivLogo);
        Picasso.with(view.getContext())
                .load(R.drawable.logotip_obrezanny)
                .resize(250, 200)
                .into(ivLogo);

//        rvPros = (RecyclerView) view.findViewById(R.id.rvPros);
//        rvLayoutManager = new GridLayoutManager(getContext(), 2);
//        rvPros.setLayoutManager(rvLayoutManager);
//        prosAdapter = new ProsAdapter(createPros());
//        rvPros.setAdapter(prosAdapter);
//        rvPros.setNestedScrollingEnabled(false);

        return view;
    }

    private List<Advantage> createPros() {
        List<Advantage> list = new ArrayList<>();
        list.add(new Advantage("Уникальность", R.drawable.ynikal));
        list.add(new Advantage("Опыт работы", R.drawable.opyt));
        list.add(new Advantage("Репутация компании", R.drawable.reputac));
        list.add(new Advantage("Комплексное обслуживание", R.drawable.komplex));
        return list;
    }


}
