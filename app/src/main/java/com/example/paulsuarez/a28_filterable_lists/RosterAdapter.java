package com.example.paulsuarez.a28_filterable_lists;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.paulsuarez.a28_filterable_lists.models.Constructor;

import java.util.List;

public class RosterAdapter extends
        RecyclerView.Adapter<RosterAdapter.ViewHolder> {



    public static class ViewHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener {
        public Constructor mPerson;

        public View view;
        public TextView name;
        public TextView rank;

        public ViewHolder(View view) {
            super(view);
            this.view = view;

            this.name = view.findViewById(R.id.name);
            this.rank = view.findViewById(R.id.rank);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(v.getContext(), DetailActivity.class);
            mPerson.fillIntent(intent);

            v.getContext().startActivity(intent);
        }
    }

    List<Constructor> personnelList;

    public RosterAdapter(List<Constructor> personnelList) {
        this.personnelList = personnelList;
    }

    @Override
    public int getItemCount() {
        return this.personnelList.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.roster_list_item, parent, false);

        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Constructor person = personnelList.get(position);
        holder.name.setText(person.name);
        holder.rank.setText(person.rank);
        holder.mPerson = person;
    }


}
