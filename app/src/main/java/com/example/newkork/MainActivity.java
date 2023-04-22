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
        DatabaseRecept Recipe= new DatabaseRecept(MainActivity.this);

        CreateTable LoaderW = new CreateTable();
        createRecipeTable LoaderR = new createRecipeTable();

        Cursor cursorW = Weine.readData();
        if (cursorW.getCount()==0){
            Weine = LoaderW.loadData(Weine);
        }
        Cursor cursorR = Recipe.readData();
        if (cursorR.getCount()==0){
            Recipe = LoaderR.loadData(Recipe);
        }

        rotwein_button = findViewById(R.id.Weiswein);
        weiswein_button = findViewById(R.id.Rotwein);
        suche_button = findViewById(R.id.Suchen);

        rotwein_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, GerichtActivity.class);
                startActivity(intent);
            }
        });

        weiswein_button.setOnClickListener(new View.OnClickListener() {
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