package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Addactivity extends AppCompatActivity {

    EditText gebruiksnaamadd, wachtwoordadd;
    Button Addbutton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addactivity);

        gebruiksnaamadd = findViewById(R.id.gebruiksnaamadd);
        wachtwoordadd = findViewById(R.id.wachtwoordadd);
        Addbutton2 = findViewById(R.id.Addbutton2);


        Addbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDatabase myDB = new MyDatabase(Addactivity.this);
                myDB.addAcount(gebruiksnaamadd.getText().toString(), wachtwoordadd.getText().toString());
            }
        });
    }
}