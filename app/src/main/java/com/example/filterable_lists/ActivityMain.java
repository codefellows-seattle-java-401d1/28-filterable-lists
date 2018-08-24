package com.example.filterable_lists;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.container);
        if(fragment.isAdded()==false) {fm.beginTransaction()
                    .add(R.id.container, createFragment())
                    .commit();
        }
    }
    public Fragment createFragment(){return new ListElementFragment();
    }
}
