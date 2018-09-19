package com.example.panos.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public abstract class ThemedSingleFragmentActivity extends AppCompatActivity{
    @Override
    public void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_back_activity);

        View container = findViewById(R.id.container);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.container);
        if (fragment == null){
            fm.beginTransaction()
                    .add(R.id.container,createFragment())
                    .commit();
        }
        Button goBack = findViewById(R.id.goBack);
        goBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                finish();
            }
        });
    }
    public abstract Fragment createFragment();
}
