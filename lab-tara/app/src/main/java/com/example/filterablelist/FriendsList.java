package com.example.filterablelist;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FriendsList extends ThemedSingleFragmentActivity {
    @Override
    public Fragment createFragment() {
        return new FriendsListFragment();
    }
}
