package com.example.a4516_a11201911918_alfendorizkysyachputra_utsppb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class ConcertActivity extends AppCompatActivity {

    private TextView tvtitle,tvdescription,tvcategory ;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concert);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        
        tvtitle = (TextView) findViewById(R.id.txtconcert);
        tvdescription = (TextView) findViewById(R.id.txtdescription);
        tvcategory = (TextView) findViewById(R.id.txtcategory);
        img = (ImageView) findViewById(R.id.concertthumbnail);

        // receive data
        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Description = intent.getExtras().getString("Description");
        int image = intent.getExtras().getInt("Thumbnail");

        // setting values
        tvtitle.setText(Title);
        tvdescription.setText(Description);
        img.setImageResource(image);
    }
}