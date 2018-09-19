package com.example.panos.myapplication;

import android.support.v4.app.Fragment;

public class EventActivity  extends ThemedSingleFragmentActivity{

    @Override
    public Fragment createFragment(){
        return new EventListFragment();
    }
}
