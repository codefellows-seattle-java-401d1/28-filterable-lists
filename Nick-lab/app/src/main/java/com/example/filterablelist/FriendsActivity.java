package com.example.filterablelist;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FriendsActivity extends ThemedSingleFragmentActivity {
    @Override
    public Fragment createFragment() {
        return new Friends_Activity_Fragment();
    }
}
