package com.tekin.sehirrehber.holder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import androidx.recyclerview.widget.RecyclerView;

import com.tekin.sehirrehber.R;


public class MekanHolder extends RecyclerView.ViewHolder {

    public TextView mekanAdTv;
    public ImageView mekanIv;
    public ImageView mekanLIV;


    public MekanHolder(@NonNull View itemView) {
        super(itemView);

        mekanIv= itemView.findViewById(R.id.mekanIv);
        mekanAdTv = itemView.findViewById(R.id.mekanBaslikTv);
        mekanLIV = itemView.findViewById(R.id.mekanLIV);
    }
}
