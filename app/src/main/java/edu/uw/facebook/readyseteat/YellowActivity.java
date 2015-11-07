package edu.uw.facebook.readyseteat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class YellowActivity extends AppCompatActivity {

    private ImageView moutputpic;
    private TextView moutputtext;
    private Button mYellowButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yellow);
        moutputpic = (ImageView) findViewById(R.id.outputpic);
        moutputtext = (TextView) findViewById(R.id.message);

        mYellowButton = (Button) findViewById(R.id.button_yellow);
        mYellowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(YellowActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
