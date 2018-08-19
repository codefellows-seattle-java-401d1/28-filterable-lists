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
import android.widget.EditText;

import com.android.sooz.filterapp.models.SpeciesData;
import com.android.sooz.filterapp.models.StarWarsSpecies;

import java.util.List;

public class StarWarsSpeciesListFragment extends Fragment implements TextWatcher {
    private EditText mSearch;

    private List<StarWarsSpecies> starwars;

    private RecyclerView mRecylcerView;
    private RecyclerView.LayoutManager mlayoutManager;
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

        mRecylcerView = view.findViewById(R.id.list);

        mlayoutManager = new LinearLayoutManager(getActivity());
        mRecylcerView.setLayoutManager(mlayoutManager);

        mAdapter = new StarWarsSpeciesListAdapter(starwars);
        mRecylcerView.setAdapter(mAdapter);

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

        mAdapter = new StarWarsSpeciesListAdapter(filtered);
        mRecylcerView.setAdapter(mAdapter);
    }

    @Override
    public void afterTextChanged(Editable s) {
        //do nothing
    }
}
