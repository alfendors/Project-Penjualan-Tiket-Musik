package com.example.a4516_a11201911918_alfendorizkysyachputra_utsppb;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

public class ForgotPassword extends AppCompatActivity {

    EditText editTextEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        editTextEmail = findViewById(R.id.edit_text_email);

    }

    public void postSend(View view) {

         if(TextUtils.isEmpty(editTextEmail.getText().toString().trim())){
             Toast.makeText(view.getContext(),  "Email should not be empty!", Toast.LENGTH_LONG).show();
                 }

         else
             if (!isValidEmail(editTextEmail.getText().toString().trim())){
                 Toast.makeText(view.getContext(), "Email  not valid!", Toast.LENGTH_LONG).show();
                 }
             else {
                 Intent  i = new Intent(ForgotPassword.this, ResetActivity.class);
                 startActivity(i);
             }
}

    public static boolean isValidEmail (CharSequence email){
        return (Patterns.EMAIL_ADDRESS.matcher(email).matches());
}
}