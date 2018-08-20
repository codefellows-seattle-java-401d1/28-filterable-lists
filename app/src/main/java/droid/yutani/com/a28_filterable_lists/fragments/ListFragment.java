package droid.yutani.com.a28_filterable_lists.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import droid.yutani.com.a28_filterable_lists.R;
import droid.yutani.com.a28_filterable_lists.adapters.CharListAdapter;
import droid.yutani.com.a28_filterable_lists.model.BebopCharacter;
import droid.yutani.com.a28_filterable_lists.model.BebopData;

public class ListFragment extends Fragment {
    private List<BebopCharacter> bebop;
    private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerView mRecyler;
    private CharListAdapter mAdapter;

    @Override
    public View onCreateView (
            LayoutInflater inflater,
            ViewGroup container,
            Bundle savedInstanceState
    ) {
        View view = inflater.inflate(R.layout.activity_list, container, false);

        bebop = BebopData.getData().characters();

        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyler = view.findViewById(R.id.character_list_recycler);
        mRecyler.setLayoutManager(mLayoutManager);

        mAdapter = new CharListAdapter(bebop);
        mRecyler.setAdapter(mAdapter);

        return view;
    }
}
