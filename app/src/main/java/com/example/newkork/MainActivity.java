package com.example.newkork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
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

        Cursor cursorW = Weine.readData();
        if (cursorW.getCount()==0){
            Weine = Loader.loadData(Weine);
        }
        Cursor cursorR = Weine.readData();
        if (cursorR.getCount()==0){
            Weine = Loader.loadData(Weine);
        }

        rotwein_button = findViewById(R.id.Vegi);
        weiswein_button = findViewById(R.id.Fleisch);
        suche_button = findViewById(R.id.Suchen);

        rotwein_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, GerichtActivity.class);
                startActivity(intent);
            }
        });

        weiswein_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NewActivity.class);
                startActivity(intent);
            }
        });
    }
}