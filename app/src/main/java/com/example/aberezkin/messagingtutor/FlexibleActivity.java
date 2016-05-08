package com.example.aberezkin.messagingtutor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class FlexibleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flexible);

        //Initialize toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        toolbar.setTitle("Doctor Strange");

        setSupportActionBar(toolbar);
        //Show "back" button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
}
