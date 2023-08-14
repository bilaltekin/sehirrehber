package com.example.sehirrehberi.fragment;


import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sehirrehberi.Adapter.KurumAdapter;
import com.example.sehirrehberi.Adapter.MekanAdapter;
import com.example.sehirrehberi.R;
import com.example.sehirrehberi.model.KurumModel;
import com.example.sehirrehberi.model.MekanModel;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class KurumlarFragment extends Fragment {

    private RecyclerView recyclerView;
    private KurumAdapter kurumAdapter;
    private ArrayList<KurumModel> kurumList;
    private RecyclerView.LayoutManager kurumLayoutManager;
    private View mainView;



    public KurumlarFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         mainView = inflater.inflate(R.layout.fragment_kurumlar, container, false);

        init();

        setuprecyleView();
        listeyidoldur();
        kurumAdapter.notifyDataSetChanged();

        return  mainView;


    }

    private void listeyidoldur() {

        kurumList.add(new KurumModel("Diyarbakır Valiliği","(0412) 280 20 00","Yenişehir, Lise Cad., 21100 Yenişehir/Diyarbakır"));
        kurumList.add(new KurumModel("Diyarbakır Büyükşehir Belediyesi"," (0412) 229 48 80","Yenişehir, Elazığ Cd., 21100 Yenişehir/Diyarbakır"));
    }

    private void init()
    {

        recyclerView = mainView.findViewById(R.id.kurumRecycleView);
        kurumList = new ArrayList<>() ;
        kurumAdapter = new KurumAdapter(getContext(),kurumList);
        kurumLayoutManager = new LinearLayoutManager(getContext());

    }
    private void setuprecyleView()
    {
        recyclerView.setLayoutManager(kurumLayoutManager);
        recyclerView.setAdapter(kurumAdapter);
    }





}
