package com.example.is1dapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserHistory extends AppCompatActivity implements View.OnClickListener {
    private Button backHistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_history);

        backHistory = findViewById(R.id.btnbackHistory);
        backHistory.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnbackHistory:
                Intent intent = new Intent(this, UserMain.class);
                startActivity(intent);
                break;
        }
    }
}
