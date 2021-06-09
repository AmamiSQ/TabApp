package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    private Context context;
    private ArrayList id, gebruiksnaam, wachtwoord;
    Adapter(Context context, ArrayList id, ArrayList gebruiksmaam, ArrayList wachtwoord){
        this.context = context;
        this.id = id;
        this.gebruiksnaam = gebruiksmaam;
        this.wachtwoord = wachtwoord;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.ID.setText(String.valueOf(id.get(position)));
        holder.gebruiksnaamtxt.setText(String.valueOf(gebruiksnaam.get(position)));
        holder.wachtwoordtxt.setText(String.valueOf(wachtwoord.get(position)));

    }

    @Override
    public int getItemCount() {
        return id.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView ID, gebruiksnaamtxt, wachtwoordtxt;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            ID = itemView.findViewById(R.id.ID);
            gebruiksnaamtxt = itemView.findViewById(R.id.gebruiksnaamshow);
            wachtwoordtxt = itemView.findViewById(R.id.wachtwoordshow);
        }
    }
}
