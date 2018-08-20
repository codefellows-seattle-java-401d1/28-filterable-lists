package droid.yutani.com.a28_filterable_lists;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import droid.yutani.com.a28_filterable_lists.fragments.SecondFragment;

public class CharList extends AppCompatActivity {
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frag_template);

        View container = findViewById(R.id.container);

        FragmentManager manager = getSupportFragmentManager();
        Fragment frag = new SecondFragment();
        if (frag == null) {
            manager.beginTransaction()
                    .add(R.id.container, new SecondFragment())
                    .commit();
        }
    }
}
