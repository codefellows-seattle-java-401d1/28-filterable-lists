package com.example.filterablelist;

import android.support.v4.app.Fragment;

public class FriendsListActivity extends ThemedSingleFragmentActivity {
    @Override
    public Fragment createFragment() {
        return new FriendsListFragment();
    }
}
