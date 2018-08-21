package com.example.filterable_lists;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FriendDetail extends AppCompatActivity{
    TextView title;
    TextView bio;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        title = findViewById(R.id.Title);
        bio = findViewById(R.id.Bio);
        back = findViewById(R.id.Back);
        title.setText(getIntent().getStringExtra("bio"));
        bio.setText(getIntent().getStringExtra("name"));
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FriendDetail.this,ActivityMain.class));
            }
        });

    }

}
