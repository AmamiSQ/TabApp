package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.lang.reflect.Array;
import java.util.ArrayList;
import android.os.Bundle;


public class database extends AppCompatActivity {
    RecyclerView recyclerView;
    FloatingActionButton Addbutton;

    MyDatabase myDB;
    ArrayList<String> id, gebruiksnaam, wachtwoord;

    Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database);

        recyclerView = findViewById(R.id.recyclerView);
        Addbutton = findViewById(R.id.Addbutton);

        Addbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(database.this, Addactivity.class);
                startActivity(intent);
            }
        });
        myDB = new MyDatabase(database.this);
        id = new ArrayList<>();
        gebruiksnaam = new ArrayList<>();
        wachtwoord = new ArrayList<>();

        adapter = new Adapter(database.this, id, gebruiksnaam, wachtwoord);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(database.this));
        displayData();
    }

    void displayData(){
        Cursor cursor = myDB.readAllData();
        if(cursor.getCount() == 0){
            Toast.makeText(this, "er is geen data", Toast.LENGTH_SHORT).show();
        }else{
            while (cursor.moveToNext()){
                id.add(cursor.getString(0));
                gebruiksnaam.add(cursor.getString(0));
                wachtwoord.add(cursor.getString(0));
            }
        }
    }



}