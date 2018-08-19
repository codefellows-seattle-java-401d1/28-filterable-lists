package com.example.a28_filterable_lists;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.a28_filterable_lists.starfleet.Fabrics;

public class StarfleetPersonnelDetailFragment extends Fragment {
    TextView name;
    TextView rank;
    TextView bio;

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
        rank = view.findViewById(R.id.detail_rank);
        bio = view.findViewById(R.id.detail_bio);

        name.setText(person.name);
        rank.setText(person.rank);
        bio.setText(person.bio);

        return view;
    }
}
