package com.example.a28_filterable_lists;

import android.support.v4.app.Fragment;

public class FabricsDetailActivity extends FabricsActivity {

    //Activities are no longer needed to create the program now since we are using fragments.
    //We simply ue the activity return the fragment. Fragments do not exist on their own
    // without activities, so the activity class is still necessary in that sense.

    public Fragment createFragment() {
        return new FabricsDetailFragment();
    }
}
