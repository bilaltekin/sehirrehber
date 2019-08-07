package com.example.sehirrehberi.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sehirrehberi.Adapter.YemekAdapter;
import com.example.sehirrehberi.R;
import com.example.sehirrehberi.model.YemekModel;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class YemekFragment extends Fragment {


    private RecyclerView recyclerView;
    private YemekAdapter yemekAdapter;
    private ArrayList<YemekModel> yemekList;
    private RecyclerView.LayoutManager yemekLayoutManager;
    private View mainView;

    public YemekFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         mainView = inflater.inflate(R.layout.fragment_yemek, container, false);

        init();

        setuprecyleView();
        listeyidoldur();
        yemekAdapter.notifyDataSetChanged();

        return mainView;
    }


    private void listeyidoldur() {

        yemekList.add(new  YemekModel( "Kibe Mumbar","http://www.e-sehir.com/yemek_tarifleri/yoresel/resim/kibe-1299.jpg"));
        yemekList.add(new YemekModel("İçli Köfte","https://img.yemektarifleri.com/photos/2118/1519305713_400.jpg"));
        yemekList.add(new YemekModel("Duvaklı Pilav","https://iasbh.tmgrup.com.tr/e81fe3/812/467/0/215/803/677?u=https://isbh.tmgrup.com.tr/sbh/2018/09/14/duvakli-pilav-1536925943167.jpg"));
    };


    private void init()
    {
        recyclerView = mainView.findViewById(R.id.yemekRecycleView);
        yemekList = new ArrayList<>() ;
        yemekAdapter = new YemekAdapter(getContext(),yemekList);
        yemekLayoutManager = new LinearLayoutManager(getContext());

    }
    private void setuprecyleView()
    {
        recyclerView.setLayoutManager(yemekLayoutManager);
        recyclerView.setAdapter(yemekAdapter);
    }
}
