package com.example.a28_filterable_lists;

import android.support.v4.app.Fragment;

public class StarfleetPersonnelDetailActivity extends StarfleetRosterActivity {

    public Fragment createFragment() {
        return new StarfleetPersonnelDetailFragment();
    }
}
