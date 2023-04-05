package com.example.newkork;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class NewActivity extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        Button zurueck_button;
        Button suchewein_button;

        zurueck_button = findViewById(R.id.Zurueck2);
        zurueck_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(NewActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        suchewein_button = findViewById(R.id.suchewein_button);

        suchewein_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent1 = new Intent(NewActivity.this, WeinAnzeigen.class);
                startActivity(intent1);
            }
        });


    }
}
