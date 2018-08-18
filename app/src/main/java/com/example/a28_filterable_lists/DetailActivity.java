package com.example.a28_filterable_lists;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

//    public TextView name;
//    public TextView category;
//    public TextView type;
//    public TextView description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_back);

        View container = findViewById(R.id.container);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.container);

        if (fragment == null) {
            fm.beginTransaction()
                    .add(R.id.container, new DetailFragment())
                    .commit();
        }

//        name = findViewById(R.id.name_detail);
//        category = findViewById(R.id.category_detail);
//        type = findViewById(R.id.type_detail);
//        description = findViewById(R.id.description_detail);

    }
}
