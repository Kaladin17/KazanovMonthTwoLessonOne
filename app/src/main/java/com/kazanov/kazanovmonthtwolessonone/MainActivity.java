package com.kazanov.kazanovmonthtwolessonone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    MaterialButton button;
    EditText firstName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstName = findViewById(R.id.first_name);
        button = findViewById(R.id.button);

        button.setOnClickListener(view -> {
            if (!firstName.getText().toString().isEmpty()){
                Intent intent = new Intent(MainActivity.this, ActivityThree.class);
                intent.putExtra("key1", firstName.getText().toString());
                startActivity(intent);
            }else {
                Toast.makeText(MainActivity.this,"Enter name", Toast.LENGTH_LONG).show();
            }
        });
    }
}