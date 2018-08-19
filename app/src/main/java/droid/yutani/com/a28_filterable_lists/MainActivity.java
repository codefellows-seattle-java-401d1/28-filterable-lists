package droid.yutani.com.a28_filterable_lists;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mGoTo2;
    private Button mGoTo3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGoTo2 = findViewById(R.id.go_to_two);
        mGoTo3 = findViewById(R.id.go_to_three);

        clickListener(mGoTo2, SecondActivity.class);
        clickListener(mGoTo3, ThirdActivity.class);
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
