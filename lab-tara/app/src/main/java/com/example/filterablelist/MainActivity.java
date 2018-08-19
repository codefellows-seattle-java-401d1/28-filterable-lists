package com.example.filterablelist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button seeMyFriends;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Add reference to buttons
         seeMyFriends = findViewById(R.id.seeMyFriends);

        attachClickListener(seeMyFriends, FriendListActivity.class);
    }

    public void attachClickListener(Button button, final Class class_) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, class_);
                startActivity(intent);
            }
        });
    }
}
