package com.example.sehirrehberi.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


import com.example.sehirrehberi.Adapter.YemekAdapter;
import com.example.sehirrehberi.R;
import com.example.sehirrehberi.model.YemekModel;

import java.util.ArrayList;

public class YemekActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    YemekAdapter yemekAdapter;
    ArrayList<YemekModel> yemekList;
    RecyclerView.LayoutManager yemekLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yemek);

        getSupportActionBar().hide();
        init();

        setuprecyleView();
        listeyidoldur();
        yemekAdapter.notifyDataSetChanged();
    }

    private void listeyidoldur() {

        yemekList.add(new  YemekModel( "Kibe Mumbar","http://www.e-sehir.com/yemek_tarifleri/yoresel/resim/kibe-1299.jpg"));
        yemekList.add(new YemekModel("İçli Köfte","https://img.yemektarifleri.com/photos/2118/1519305713_400.jpg"));
        yemekList.add(new YemekModel("Duvaklı Pilav","https://iasbh.tmgrup.com.tr/e81fe3/812/467/0/215/803/677?u=https://isbh.tmgrup.com.tr/sbh/2018/09/14/duvakli-pilav-1536925943167.jpg"));
    };


    private void init()
    {
        recyclerView = findViewById(R.id.yemekRecycleView);
        yemekList = new ArrayList<>() ;
        yemekAdapter = new YemekAdapter(this,yemekList);
        yemekLayoutManager = new LinearLayoutManager(getApplicationContext());

    }
    private void setuprecyleView()
    {
        recyclerView.setLayoutManager(yemekLayoutManager);
        recyclerView.setAdapter(yemekAdapter);
    }

}
