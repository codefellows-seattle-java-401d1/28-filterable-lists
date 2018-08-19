package com.example.filterablelist;

import android.support.v4.app.Fragment;

public class FriendsActivity extends ThemedSingleFragmentActivity {
    @Override
    public Fragment createFragment() {
        return new FriendsFragment();
    }
}
