package com.example.testlicenta;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button but = findViewById(R.id.loginButton);
        but.setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity2.class);
            intent.putExtra(EXTRA_MESSAGE, "agahaha");
            startActivity(intent);
        });

    }
}