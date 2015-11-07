package edu.uw.facebook.readyseteat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GreenActivity extends AppCompatActivity {

    private ImageView moutputpic;
    private TextView moutputtext;
    private Button mGreenButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_green);
        moutputpic = (ImageView) findViewById(R.id.outputpic);
        moutputtext = (TextView) findViewById(R.id.message);

        mGreenButton = (Button) findViewById(R.id.button_green);
        mGreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GreenActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
