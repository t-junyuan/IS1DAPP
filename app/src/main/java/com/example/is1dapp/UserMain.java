package com.example.is1dapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class UserMain extends AppCompatActivity implements View.OnClickListener{
    private Button forcelock;
    private Button history;
    private Button settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_main);


    forcelock = findViewById(R.id.btnForceLock);
    history = findViewById(R.id.btnHistory);
    settings = findViewById((R.id.btnSettings));

    forcelock.setOnClickListener(this);
    history.setOnClickListener(this);
    settings.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnForceLock:
                Toast.makeText(this, "Force Lock Clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btnHistory:
                //Toast.makeText(this, "History Clicked", Toast.LENGTH_SHORT).show();
                Intent openHistory = new Intent(this, UserHistory.class);
                startActivity(openHistory);
                break;

            case R.id.btnSettings:
                //Toast.makeText(this, "Settings clicked", Toast.LENGTH_SHORT).show();
                Intent openSettings = new Intent(this, UserSettings.class);
                startActivity(openSettings);
                break;
        }

    }
}
