package com.tekin.sehirrehber.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tekin.sehirrehber.Adapter.KurumAdapter;

import com.tekin.sehirrehber.R;
import com.tekin.sehirrehber.model.KurumModel;

import java.util.ArrayList;

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
