package com.tekin.sehirrehber.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.tekin.sehirrehber.ChangeFragment;
import com.tekin.sehirrehber.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {


    private Button mekanBtn,yemekBtn,hastaneBTN,kurumBTN;
    private ImageView mainIv;
    private View mainView;

    private ChangeFragment changeFragment;

    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         mainView = inflater.inflate(R.layout.fragment_main, container, false);

        init();
        registerButtonClickListener();
        Glide.with(this).load(R.drawable.diyarbakir).into(mainIv);

         return mainView;
    }

    private void init()
    {
        mainIv = mainView.findViewById(R.id.mainIv);
        mekanBtn = mainView.findViewById(R.id.mekanBtn);
        yemekBtn = mainView.findViewById(R.id.yemekBtn);
        hastaneBTN = mainView.findViewById(R.id.hastaneBtn);
        kurumBTN = mainView.findViewById(R.id.kurumBtn);
        changeFragment=ChangeFragment.getInstance(getContext());

    }
    private void registerButtonClickListener()
    {
        mekanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                changeFragment.change(new TarihiMekanFragment(),true);
                }
        });

        yemekBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeFragment.change(new YemekFragment(),true);

                    }
        });
        kurumBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeFragment.change(new KurumlarFragment(),true);

            }
        });



    }

}
