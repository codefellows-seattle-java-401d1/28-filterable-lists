package com.example.panos.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.panos.myapplication.Classes.Event;

public class EventDetailFragment extends Fragment{
    TextView name;
    TextView date;
    TextView desc;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.event_list_item, container,false);
        Intent data = getActivity().getIntent();
        Event currEvent = Event.fromIntent(data);
        name = view.findViewById(R.id.name);
        date = view.findViewById(R.id.date);
        desc = view.findViewById(R.id.description);

        name.setText(currEvent.name);
        date.setText(currEvent.date);
        desc.setText(currEvent.description);

        return view;
    }
}
