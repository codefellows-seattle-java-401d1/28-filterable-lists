package com.example.a28_filterable_lists;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.a28_filterable_lists.models.Fabrics;

import java.util.List;

public class FabricsAdapter extends RecyclerView.Adapter<FabricsAdapter.ViewHolder>{

    //an adapter does two things. It holds a reference to a list AND creates a view for that list.
    //If the view is brand new we use a layout inflater to inflate the new view and put it in the viewholder
    //the ViewHolder is something that makes the view easy to Recycle
    //The two states of a RecyleView are either (1) it is new or (2) it is recycled

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public View view;
        public TextView name;
        public TextView category;
        public TextView type;

        public ViewHolder(View view) {
            super(view);
            this.view = view;

            name = view.findViewById(R.id.name);
            category = view.findViewById(R.id.category);
            type = view.findViewById(R.id.type);
        }
    }

    //create a reference to the list
    List<Fabrics> fabrics;

    //create a constructor for the adapter that takes the list
    public FabricsAdapter(List<Fabrics> fabrics){
        this.fabrics = fabrics;
    }


    //new view means inflate a layout, pass it to a view holder, show the list
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.fabric_list_item, parent, false);
        ViewHolder holder = new ViewHolder(parent);
        return holder;
    }

    //whether new or recycled, the onBind doesn't care, it just uses the view that it has
    //find the item at a certain position in the list and use that information to modify the
    //widgets in the view holder
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Fabrics fabric = fabrics.get(position);
        holder.name.setText(fabric.name);
        holder.category.setText(fabric.category);
        holder.type.setText(fabric.type);
    }

    //the adapter needs to know how many items are in the list
    @Override
    public int getItemCount() {
        return this.fabrics.size();
    }
}
