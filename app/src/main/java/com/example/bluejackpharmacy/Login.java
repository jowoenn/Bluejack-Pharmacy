package com.example.bluejackpharmacy;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends Activity {

    Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        buttonLogin=findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(view -> startActivity(new Intent(Login.this, Register.class)));

    }
}