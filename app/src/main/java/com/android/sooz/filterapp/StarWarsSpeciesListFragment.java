package com.android.sooz.filterapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.EditText;

import com.android.sooz.filterapp.models.SpeciesData;
import com.android.sooz.filterapp.models.StarWarsSpecies;

import java.util.List;

public class StarWarsSpeciesListFragment extends Fragment implements TextWatcher {

    private EditText mSearch;

    private List<StarWarsSpecies> starwars;

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private StarWarsSpeciesListAdapter mAdapter;

    @Override
    public View onCreateView(
        LayoutInflater inflater,
        ViewGroup container,
        Bundle savedInstanceState){

        View view = inflater.inflate(R.layout.fragment_species_list, container, false);

        mSearch = view.findViewById(R.id.search_species);
        mSearch.addTextChangedListener(this);

        starwars = SpeciesData.get().species();

        mRecyclerView = view.findViewById(R.id.list);

        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new StarWarsSpeciesListAdapter();
        mRecyclerView.setAdapter(mAdapter);

        return view;
    }

    @Override
    public void beforeTextChanged (CharSequence s, int start, int count, int after) {
        //do nothing
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count){
        String filter = s.toString().toLowerCase();
        List<StarWarsSpecies> filtered = SpeciesData.search(filter);

//        mAdapter = new Adapter();
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public void afterTextChanged(Editable s) {
        //do nothing
    }
}
