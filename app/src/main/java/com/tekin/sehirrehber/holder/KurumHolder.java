package com.tekin.sehirrehber.holder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tekin.sehirrehber.R;


public class KurumHolder extends RecyclerView.ViewHolder {

    public TextView kurumNameTV;
    public TextView kurumPhoneTV;
    public TextView kurumLocationTV;
    public ImageView kurumPhoneIV;
    public ImageView kurumLocationIV;
    public KurumHolder(@NonNull View itemView) {
        super(itemView);

        kurumNameTV = itemView.findViewById(R.id.kurumNameTV);
        kurumPhoneTV = itemView.findViewById(R.id.kurumPhoneTV);
        kurumLocationTV = itemView.findViewById(R.id.kurumLocationTV);
        kurumPhoneIV = itemView.findViewById(R.id.kurumPhoneIV);
        kurumLocationIV = itemView.findViewById(R.id.kurumLocationIV);
    }
}
