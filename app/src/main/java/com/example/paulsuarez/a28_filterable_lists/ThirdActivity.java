package com.example.paulsuarez.a28_filterable_lists;

import android.support.v4.app.Fragment;

public class ThirdActivity extends ThemedSingleFragmentActivity {

    @Override
    public int getHeaderDrawableId() {
        return R.drawable.hearthstonegroup;
    }

    public Fragment createFragment() {
        return new ThirdFragment();
    }


}
