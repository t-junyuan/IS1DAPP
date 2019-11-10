package com.example.is1dapp;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UserLogin extends AppCompatActivity implements View.OnClickListener{
    private Button button;
    private EditText User;
    private EditText Password;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button back = findViewById(R.id.back);
        User = findViewById(R.id.etUser);
        Password = findViewById(R.id.etPassword);
        login = findViewById(R.id.btnLogin);
        back.setOnClickListener(this);
        login.setOnClickListener(this);


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

//    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.back:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;

            case R.id.btnLogin:
                //Toast.makeText(this, "Login Clicked", Toast.LENGTH_SHORT).show();
                validate(User.getText().toString(), Password.getText().toString());
                break;

        }
    }

    private void validate(String userName, String userPassword){

        Toast.makeText(this, userName + " " + userPassword, Toast.LENGTH_SHORT).show();
        //Toast.makeText(this, "Validate attempt", Toast.LENGTH_SHORT).show();
        String admin = userName;
        String pw = userPassword;
        if ((userName == admin) && (userPassword == pw)){
            Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show();
            Intent login = new Intent(UserLogin.this, UserMain.class);
            startActivity(login);
        }else{
            Toast.makeText(this, "Username/Password Incorrect", Toast.LENGTH_SHORT).show();

            //Temporary bypass because I can't fucking figure out how to make the login work
            Intent login = new Intent(UserLogin.this, UserMain.class);
            startActivity(login);
        }
    }
}
