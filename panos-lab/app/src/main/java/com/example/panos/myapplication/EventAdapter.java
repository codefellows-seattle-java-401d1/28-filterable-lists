package com.example.panos.myapplication;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.panos.myapplication.Classes.Event;

import java.util.List;

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.ViewHolder>{
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public Event mEvent;
        public View view;
        public TextView name;
        public TextView date;
        public TextView description;
        public ViewHolder(View view){
            super(view);
            this.view = view;

            this.name = view.findViewById(R.id.name);
            this.date = view.findViewById(R.id.date);
            this.description = view.findViewById(R.id.description);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View v){
            Intent intent = new Intent(v.getContext(),EventDetailActivity.class);
            mEvent.fillIntent(intent);

            v.getContext().startActivity(intent);
        }
    }

    List<Event> eventList;

    public EventAdapter(List<Event> eventList){
        this.eventList = eventList;
    }

    @Override
    public int getItemCount(){
        return this.eventList.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.event_list_item,parent,false);

        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position){
        Event currEvent = eventList.get(position);
        holder.name.setText(currEvent.name);
        holder.description.setText(currEvent.description);
        holder.date.setText(currEvent.date);
        holder.mEvent = currEvent;
    }
}
