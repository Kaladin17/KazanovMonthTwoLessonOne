package com.kazanov.kazanovmonthtwolessonone;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class ActivityFour extends AppCompatActivity {

    TextView name;
    EditText age;
    MaterialButton button;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);

        name = findViewById(R.id.name);
        age = findViewById(R.id.age);
        button = findViewById(R.id.button_four);

        name.setText(getIntent().getStringExtra("key3") + " " + getIntent().getStringExtra("key2"));

        button.setOnClickListener(view -> {
            if (!age.getText().toString().isEmpty()) {
                Intent intent = new Intent(ActivityFour.this, ActivityTwo.class);
                intent.putExtra("key4", age.getText().toString());
                intent.putExtra("key5", name.getText().toString());
                startActivity(intent);
            } else {
                Toast.makeText(ActivityFour.this, "Enter age", Toast.LENGTH_LONG).show();
            }
        });
    }
}