package com.example.shikhar.login_activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Second extends AppCompatActivity {
    TextView TvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TvName = (TextView) findViewById(R.id.TvName);
        Intent i = getIntent();
        String str = "Welcome, " + i.getStringExtra("name");
        TvName.setText(str);
    }
}
