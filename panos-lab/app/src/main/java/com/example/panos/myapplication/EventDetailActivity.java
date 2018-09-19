package com.example.panos.myapplication;

import android.support.v4.app.Fragment;

public class EventDetailActivity extends EventListActivity{

    public Fragment createFragment(){
        return new EventDetailFragment();
    }
}
