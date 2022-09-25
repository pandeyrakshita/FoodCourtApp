package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Sign_In_Activity extends AppCompatActivity {
    TextView ctac;
    Button signIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        getSupportActionBar().hide();

        ctac=findViewById(R.id.ctac);
        ctac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Sign_In_Activity.this, "Start Registration", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Sign_In_Activity.this,SignUp_Activity.class);
                startActivity(intent);
            }
        });

        signIn = findViewById(R.id.signIn);
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Sign_In_Activity.this, "Welcome to our cafe", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Sign_In_Activity.this,MainPage.class);
                startActivity(intent);
            }
        });
    }
}