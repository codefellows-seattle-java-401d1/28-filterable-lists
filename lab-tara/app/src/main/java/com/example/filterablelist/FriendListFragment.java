package com.example.filterablelist;

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

import com.example.filterablelist.Friends.Friend;
import com.example.filterablelist.Friends.FriendsData;

import java.util.List;

public class FriendListFragment extends Fragment implements TextWatcher {

    private EditText mSearch;

    private List<Friend> friends;

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private FriendsListAdapter mAdapter;

    @Override
    public View onCreateView(
            LayoutInflater inflater,
            ViewGroup container,
            Bundle savedInstanceState
    ) {
        View view = inflater.inflate(R.layout.fragment_friends_list,
                container,
                false
        );

        mSearch = view.findViewById(R.id.search);
        mSearch.addTextChangedListener(this);

        friends = FriendsData.get().friends();

        mRecyclerView = view.findViewById(R.id.list);

        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new FriendsListAdapter(friends);
        mRecyclerView.setAdapter(mAdapter);

        return view;
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        // do nothing
    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        String filter = charSequence.toString().toLowerCase();
        List<Friend> filtered = FriendsData.search(filter);

        mAdapter = new FriendsListAdapter(filtered);
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public void afterTextChanged(Editable editable) {

    }
}
