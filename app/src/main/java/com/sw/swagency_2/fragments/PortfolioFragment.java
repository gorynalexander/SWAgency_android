package com.sw.swagency_2.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sw.swagency_2.R;
import com.sw.swagency_2.adapters.PortfolioItemsAdapter;
import com.sw.swagency_2.models.PortfolioItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Odinn on 01.04.2017.
 */

public class PortfolioFragment extends Fragment {
    private RecyclerView rvPortfolio;
    private PortfolioItemsAdapter adapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_portfolio, container, false);

        rvPortfolio = (RecyclerView) view.findViewById(R.id.rvPortfolio);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        rvPortfolio.setLayoutManager(layoutManager);
        adapter = new PortfolioItemsAdapter(createPortfolioList());
        rvPortfolio.setAdapter(adapter);
        return view;
    }

    private List<PortfolioItem> createPortfolioList() {
        List<PortfolioItem> list = new ArrayList<>();
//        list.add(new PortfolioItem("gazon.sadovnik.od.ua", "http://i.imgur.com/0s2wcXw.png"));
//        list.add(new PortfolioItem("glafirasova.ae", "http://i.imgur.com/Jgv6xXs.png"));
        list.add(new PortfolioItem("gazon.sadovnik.od.ua", "http://i.imgur.com/0s2wcXw.png", "Рулоновые газоны", getString(R.string.gazon_desc)));
        list.add(new PortfolioItem("glafirasova.ae", "http://i.imgur.com/Jgv6xXs.png", "GLAFIRASOVA", getString(R.string.glaf_desc)));
        return list;
    }
}
