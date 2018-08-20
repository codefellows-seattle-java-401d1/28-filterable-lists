package com.android.sooz.filterapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.sooz.filterapp.models.StarWarsSpecies;

import org.w3c.dom.Text;

public class SpeciesDetailFragment extends StarWarsSpeciesListFragment {
    TextView name;
    TextView classification;
    TextView language;
    TextView homeworld;

    @Override
    public View onCreateView(
        LayoutInflater inflater,
        ViewGroup container,
        Bundle savedInstanceState
    ) {

        View view = inflater.inflate(
                R.layout.activity_species_detail,
                container, false);
        Intent data = getActivity().getIntent();
        StarWarsSpecies alien = StarWarsSpecies.fromIntent(data);

        name = view.findViewById(R.id.name_detail);
        classification = view.findViewById(R.id.classification_detail);
        language = view.findViewById(R.id.language_detail);
        homeworld = view.findViewById(R.id.homeworld_detail);

        name.setText(alien.name);
        classification.setText(alien.classification);
        language.setText(alien.language);
        homeworld.setText(alien.homeworld);

        return view;

    }

}



