package com.example.a28_filterable_lists;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.a28_filterable_lists.fabrics.Fabrics;

public class FabricsDetailFragment extends Fragment {
    TextView name;
    TextView category;
    TextView type;
    TextView description;

    @Override
    public View onCreateView(
            LayoutInflater inflater,
            ViewGroup container,
            Bundle savedInstanceState
    ) {
        View view = inflater.inflate(
                R.layout.activity_starfleet_personnel_detail,
                container, false);
        Intent data = getActivity().getIntent();
        Fabrics person = Fabrics.fromIntent(data);

        name = view.findViewById(R.id.detail_name);
        category = view.findViewById(R.id.detail_category);
        type = view.findViewById(R.id.detail_type);
        description = view.findViewById(R.id.detail_description);

        name.setText(person.name);
        category.setText(person.category);
        type.setText(person.type);
        description.setText(person.description);

        return view;
    }
}
