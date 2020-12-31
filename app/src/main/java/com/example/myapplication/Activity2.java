package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    TextView temp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
      temp=findViewById(R.id.BirthdayGreetings);
       String nameis=getIntent().getStringExtra("namek");
       temp.setText("Happy Birthday "+nameis);


    }
}