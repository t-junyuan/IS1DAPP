package com.example.is1dapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DeliveryLogin extends AppCompatActivity implements View.OnClickListener{
    private Button back2;
    private Button deliverymain;
    private EditText DUser;
    private EditText DPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_login2);


        back2 = findViewById(R.id.back2);
        deliverymain = findViewById(R.id.btnDLogin);

        back2.setOnClickListener(this);
        deliverymain.setOnClickListener(this);


    }

    public void onClick(View v) {
        switch (v.getId()){
            case R.id.back2:
                //Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;

            case R.id.btnDLogin:

                //By right need to validate
                //validate(DUser.getText().toString(), DPassword.getText().toString());
                Intent login = new Intent(this, DeliveryMain.class);
                startActivity(login);
                break;
        }
    }
    private void validate(String dUser, String dPassword){
        if ((dUser == "admin") && (dPassword == "1234")){
            Intent login = new Intent(this, DeliveryMain.class);
            startActivity(login);
        }else{
            Toast.makeText(this, "Incorrect User/Password", Toast.LENGTH_SHORT).show();
        }
    }

}
