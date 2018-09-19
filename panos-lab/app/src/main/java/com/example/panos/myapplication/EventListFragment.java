package com.example.panos.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.panos.myapplication.Classes.Event;
import com.example.panos.myapplication.Classes.EventData;

import java.util.List;

public class EventListFragment extends Fragment implements TextWatcher {
    private EditText mSearch;
    private List<Event> eventsTodisplay;

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private EventAdapter mAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.activity_event_list,container,false);
        mSearch = view.findViewById(R.id.listFilter);
        mSearch.addTextChangedListener(this);

        eventsTodisplay = EventData.get().events();

        mRecyclerView = view.findViewById(R.id.listOfDetails);

        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new EventAdapter(eventsTodisplay);
        mRecyclerView.setAdapter(mAdapter);

        return view;
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        String filter = s.toString().toLowerCase();
        List<Event> filtered = EventData.search(filter);

        mAdapter = new EventAdapter(filtered);
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public void afterTextChanged(Editable s) {

    }
}
