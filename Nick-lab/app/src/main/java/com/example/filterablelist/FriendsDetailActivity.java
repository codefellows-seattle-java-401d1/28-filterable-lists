package com.example.filterablelist;

import android.support.v4.app.Fragment;

public class FriendsDetailActivity extends FriendsListActivity {
    @Override
    public Fragment createFragment() {
        return new FriendsListFragment();
    }
}
