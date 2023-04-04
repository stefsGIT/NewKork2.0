package com.example.newkork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button rotwein_button, weiswein_button, suche_button;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Database Weine = new Database(MainActivity.this);
        CreateTable Loader = new CreateTable();
        Weine = Loader.loadData(Weine);

        rotwein_button = findViewById(R.id.Rotwein);
        weiswein_button = findViewById(R.id.Weiswein);
        suche_button = findViewById(R.id.Suchen);

        rotwein_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, GerichtActivity.class);
                startActivity(intent);
            }
        });

        suche_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NewActivity.class);
                startActivity(intent);
            }
        });
    }
}