package droid.yutani.com.a28_filterable_lists.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import droid.yutani.com.a28_filterable_lists.R;

public class SecondFragment extends Fragment {
    @Override
    public View onCreateView (
            LayoutInflater inflater,
            ViewGroup container,
            Bundle savedInstanceState
    ) {
        View view = inflater.inflate(R.layout.activity_second, container, false);

        return view;
    }
}
