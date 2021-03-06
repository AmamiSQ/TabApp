package com.example.myapplication;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class woordenactivity extends AppCompatActivity {
    int oldValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_woorden);
        changeTextViewValueRandomlyOnButtonClick();
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }
    private void changeTextViewValueRandomlyOnButtonClick() {
        final String[] manyDifferentStrings = {"Copy", "This", "Word", "Handschrift", "Fruit", "Jongen", "Meisje", "Hamster", "Huisdier",
                "Hond", "Kat", "Dolfijn", "Moeder", "Vader", "Broer", "Zus", "Oom", "Tante",
                "Maandag", "Dinsdag", "Woensdag", "Donderdag", "Vrijdag", "Zaterdag", "Zondag",
                "Tour", "De", "France", "Tattoo", "Oog", "Muziek", "Koptelefoon", "Accepteren", "Imago", "Rood",
                "Paars", "Geel", "Groen", "Oranje", "Zwart", "Wit", "Roze", "Blauw", "Wereld", "Ecosysteem",
                "Rolverdeling", "Toneel", "School", "Studie", "Test", "Telefoon", "Nummer", "Snapchat", "Facebook",
                "Discord", "Twitter", "Instagram", "Foto", "Eiffeltoren", "Spanje", "Parijs", "Rusland",
                "Mondkapje", "Oorbellen", "Armband"};

        final TextView changingText = (TextView) findViewById(R.id.textView_word);
        Button changeTextButton = (Button) findViewById(R.id.button_word);

        changeTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int random = (int) (Math.random() * manyDifferentStrings.length);
                if (random == oldValue) {
                    random = (int) (Math.random() * manyDifferentStrings.length);
                }
                changingText.setText(manyDifferentStrings[random]);
                oldValue = random;
            }
        });
    }
}