package com.example.nirvana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Biography_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biography);
        ImageView imageView=findViewById(R.id.biography_back);
        imageView.setOnClickListener(v -> {
            startActivity(new Intent(Biography_Activity.this,MainActivity.class) );

        });
    }
}