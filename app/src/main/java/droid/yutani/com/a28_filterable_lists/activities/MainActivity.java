package droid.yutani.com.a28_filterable_lists.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import droid.yutani.com.a28_filterable_lists.R;

public class MainActivity extends AppCompatActivity {
    private Button mGoToList;
    private Button mGoToDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGoToList = findViewById(R.id.go_to_list);
        mGoToDetail = findViewById(R.id.go_to_detail);

        clickListener(mGoToList, CharList.class);
        clickListener(mGoToDetail, CharDetail.class);
    }

    public void clickListener (Button button, final Class toggleClass) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, toggleClass);
                startActivity(intent);
            }
        });
    }
}
