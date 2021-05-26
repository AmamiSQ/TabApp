package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
// import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LoginFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LoginFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private EditText eUsername;
    private EditText ePassword;
    private Button eLogin;
    // private TextView eAttemptsInfo;

    private String Username = "Admin";
    private String Password = "Admin";

    private boolean valid = false;
    private int count = 5;

    private static final int LENGTH_SHORT = 0;

    public LoginFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LoginFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static LoginFragment newInstance(String param1, String param2) {
        LoginFragment fragment = new LoginFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false);

        
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        eUsername = (EditText) getView().findViewById(R.id.Username);
        ePassword = (EditText) getView().findViewById(R.id.Password);
        eLogin = (Button) getView().findViewById(R.id.LoginButton);
        // eAttemptsInfo = (TextView) getView().findViewById(R.id.Inlogkansen);

        eLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputusername = eUsername.getText().toString();
                String inputpassword = ePassword.getText().toString();
                if (inputusername.isEmpty() || inputpassword.isEmpty()) {
                    String basecase = "basecase";
                    // Toast.makeText(LoginFragment.this, "Vul alle velden in alstublieft.", Toast.LENGTH_SHORT );
                } else {
                    valid = validate(inputusername, inputpassword);

                    if (!valid) {
                        count--;

                        if (count == 0) {
                            eLogin.setEnabled(false);
                        }
                    } else {
                        String basecase = "basecase";
                    }
                }
            }

        });
    }

    private boolean validate(String username, String password) {
        if (username.equals(Username) && password.equals(Password)) {
            return true;
        }
        return false;
    }

}



