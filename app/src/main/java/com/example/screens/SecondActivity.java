package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle extras = getIntent().getExtras();
        String message = getString(R.string.hi)+ " " + extras.getString("name") + "!";
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
    }
}