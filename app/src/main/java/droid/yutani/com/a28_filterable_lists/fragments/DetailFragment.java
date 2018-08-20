package droid.yutani.com.a28_filterable_lists.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import droid.yutani.com.a28_filterable_lists.R;
import droid.yutani.com.a28_filterable_lists.model.BebopCharacter;

public class DetailFragment extends Fragment {
    private ImageView mPicture;
    private TextView mName;
    private TextView mJob;
    private TextView mDesc;


    @Override
    public View onCreateView (
            LayoutInflater inflater,
            ViewGroup container,
            Bundle savedInstanceState
    ) {
        View view = inflater.inflate(R.layout.activity_detail, container, false);

        Intent data = getActivity().getIntent();
        BebopCharacter character = BebopCharacter.fromIntent(data);

        mName = view.findViewById(R.id.detail_name);
        mJob = view.findViewById(R.id.detail_job);
        mDesc = view.findViewById(R.id.detail_desc);

        mName.setText(character.name);
        mJob.setText(character.job);
        mDesc.setText(character.desc);

        return view;
    }
}
