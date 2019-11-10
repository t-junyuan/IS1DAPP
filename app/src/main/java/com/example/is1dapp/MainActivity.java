package com.example.is1dapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList images = new ArrayList<>();
        images.add(R.drawable.bulbasaur);
        images.add(R.drawable.eevee);
        images.add(R.drawable.gyrados);
        ImageView charaImage = findViewById(R.id.charaImage);

        Button button = findViewById(R.id.button1);
        Button buttona = findViewById(R.id.button2);
        Button charButton = findViewById(R.id.charaButton);

        button.setOnClickListener((this));
        charButton.setOnClickListener(this);
        buttona.setOnClickListener(this);
    }

//    public void openUserLogin(){
//       Intent intent = new Intent(this, UserLogin.class);
//        startActivity(intent);
//    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.button1:
                Toast.makeText(this, "Entering DeliveryLogin", Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(this, DeliveryLogin.class);
                startActivity(intent1);
                break;

            case R.id.button2:
                Intent userlogin = new Intent(this, UserLogin.class);
                startActivity(userlogin);
                break;





        }



    }
}
