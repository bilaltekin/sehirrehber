package com.tekin.sehirrehber.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import com.tekin.sehirrehber.R;
import com.tekin.sehirrehber.holder.YemekHolder;
import com.tekin.sehirrehber.model.YemekModel;

import java.util.ArrayList;

public class YemekAdapter extends RecyclerView.Adapter<YemekHolder> {

    private Context context;
    private ArrayList<YemekModel> arrayList;

    public YemekAdapter(Context context, ArrayList<YemekModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public YemekHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.yemek_row_item,viewGroup,false);
        return new YemekHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull YemekHolder yemekHolder, int i) {

        yemekHolder.yemekAdTv.setText(arrayList.get(i).getYemekAd());
     //   Picasso.get().load(arrayList.get(i).getYemekFoto()).into(yemekHolder.yemekIv);
        Glide.with(context).load(arrayList.get(i).getYemekFoto()).into(yemekHolder.yemekIv);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}