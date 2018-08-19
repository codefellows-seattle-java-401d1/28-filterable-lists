package com.android.sooz.filterapp;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class StarWarsSpeciesListActivity extends ThemeHeaderFragmentActivity {

    @Override
    public int getheaderDrawableID() {

        return R.drawable.starwarsbanner1;
    }

    @Override

    public Fragment createFragment(){
        return new StarWarsSpeciesListFragment();
    }
}
