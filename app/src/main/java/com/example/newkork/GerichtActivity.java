package com.example.newkork;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class GerichtActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gericht);

        Button fleisch_button, vegi_button, zurueck_button;

        fleisch_button = findViewById(R.id.Fleisch);
        vegi_button = findViewById(R.id.Vegi);
        zurueck_button = findViewById(R.id.Zurueck);

        zurueck_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(GerichtActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}
