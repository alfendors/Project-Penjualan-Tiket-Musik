package com.example.a4516_a11201911918_alfendorizkysyachputra_utsppb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

public class ResetActivity extends AppCompatActivity {

    // Deklarasi EditText
    EditText editTextCode, editTextNewpass, editTextConpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        // Binding EditText
        editTextCode = findViewById(R.id.editTextNumberPassword);
        editTextNewpass = findViewById(R.id.editNewPassword);
        editTextConpass = findViewById(R.id.editConfirmPassword);

    }
    public void postChangePassword(View view) {
        // Validasi kosong
        if(TextUtils.isEmpty(editTextCode.getText().toString().trim()) ||
                TextUtils.isEmpty(editTextNewpass.getText().toString()) ||
                TextUtils.isEmpty(editTextConpass.getText().toString())) {
            Toast.makeText(view.getContext(), "It must be filled!",
                    Toast.LENGTH_LONG).show();
        }
        // Cek inputan new dan confirm
        else if (!editTextNewpass.getText().toString().equals(editTextConpass.getText().toString())) {
            Toast.makeText(view.getContext(), "Password not equal!", Toast.LENGTH_SHORT).show();
        }
        else {
            Intent i = new Intent(ResetActivity.this, SuccessActivity.class);
            startActivity(i);
        }
    }
}