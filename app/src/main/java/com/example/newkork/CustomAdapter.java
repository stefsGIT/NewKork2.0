package com.example.newkork;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    private Context context;
    private Activity activity;
    private ArrayList<String> wineID, wineName, wineType;

    CustomAdapter(Activity activity, Context context,  ArrayList wineID, ArrayList wineName, ArrayList wineType){

        this.context = context;
        this.activity = activity;
        this.wineID = wineID;
        this.wineName = wineName;
        this.wineType = wineType;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.wein_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdapter.MyViewHolder holder, int position) {holder.wineID_text.setText(String.valueOf(wineID.get(position)));
        holder.wineName_text.setText(String.valueOf(wineName.get(position)));
        holder.wineType_text.setText(String.valueOf(wineType.get(position)));
    }

    @Override
    public int getItemCount() {
        return wineID.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView wineID_text, wineName_text, wineType_text;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            wineID_text = itemView.findViewById(R.id.wineID_text);
            wineName_text = itemView.findViewById(R.id.wineName_text);
            wineType_text = itemView.findViewById(R.id.wineType_text);
        }
    }
}
