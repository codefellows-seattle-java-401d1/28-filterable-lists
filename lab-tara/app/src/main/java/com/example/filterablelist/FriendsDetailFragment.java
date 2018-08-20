package com.example.filterablelist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.filterablelist.Friends.Friend;

public class FriendsDetailFragment extends Fragment {
    TextView name;
    TextView handle;
    TextView bio;

    @Override
    public View onCreateView(
            LayoutInflater inflater,
            ViewGroup container,
            Bundle savedInstanceState
    ) {
        View view = inflater.inflate(
                R.layout.activity_friends_detail,
                container, false);
        Intent data = getActivity().getIntent();
        Friend friend = Friend.fromIntent(data);

        name = view.findViewById(R.id.detail_name);
        handle = view.findViewById(R.id.detail_handle);
        bio = view.findViewById(R.id.detail_bio);

        name.setText(friend.name);
        handle.setText(friend.handle);
        bio.setText(friend.bio);

        return view;
    }
}
