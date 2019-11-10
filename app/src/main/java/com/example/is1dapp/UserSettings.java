package com.example.is1dapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class UserSettings extends AppCompatActivity implements View.OnClickListener{
    private Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_settings);

        back = findViewById(R.id.btnbackSettings);
        back.setOnClickListener(this);
    }
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnbackSettings:
                Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show();
                Intent back = new Intent(this, UserMain.class);
                startActivity(back);
                break;
        }
    }
}
