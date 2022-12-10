package com.example.nirvana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button= findViewById(R.id.Music_button);
        button.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this,Music_Activity.class));


        });
        Button button1= findViewById(R.id.biography_button);
        button1.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this,Biography_Activity.class));

        });

    }
}