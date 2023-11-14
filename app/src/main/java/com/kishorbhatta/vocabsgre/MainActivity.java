package com.kishorbhatta.vocabsgre;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements android.view.View.OnClickListener{

    android.widget.ViewFlipper viewFlipper;
    Button next;
    Button previous;
    @Override
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewFlipper = (android.widget.ViewFlipper)findViewById(R.id.viewFlipper);
        next = (Button) findViewById(R.id.next);
        previous = (Button) findViewById(R.id.previous);
        next.setOnClickListener(this);
        previous.setOnClickListener(this);
    }
    @Override
    public void onClick(android.view.View v) {
        if (v == next) {
            viewFlipper.showNext();
        }
        else if (v == previous) {
            viewFlipper.showPrevious();
        }
    }
}