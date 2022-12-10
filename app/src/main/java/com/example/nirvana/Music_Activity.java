package com.example.nirvana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.TextViewCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Music_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        ImageView imageView=findViewById(R.id.back_main);
        imageView.setOnClickListener(v -> {
            startActivity(new Intent(Music_Activity.this,MainActivity.class));


        });

        TextView textView=findViewById(R.id.smells);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.EMPTY.parse("https://youtu.be/hTWKbfoikeg"));
                startActivity(browserIntent);

            }
        });

        TextView textView1=findViewById(R.id.hearted) ;
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.EMPTY.parse("https://youtu.be/n6P0SitRwy8"));
                startActivity(browserIntent);
            }
        });

        TextView textView2=findViewById(R.id.lithium);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.EMPTY.parse("https://youtu.be/pkcJEvMcnEg"));
                startActivity(browserIntent);
            }
        });

        TextView textView3=findViewById(R.id.dumb);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.EMPTY.parse("https://youtu.be/4xRuxuHjBY4"));
                startActivity(browserIntent);
            }
        });

        TextView textView4=findViewById(R.id.come);
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.EMPTY.parse("https://youtu.be/vabnZ9-ex7o"));
                startActivity(browserIntent);
            }
        });






    }
}
