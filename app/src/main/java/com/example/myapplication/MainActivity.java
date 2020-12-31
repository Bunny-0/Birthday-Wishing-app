package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   EditText mName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mName=findViewById(R.id.Text);
    }

    public void wish(View view) {

        String Name=mName.getText().toString().trim();
        Toast.makeText(this,"name is "+ Name,Toast.LENGTH_LONG).show();
        Intent send=new Intent(getBaseContext(),Activity2.class);
        send.putExtra("namek",Name);
        startActivity(send);
        
    }
}