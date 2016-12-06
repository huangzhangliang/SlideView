package com.webapps.slideview.slideview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView) findViewById(R.id.slideTV);
        SlideView slideView = (SlideView) findViewById(R.id.slideView);
        slideView.setSlideViewListener(new SlideView.SlideViewListener() {
            @Override
            public void onChange(String character) {
                mTextView.setText(character);
            }
        });
    }
}
