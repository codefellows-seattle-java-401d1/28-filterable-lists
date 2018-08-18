package com.android.sooz.filterapp;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SpeciesDetailActivity extends MainActivity {

    public Fragment createFragment(){
        return new SpeciesDetailFragment();
    }

}
