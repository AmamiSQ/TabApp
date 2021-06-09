package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class mainmenuactivity extends AppCompatActivity {


    private Button ealfabet;
    private Button ezinnen;
    private Button ewoorden;
    private Button egame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_first2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ealfabet = findViewById(R.id.button_first);
        ezinnen = findViewById(R.id.button);
        ewoorden = findViewById(R.id.button_fourth);
        egame = findViewById(R.id.button_game);
        setSupportActionBar(toolbar);

        ealfabet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mainmenuactivity.this, alfabetactivity.class));
            }
        /*FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        }); */

        });
        ezinnen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mainmenuactivity.this, zinnenactivity.class));
            }
        });
        ewoorden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mainmenuactivity.this, woordenactivity.class));
            }
        });
        egame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mainmenuactivity.this, GameActivity.class));
            }
        });
    }
}