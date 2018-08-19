package com.example.a28_filterable_lists;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.a28_filterable_lists.fabrics.Fabrics;

import java.util.List;

public class FabricsAdapter extends
        RecyclerView.Adapter<FabricsAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener {
        public Fabrics mFabrics;

        public View view;
        public TextView name;
        public TextView category;
        public TextView type;

        public ViewHolder(View view) {
            super(view);
            this.view = view;

            this.name = view.findViewById(R.id.name);
            this.category = view.findViewById(R.id.category);
            this.type = view.findViewById(R.id.type);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(v.getContext(), FabricsDetailActivity.class);
            mFabrics.fillIntent(intent);

            v.getContext().startActivity(intent);
        }
    }

    List<Fabrics> fabricsList;

    public FabricsAdapter(List<Fabrics> fabricsList) {
        this.fabricsList = fabricsList;
    }

    @Override
    public int getItemCount() {
        return this.fabricsList.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.fabric_list_item, parent, false);

        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    // Find the item associated at the given position in the list
    // and use that item to modify the widgets in the view holder.
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Fabrics person = fabricsList.get(position);
        holder.name.setText(person.name);
        holder.category.setText(person.category);
        holder.type.setText(person.type);
        holder.mFabrics = person;
    }
}
