package com.example.sehirrehberi.activity;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.sehirrehberi.R;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    Button mekanBtn,yemekBtn;
    private ImageView mainIv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
        init();
        registerButtonClickListener();
        Glide.with(this).load(R.drawable.diyarbakir).into(mainIv);
       // Picasso.get().load(R.drawable.diyarbakir).into(mainIv);
    }

    private void init()
    {
        mainIv = findViewById(R.id.mainIv);
        mekanBtn = findViewById(R.id.mekanBtn);
        yemekBtn = findViewById(R.id.yemekBtn);

    }
    private void registerButtonClickListener()
    {
        mekanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mekanintent = new Intent(MainActivity.this,TarihiMekanActivity.class);
                startActivity(mekanintent);
            }
        });

        yemekBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yemekintent = new Intent(MainActivity.this,YemekActivity.class);
                startActivity(yemekintent);
            }
        });

    }




}
