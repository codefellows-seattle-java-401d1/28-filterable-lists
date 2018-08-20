package com.gbbeard.filterablelist;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class SecondActivity extends SingleFragmentActivity {
    @Override
    public Fragment createFragment() {
        return new SecondActivityFragment();
    }

}
