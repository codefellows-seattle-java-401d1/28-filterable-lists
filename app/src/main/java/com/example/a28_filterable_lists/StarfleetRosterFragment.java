package com.example.a28_filterable_lists;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.a28_filterable_lists.fabrics.FabricData;
import com.example.a28_filterable_lists.fabrics.Fabrics;

import java.util.List;

public class StarfleetRosterFragment extends Fragment
        implements TextWatcher {
    private EditText mSearch;

    private List<Fabrics> starfleet;

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private FabricsAdapter mAdapter;

    @Override
    public View onCreateView(
            LayoutInflater inflater,
            ViewGroup container,
            Bundle savedInstanceState
    ) {
        View view = inflater.inflate(
                R.layout.fragment_starfleet_roster,
                container, false
        );

        mSearch = view.findViewById(R.id.search);
        mSearch.addTextChangedListener(this);

        starfleet = FabricData.get().users();

        mRecyclerView = view.findViewById(R.id.list);

        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new FabricsAdapter(starfleet);
        mRecyclerView.setAdapter(mAdapter);

        return view;
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        // do nothing
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        String filter = s.toString().toLowerCase();
        List<Fabrics> filtered = FabricData.search(filter);

        mAdapter = new FabricsAdapter(filtered);
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public void afterTextChanged(Editable s) {
        // do nothing
    }
}
