package com.example.filterablelist;

import android.support.v4.app.Fragment;

public class FriendsDetailActivity extends FriendsActivity {
    @Override
    public Fragment createFragment() {
        return new Friend_Detail_Activity_Fragment();
    }
}
