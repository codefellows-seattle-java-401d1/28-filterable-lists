package droid.yutani.com.a28_filterable_lists.activities;


import android.support.v4.app.Fragment;

import droid.yutani.com.a28_filterable_lists.fragments.DetailFragment;
import droid.yutani.com.a28_filterable_lists.fragments.FragmentGenerator;

public class CharDetail extends FragmentGenerator {
    @Override
    public Fragment createFragment() {
        return new DetailFragment();
    }
}
