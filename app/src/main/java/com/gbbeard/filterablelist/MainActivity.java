package com.gbbeard.filterablelist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonForTwo;
    Button buttonForThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonForTwo = findViewById(R.id.forTwo);
        buttonForThree = findViewById(R.id.forThree);

        attachClickListener(buttonForTwo, SecondActivity.class);
        attachClickListener(buttonForThree, ThirdActivity.class);

    }

    private void attachClickListener(Button button, final Class classto) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, classto);
                startActivity(intent);
            }
        });
    }
}
