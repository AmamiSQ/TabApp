package com.example.myapplication;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ZinnenActivity extends AppCompatActivity {


    int oldValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zinnen);

        changeTextViewValueRandomlyOnButtonClick();

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    private void changeTextViewValueRandomlyOnButtonClick() {
        final String[] manyDifferentStrings = {"1", "2", "3", "4"};

        final TextView changingText = (TextView) findViewById(R.id.text_to_change);
        Button changeTextButton = (Button) findViewById(R.id.change_text_button);

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
