package com.gbbeard.filterablelist;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.gbbeard.filterablelist.models.Bands;

import java.util.List;

public class BandsAdapter extends RecyclerView.Adapter<BandsAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public Bands mBands;

        public View view;
        public TextView name;
        public TextView members;

        public ViewHolder(View view) {
            super(view);
            this.view = view;

            this.name = view.findViewById(R.id.name);
            this.members = view.findViewById(R.id.members);
            view.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(v.getContext(), BandsDetailActivity.class);
            mBands.fillIntent(intent);

            v.getContext().startActivity(intent);
        }
    }

    List<Bands> bandsList;

    public BandsAdapter(List<Bands> bandsList) {
        this.bandsList = bandsList;
    }

    @Override
    public int getItemCount() {
        return this.bandsList.size();
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.activity_second, parent, false);

        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Bands band = bandsList.get(position);
        holder.name.setText(band.name);
        holder.members.setText(band.members);
    }
}
