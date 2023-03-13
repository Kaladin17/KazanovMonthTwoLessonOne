package com.kazanov.kazanovmonthtwolessonone;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class ActivityThree extends AppCompatActivity {

    TextView tvFirstName;

    EditText lastName;

    MaterialButton button;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        tvFirstName = findViewById(R.id.tv_first_name);
        lastName = findViewById(R.id.last_name);
        button = findViewById(R.id.button_three);

        tvFirstName.setText(getIntent().getStringExtra("key1"));

        button.setOnClickListener(view -> {
            if (!lastName.getText().toString().isEmpty()) {
                Intent intent = new Intent(ActivityThree.this, ActivityFour.class);
                intent.putExtra("key2", lastName.getText().toString());
                intent.putExtra("key3", tvFirstName.getText().toString());
                startActivity(intent);
            } else {
                Toast.makeText(ActivityThree.this, "Enter last name", Toast.LENGTH_LONG).show();
            }
        });

    }
}