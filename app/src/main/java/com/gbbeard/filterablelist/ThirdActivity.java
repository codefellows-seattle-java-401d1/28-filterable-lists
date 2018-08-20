package com.gbbeard.filterablelist;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ThirdActivity extends SingleFragmentActivity {

    @Override
    public int getHeaderDrawableId() {
        return R.drawable.headertwo;
    }

    public Fragment createFragment () {
        return new ThirdActivityFragment();
    }

}
