package com.example.is1dapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DeliveryMain extends AppCompatActivity implements View.OnClickListener{
    private Button call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_main);

        call = findViewById(R.id.btnCallCustomer);

        call.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnCallCustomer:
                Toast.makeText(this, "Calling...", Toast.LENGTH_SHORT).show();
                break;
            }
        }
}
