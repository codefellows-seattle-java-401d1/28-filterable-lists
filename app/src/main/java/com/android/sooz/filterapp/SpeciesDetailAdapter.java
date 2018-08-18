package com.android.sooz.filterapp;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.android.sooz.filterapp.models.SpeciesData;

public class SpeciesDetailAdapter extends RecyclerView.Adapter<SpeciesDetailAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public SpeciesData mAlien;

        public View view;
        public TextView name;
        public TextView classfication;

        public ViewHolder(View view){
            super(view);
            this.view = view;

            this.name = view.findViewById(R.id.name)
        }

    }
}
