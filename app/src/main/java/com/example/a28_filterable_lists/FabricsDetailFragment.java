package com.example.a28_filterable_lists;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.a28_filterable_lists.fabrics.Fabrics;
//This Fragment is what holds the information to put into the "container" space that was created on the back activity template. It is essentially like filling in an empty div on HTML using JS like we did in 201 and 301.

//I didn't get to this point on my own. This is logic from the demo code. But it follows the same logic from the FabricsFragment that I wrote.
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
                R.layout.activity_fabrics_detail,
                container, false);
        Intent data = getActivity().getIntent();
        Fabrics fabric = Fabrics.fromIntent(data);

        name = view.findViewById(R.id.detail_name);
        category = view.findViewById(R.id.detail_category);
        type = view.findViewById(R.id.detail_type);
        description = view.findViewById(R.id.detail_description);

        name.setText(fabric.name);
        category.setText(fabric.category);
        type.setText(fabric.type);
        description.setText(fabric.description);

        return view;
    }
}
