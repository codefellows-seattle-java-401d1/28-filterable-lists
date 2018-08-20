package com.android.sooz.filterapp;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public abstract class ThemeHeaderFragmentActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_back_activity);

        View container = findViewById(R.id.container);

        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragment = fragmentManager.findFragmentById(R.id.container);

        if (fragment == null) {
            fragmentManager.beginTransaction()
                    .add(R.id.container, createFragment())
                    .commit();
        }

        ImageView header = findViewById(R.id.header);
        Drawable drawable = getResources().getDrawable(getHeaderDrawableID());
        header.setImageDrawable(drawable);

        Button goHome = findViewById(R.id.goHome);
        goHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public int getHeaderDrawableID() {

        return R.drawable.starwarsbanner1;
    }

    public abstract Fragment createFragment();
}

