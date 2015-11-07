package edu.uw.facebook.readyseteat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class RedActivity extends AppCompatActivity {

    private ImageView moutputpic;
    private TextView moutputtext;
    private Button mRedButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_red);
        moutputpic = (ImageView) findViewById(R.id.outputpic);
        moutputtext = (TextView) findViewById(R.id.message);

        mRedButton = (Button) findViewById(R.id.button_red);
        mRedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RedActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
