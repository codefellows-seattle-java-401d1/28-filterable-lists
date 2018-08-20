package droid.yutani.com.a28_filterable_lists.activities;

import android.support.v4.app.Fragment;

import droid.yutani.com.a28_filterable_lists.fragments.FragmentGenerator;
import droid.yutani.com.a28_filterable_lists.fragments.ListFragment;

public class CharList extends FragmentGenerator {

    @Override
    public Fragment createFragment() {
        return new ListFragment();
    }
}
