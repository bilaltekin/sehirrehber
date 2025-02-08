package com.tekin.sehirrehber.holder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tekin.sehirrehber.R;


public class YemekHolder extends RecyclerView.ViewHolder {

    public TextView yemekAdTv;
    public ImageView yemekIv;

    public YemekHolder(@NonNull View itemView) {
        super(itemView);

        yemekIv= itemView.findViewById(R.id.yemekIv);
        yemekAdTv = itemView.findViewById(R.id.yemekBaslikTv);
    }
}
