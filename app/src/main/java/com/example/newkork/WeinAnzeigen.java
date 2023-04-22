package com.example.newkork;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.newkork.CustomAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class WeinAnzeigen extends AppCompatActivity {

    RecyclerView recyclerView;
    FloatingActionButton add_button;

    Database myDB ;
    ArrayList<String> wineID, wineName, wineType;
    CustomAdapter customAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wein_row);



        myDB = new Database(WeinAnzeigen.this);
        wineID = new ArrayList<>();
        wineName = new ArrayList<>();
        wineType = new ArrayList<>();

        storeDataInArrays();

        customAdapter = new CustomAdapter(WeinAnzeigen.this,this, wineID, wineName, wineType);
        recyclerView.setAdapter(customAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(WeinAnzeigen.this));

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
