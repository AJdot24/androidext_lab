package com.example.radiobutton;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText name,pass;
    Button login;
    String strEmail,strPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name= findViewById(R.id.uname);
        pass= findViewById(R.id.upass);
        login= findViewById(R.id.btnLogin);
        login.setOnClickListener(view -> {
            strEmail = name.getText().toString();
            strPassword = pass.getText().toString();

            if(strEmail.equals("aj@mail.com")&& strPassword.equals("123"))
            {
                startActivity(new Intent(MainActivity.this,MainActivity2.class));

                Toast.makeText(MainActivity.this,"Login Success",Toast.LENGTH_SHORT).show();

            }
            else
            {
                Toast.makeText(MainActivity.this,"Login Failed",Toast.LENGTH_SHORT).show();
            }
        });

    }

}