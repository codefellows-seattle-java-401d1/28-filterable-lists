package com.example.paulsuarez.a28_filterable_lists;

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

import com.example.paulsuarez.a28_filterable_lists.models.Constructor;
import com.example.paulsuarez.a28_filterable_lists.models.Data;

import java.util.List;

public class RosterFragment extends Fragment
        implements TextWatcher {




    private EditText mSearch;

    private List<Constructor> hearthstone;

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private RosterAdapter mAdapter;

    @Override
    public View onCreateView(
            LayoutInflater inflater,
            ViewGroup container,
            Bundle savedInstanceState
    ) {
        View view = inflater.inflate(
                R.layout.fragment_roster,
                container, false
        );

        mSearch = view.findViewById(R.id.search);
        mSearch.addTextChangedListener(this);

        hearthstone = Data.get().users();

        mRecyclerView = view.findViewById(R.id.list);

        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new RosterAdapter(hearthstone);
        mRecyclerView.setAdapter(mAdapter);

        return view;
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        String filter = s.toString().toLowerCase();
        List<Constructor> filtered = Data.search(filter);

        mAdapter = new RosterAdapter(filtered);
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public void afterTextChanged(Editable s) {

    }


}
