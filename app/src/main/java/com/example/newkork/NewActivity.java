package com.example.newkork;

import android.os.Bundle;
import android.app.Activity;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class NewActivity extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        RecyclerView recyclerView;
        FloatingActionButton add_button;
        ImageView empty_imageview;
        TextView no_data;

        Database myDB;
        ArrayList<String> wineID, wineName, wineType;



    }
}
