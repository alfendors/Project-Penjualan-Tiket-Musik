package com.example.a4516_a11201911918_alfendorizkysyachputra_utsppb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import android.os.Bundle;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.List;

public class RecyclerView extends AppCompatActivity {

    List<Concert> lstConcert ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);


        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        lstConcert = new ArrayList<>();
        lstConcert.add(new Concert("Joji","Category","Description",R.drawable.g7));
        lstConcert.add(new Concert("Billie Eilish","Category","Description",R.drawable.g3));
        lstConcert.add(new Concert("Travis Scott","Category","Description",R.drawable.g5));
        lstConcert.add(new Concert("Niki Zevanya","Category","Description",R.drawable.g2));
        lstConcert.add(new Concert("Rich Brian","Category","Description",R.drawable.g4));
        lstConcert.add(new Concert("Neck Deep","Category","Description",R.drawable.neckdeep));
        lstConcert.add(new Concert("Simple Plan","Category","Description",R.drawable.g8));
        lstConcert.add(new Concert("Drake","Category","Description",R.drawable.g9));
        lstConcert.add(new Concert("Post Malone","Category","Description",R.drawable.g6));
        lstConcert.add(new Concert("XXXTentacion","Category","Description",R.drawable.g11));
        lstConcert.add(new Concert("Juice Wrld","Category","Description",R.drawable.g12));
        lstConcert.add(new Concert("Wiz Khalifa","Category","Description",R.drawable.g13));

        androidx.recyclerview.widget.RecyclerView myrv = (androidx.recyclerview.widget.RecyclerView) findViewById(R.id.recycler_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstConcert);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);
    }
}