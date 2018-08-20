package com.gbbeard.filterablelist;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

public abstract class SingleFragmentActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstance) {
    super.onCreate(savedInstance);
    setContentView(R.layout.fragment_single);

    View container = findViewById(R.id.container);

        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragment = fragmentManager.findFragmentById(R.id.container);
        if (fragment == null) {
            fragmentManager.beginTransaction().add(R.id.container, createFragment()).commit();
        }

        ImageView header = findViewById(R.id.header);
        Drawable drawable = getResources().getDrawable(getHeaderDrawableId());
        header.setImageDrawable(drawable);

        Button backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    public int getHeaderDrawableId() {
        return R.drawable.header;
    }

    public abstract Fragment createFragment();
}