package com.gbbeard.filterablelist;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class ThirdActivityFragment extends Fragment {
    private int clicks = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_third, container, false);
        final TextView clickDisplay = view.findViewById(R.id.clickDisplay);
        Button button = view.findViewById(R.id.clicker);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicks++;
                clickDisplay.setText("Clicks " + clicks);
            }
        });
        return view;
    }
}
