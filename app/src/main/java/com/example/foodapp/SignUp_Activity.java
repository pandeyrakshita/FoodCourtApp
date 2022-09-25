package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SignUp_Activity extends AppCompatActivity {
    Button register;
    TextView login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        getSupportActionBar().hide();

        register = findViewById(R.id.reg);
        login = findViewById(R.id.ctac);
         register.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Toast.makeText(SignUp_Activity.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                 Intent intent = new Intent(SignUp_Activity.this,Sign_In_Activity.class);
                 startActivity(intent);
             }
         });
         login.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent = new Intent(SignUp_Activity.this,Sign_In_Activity.class);
                 startActivity(intent);
             }
         });
    }
}