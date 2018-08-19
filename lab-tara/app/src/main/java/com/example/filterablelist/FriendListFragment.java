package com.example.filterablelist;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.filterablelist.Friends.Friend;
import com.example.filterablelist.Friends.FriendsData;

import java.util.List;

public class FriendListFragment extends Fragment {
    private List<Friend> friends;

    private RecyclerView mRecyclerView;
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

        friends = FriendsData.get().friends();

        // Grab RecyclerView
        mRecyclerView = view.findViewById(R.id.list);

        // Create Adapter
        mAdapter = new FriendsListAdapter(friends);

        // Set the RecyclerView with the Adapter
        mRecyclerView.setAdapter(mAdapter);

        return view;
    }
}
