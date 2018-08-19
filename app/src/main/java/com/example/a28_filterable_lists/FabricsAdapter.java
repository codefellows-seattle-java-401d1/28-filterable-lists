package com.example.a28_filterable_lists;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.a28_filterable_lists.fabrics.Fabrics;

import java.util.List;

//An adapter does two things. (1) It holds a reference to a list and (2) creates a view for that list.
//If the view is brand new we use a layout inflater to inflate the new view and put it in the view holder.
//The ViewHolder is something that makes the view easy to recycle the views.
//The two states of a RecyleView are either (1) it is new or (2) it is recycled
public class FabricsAdapter extends
        RecyclerView.Adapter<FabricsAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener {

        //this reference is new. I didn't have it when I wrote out my code originally. It is strictly from the demo code from TouchableLists on Lab 28
        //https://github.com/codefellows/seattle-java-401d1/tree/master/class-28-android-persistent-storage-sharedprefs-network/demos/TouchableList
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

            //this is also a new reference. I did not write this, it came from the Lab 28 demo on TouchableLists. It is to allow for touching the item on the screen and having it show more detail.
            view.setOnClickListener(this);
        }

        //this is also a new reference. I did not write this, it came from the Lab 28 demo on TouchableLists. It is to allow for touching the item on the screen and having it show more detail.
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(v.getContext(), FabricsDetailActivity.class);
            mFabrics.fillIntent(intent);

            v.getContext().startActivity(intent);
        }
    }

    //Create a reference to the list that the ViewHolder will eventually hold.
    List<Fabrics> fabricsList;

    //Create a constructor for the adapter that takes the list referenced above as a parameter.
    public FabricsAdapter(List<Fabrics> fabricsList) {
        this.fabricsList = fabricsList;
    }

    //The ViewHolder needs to know how many items are in the list before it can recycle the views.
    @Override
    public int getItemCount() {
        return this.fabricsList.size();
    }

    //If the view is not already created, this will create the view. The view needs to inflate (utilize) the view stated below to know how to arrange the information from the constructor created above. The view is then passed to a holder and the holder is returned.
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.fabric_list_item, parent, false);

        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    // Steve's comment from the demo code:
    // Find the item associated at the given position in the list
    // and use that item to modify the widgets in the view holder.
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Fabrics fabric = fabricsList.get(position);
        holder.name.setText(fabric.name);
        holder.category.setText(fabric.category);
        holder.type.setText(fabric.type);
        holder.mFabrics = fabric;
    }
}
