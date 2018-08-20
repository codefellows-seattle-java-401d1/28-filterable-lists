package com.android.sooz.filterapp;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.sooz.filterapp.models.StarWarsSpecies;

import java.util.List;

public class StarWarsSpeciesListAdapter extends RecyclerView.Adapter<StarWarsSpeciesListAdapter.ViewHolder> {

    public class ViewHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener {

        public StarWarsSpecies mAlien;

        public View view;
        public TextView name;
        public TextView classification;

        public ViewHolder(View view) {
            super(view);
            this.view = view;

            this.name = view.findViewById(R.id.name);
            this.classification = view.findViewById(R.id.classficiation);

            view.setOnClickListener(this);

        }


        @Override
        public void onClick(View v) {
            Intent intent = new Intent(v.getContext(), SpeciesDetailActivity.class);
            mAlien.fillIntent(intent);

            v.getContext().startActivity(intent);
        }
    }
    List<StarWarsSpecies> speciesList;

    public StarWarsSpeciesListAdapter(List<StarWarsSpecies> speciesList) {
        this.speciesList = speciesList;
    }

    public int getItemCount() {
        return this.speciesList.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.species_list_item, parent, false);

        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    //Find alien associated with the position in the list chosen
    // and use that alien's properties to modify the widgest in the view holder

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        StarWarsSpecies alien = speciesList.get(position);

        holder.name.setText(alien.name);
        holder.classification.setText(alien.classification);

        holder.mAlien = alien;
    }
}



