package com.example.filterable_lists;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActivityMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        if (findViewById(R.id.Friend_List_Constraint) != null) {
            Fragment newFragment = new ListElementFragment();
            if (newFragment.isAdded() == false) {
                newFragment.;
                fm.beginTransaction()
                        .add(R.id.Friend_List_Constraint, createFragment())
                        .commit();
            }
        }
    }
    public Fragment createFragment(){return new ListElementFragment();
    }
}
