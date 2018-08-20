package com.gbbeard.filterablelist;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.support.v7.widget.LinearLayoutManager;

import com.gbbeard.filterablelist.models.Bands;
import com.gbbeard.filterablelist.models.BandsData;

import java.util.List;

public class SecondActivityFragment extends Fragment {
    private EditText mSearch;

    private List<Bands> bandsList;

    private RecyclerView mRecycleView;
    private RecyclerView.LayoutManager layoutManager;
    private BandsAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_second, container, false);
        mSearch = view.findViewById(R.id.search);
        mSearch.addTextChangedListener(this);

        bandsList = BandsData.get().bandsList();
        mRecycleView = view.findViewById(R.id.list);

        layoutManager = new LinearLayoutManager(getActivity());
        mRecycleView.setLayoutManager(layoutManager);

        mAdapter = new BandsAdapter(bandsList);
        mRecycleView.setAdapter(mAdapter);

        return view;
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChange(CharSequence s, int start, int count, int after) {
        String filter = s.toString().toLowerCase();
        List<Bands> filtered = BandsData.search(filter);

        mAdapter = new BandsAdapter(filtered);
        mRecycleView.setAdapter(mAdapter);
    }
}
