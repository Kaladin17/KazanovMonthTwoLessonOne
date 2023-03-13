package com.kazanov.kazanovmonthtwolessonone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        textView = findViewById(R.id.take);

        textView.setText("Your first name: " + getIntent().getStringExtra("key1") + "\nYour last name: " + getIntent().getStringExtra("key2") +
                "\nYour age: " + getIntent().getStringExtra("key3"));
    }
}