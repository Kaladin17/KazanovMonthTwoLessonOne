package com.kazanov.kazanovmonthtwolessonone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    MaterialButton button;
    EditText one;
    EditText two;
    EditText three;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = findViewById(R.id.first_name);
        two = findViewById(R.id.last_name);
        three = findViewById(R.id.age);
        button = findViewById(R.id.button);

        button.setOnClickListener(view -> {
            if (!one.getText().toString().isEmpty() & !two.getText().toString().isEmpty() & !three.getText().toString().isEmpty()){
                Intent intent = new Intent(MainActivity.this, MainActivityTwo.class);
                intent.putExtra("key1", one.getText().toString());
                intent.putExtra("key2", two.getText().toString());
                intent.putExtra("key3", three.getText().toString());
                startActivity(intent);
            }else {
                Toast.makeText(MainActivity.this,"Enter all fields", Toast.LENGTH_LONG).show();
            }
        });
    }
}