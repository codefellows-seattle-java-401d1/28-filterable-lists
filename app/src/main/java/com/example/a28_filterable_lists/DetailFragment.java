package com.example.a28_filterable_lists;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a28_filterable_lists.models.Fabrics;

import java.util.List;

public class DetailFragment extends Fragment{

    private List<Fabrics> fabrics;
    private RecyclerView mRecyclerView;
    private FabricsAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_detail, container, false);

        mRecyclerView = view.findViewById(R.id.list);
        mAdapter = new FabricsAdapter;
        mRecyclerView.setAdapter(mAdapter);
        return view;

    }
}
