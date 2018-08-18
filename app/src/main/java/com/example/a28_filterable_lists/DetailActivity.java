//package com.example.a28_filterable_lists;
//
//import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.TextView;
//
//public class DetailActivity extends AppCompatActivity {
//
//    public TextView name;
//    public TextView category;
//    public TextView type;
//    public TextView description;
//    public Button goBackButton;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_go_back);
//
//        name = findViewById(R.id.name_detail);
//        category = findViewById(R.id.category_detail);
//        type = findViewById(R.id.type_detail);
//        description = findViewById(R.id.description_detail);
//
//        goBackButton = findViewById(R.id.goBack);
//
//        goBackButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                finish();
//            }
//        });
//
//    }
//}
