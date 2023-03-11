package com.kazanov.kazanovmonthtwolessonone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = findViewById(R.id.take);
    }

    @Override
    protected void onStart() {
        super.onStart();
        textView.setText("Your first name: " + getIntent().getStringExtra("key1") + "\nYour last name: " + getIntent().getStringExtra("key2") +
                "\nYour age: " + getIntent().getStringExtra("key3"));
    }
}