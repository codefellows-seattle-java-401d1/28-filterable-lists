package com.example.a28_filterable_lists;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class DetailFragment extends Fragment{


//    public TextView name;
//    public TextView category;
//    public TextView type;
//    public TextView description;
    public Button goBackButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_go_back);
//
//        name = findViewById(R.id.name_detail);
//        category = findViewById(R.id.category_detail);
//        type = findViewById(R.id.type_detail);
//        description = findViewById(R.id.description_detail);
//
        View view = inflater.inflate(R.layout.activity_detail, container, false);
        goBackButton = view.findViewById(R.id.goBack);
        goBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().finish();
            }
        });


        return view;

    }
}
