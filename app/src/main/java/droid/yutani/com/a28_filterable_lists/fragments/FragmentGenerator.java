package droid.yutani.com.a28_filterable_lists.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import droid.yutani.com.a28_filterable_lists.R;

public abstract class FragmentGenerator extends AppCompatActivity {
    private Button mGoBackBtn;

    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frag_template);

        View container = findViewById(R.id.container);

        FragmentManager manager = getSupportFragmentManager();
        Fragment frag = manager.findFragmentById(R.id.container);
        if (frag == null) {
            manager.beginTransaction()
                    .add(R.id.container, createFragment())
                    .commit();
        }

        mGoBackBtn = findViewById(R.id.go_back_btn);
        mGoBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    public abstract Fragment createFragment();
}
