package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void new_activity(View v) {
        Intent intent = new Intent(this, SecondActivity.class);
        EditText editText = (EditText) findViewById(R.id.name);
        String message = editText.getText().toString();
        if(TextUtils.isEmpty(message)) {
            editText.setError("This field can not be empty");
            return;
        }
        intent.putExtra("name", message);
        startActivity(intent);
    }
}
