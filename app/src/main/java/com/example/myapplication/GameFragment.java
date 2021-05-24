package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class GameFragment extends Fragment {

    int oldValue;


    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        changeTextViewValueRandomlyOnButtonClick();

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_game, container, false);
    }


    private void changeTextViewValueRandomlyOnButtonClick() {
        final String[] manyDifferentStrings = {"Help", "Mij", "Alsjeblieft", "RIP"};

        final TextView changingText = (TextView) getView().findViewById(R.id.text_to_change);
        Button changeTextButton = (Button) getView().findViewById(R.id.change_text_button);

        changeTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
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
