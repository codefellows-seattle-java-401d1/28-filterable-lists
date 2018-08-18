package com.example.filterablelist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button goToFriendsActivity;
    Button goToFriendsDetailActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goToFriendsActivity = findViewById();
        goToFriendsDetailActivity = findViewById();

        attachClickListener();
        attachClickListener();
    }

    public void attachClickListener(Button button, final class class_) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, class_);
                startActivity(intent);
            }
        });
    }

}
