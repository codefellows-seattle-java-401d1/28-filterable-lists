package com.example.paulsuarez.a28_filterable_lists;

import android.support.v4.app.Fragment;

public class RosterActivity extends ThemedSingleFragmentActivity {

    @Override
    public int getHeaderDrawableId() {
        return R.drawable.hearthstonebanner;
    }

    @Override
    public Fragment createFragment() {
        return new RosterFragment();
    }
}
