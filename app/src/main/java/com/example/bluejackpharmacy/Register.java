package com.example.bluejackpharmacy;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends Activity {

    EditText userName, userEmail, userPassword, userPassword2;
    Button buttonRegister;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName=findViewById(R.id.userName);
        userEmail=findViewById(R.id.userEmail);
        userPassword=findViewById(R.id.userPassword);
        userPassword2=findViewById(R.id.userPassword2);
        buttonRegister=findViewById(R.id.buttonRegister);

        buttonRegister.setOnClickListener(view -> startActivity(new Intent(Register.this, Login.class)));

//        buttonRegister.setOnClickListener(e -> {registerValidation();});
    }

//    void registerValidation(){
//
//    }

}

//Reference:
//https://codingwitht.com/registration-form-validation-in-android-studio/