package com.example.filterablelist;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.filterablelist.models.Friend;

import java.util.List;

public class FriendsListAdapter extends RecyclerView.Adapter<FriendsListAdapter.ViewHolder> {


    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        Friend mFriend;

        public View view;
        public TextView name;
        public TextView bio;

        public ViewHolder(View view) {
            super(view);
            this.view = view;

            this.name = view.findViewById(R.id.name);
            this.bio = view.findViewById(R.id.bio);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(view.getContext(), Friends_Activity_Fragment.class);
            mFriend.fillIntent(intent);

            view.getContext().startActivity(intent);
        }
    }

    List<Friend> friendsList;

    public FriendsListAdapter(List<Friend> friendsList) {
        this.friendsList = friendsList;
    }

    @Override
    public int getItemCount() {
        return this.friendsList.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.activity_friend_detail, parent, false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Friend friend = friendsList.get(position);
        holder.name.setText(friend.name);
        holder.bio.setText(friend.bio);
        holder.mFriend = friend;
    }
}
