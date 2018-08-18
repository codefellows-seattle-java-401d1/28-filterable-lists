package com.example.a28_filterable_lists;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a28_filterable_lists.models.Fabrics;
import com.example.a28_filterable_lists.models.FabricsData;

import java.util.List;

public class DetailFragment extends Fragment{

    private List<Fabrics> fabrics;
    private RecyclerView mRecyclerView;
    private FabricsAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_detail, container, false);

        fabrics = FabricsData.get().fabrics();

        mRecyclerView = view.findViewById(R.id.list);
        mLayoutManager = new LinearLayoutManager(getActivity());

        mAdapter = new FabricsAdapter(fabrics);
        mRecyclerView.setAdapter(mAdapter);
        return view;

    }
}
