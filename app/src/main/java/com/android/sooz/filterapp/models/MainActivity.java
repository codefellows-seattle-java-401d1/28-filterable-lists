package com.android.sooz.filterapp.models;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.android.sooz.filterapp.R;
import com.android.sooz.filterapp.SpeciesDetailActivity;

public class MainActivity extends AppCompatActivity{

    Button goToSpeciesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goToSpeciesList = findViewById(R.id.goToSpeciesList);

        goToSpeciesList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SpeciesDetailActivity.class);

                startActivity(intent);
            }
        });
    }
}
