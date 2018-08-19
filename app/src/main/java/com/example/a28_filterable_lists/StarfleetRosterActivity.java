package com.example.a28_filterable_lists;

import android.support.v4.app.Fragment;

public class StarfleetRosterActivity extends ThemedSingleFragmentActivity {

    @Override
    public Fragment createFragment() {
        return new StarfleetRosterFragment();
    }
}
