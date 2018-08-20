package com.example.filterablelist;

import android.support.v4.app.Fragment;

public class FriendsDetailActivity extends FriendListActivity {

    public Fragment createFragment() {
        return new FriendsDetailFragment();
    }
}
