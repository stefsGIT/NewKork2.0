package com.example.newkork;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.app.Activity;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NewActivity extends AppCompatActivity{

    RecyclerView recyclerView;
    Database myDB ;
    ArrayList<String> wineID, wineName, wineType;
    CustomAdapter customAdapter;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        recyclerView = findViewById(R.id.recyclerView);

        myDB = new Database(NewActivity.this);
        wineID = new ArrayList<>();
        wineName = new ArrayList<>();
        wineType = new ArrayList<>();

        storeDataInArrays();

        System.out.println(wineID);

        customAdapter = new CustomAdapter(NewActivity.this, this, wineID, wineName, wineType);
        recyclerView.setAdapter(customAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(NewActivity.this));
        recyclerView.addItemDecoration(new ItemDecoration(3));

        Button zurueck_button;
        Button suchewein_button;

        zurueck_button = findViewById(R.id.Zurueck2);
        suchewein_button = findViewById(R.id.suchewein_button);
        zurueck_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(NewActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    void storeDataInArrays(){
        Cursor cursor = myDB.readData();
        if(cursor.getCount()== 0) {
            Toast.makeText(this, "No data.", Toast.LENGTH_SHORT).show();
        }else{
            while (cursor.moveToNext()) {
                wineID.add(cursor.getString(0));
                wineName.add(cursor.getString(1));
                wineType.add(cursor.getString(2));

            }
        }
    }
}

