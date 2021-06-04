package com.example.myapplication;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class zinnenactivity extends AppCompatActivity {
    int oldValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_third);
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
        }); */
    }
    private void changeTextViewValueRandomlyOnButtonClick() {
        final String[] manyDifferentStrings = {"hello world", "The quick brown fox jumped over the lazy dog", "Ohana means family",
                "Het meisje ging lopend naar school toe", "De snelle bruine vos sprong over de luie hond",
                "Persona is een geweldige game", "De juf las een verhaaltje voor de klas", "De jongen moest naar de winkel van zijn moeder",
                "Mijn favoriete dier is een dolfijn", "Studeer nooit HBO Informatica", "Binnenkort gaan de tentamens van start",
                "Tour de France", "Ik luister elke dag naar muziek", "Heb je foto's gemaakt op vakantie?",
                "De stad was erg druk", "Dit is mijn eerste tattoeage"};

        final TextView changingText = (TextView) findViewById(R.id.textView_sen);
        Button changeTextButton = (Button) findViewById(R.id.button_sen);

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