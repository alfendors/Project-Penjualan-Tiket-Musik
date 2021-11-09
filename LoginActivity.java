package com.example.a4516_a11201911918_alfendorizkysyachputra_utsppb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

    }

    public void clickSignup(View view) {
        Intent i = new Intent(LoginActivity.this, RegistrasiActivity.class);
        startActivity(i);
    }
    public void clickForgot(View view) {
        Intent i = new Intent(LoginActivity.this, ForgotPassword.class);
        startActivity(i);
    }
    public void clickLogin(View view) {
        Intent i = new Intent(LoginActivity.this, HomeActivity.class);
        startActivity(i);
    }
}