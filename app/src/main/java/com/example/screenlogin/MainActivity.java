package com.example.screenlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void yes (View view){
        Intent enter = new Intent(this,acceso.class);
        startActivity(enter);
    }
    public void correo (View view){
        Intent recupe = new Intent(this,recuperar.class);
        startActivity(recupe);
    }
}