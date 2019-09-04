package com.example.sehirrehberi.Adapter;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.sehirrehberi.R;
import com.example.sehirrehberi.holder.MekanHolder;
import com.example.sehirrehberi.model.MekanModel;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class MekanAdapter extends RecyclerView.Adapter<MekanHolder> {

    private Context context;
    private ArrayList<MekanModel> arrayList;

    public MekanAdapter(Context context, ArrayList<MekanModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public MekanHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mekan_row_item,viewGroup,false);
        return new MekanHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull final MekanHolder mekanHolder, final int i) {

        mekanHolder.mekanAdTv.setText(arrayList.get(i).getMekanAd());
        mekanHolder.mekanLIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (arrayList.get(i).getLocation()==null) {
                    Toast.makeText(context, "Hatalı konum", Toast.LENGTH_SHORT).show();
                } else {

                    // Build the intent
                    Uri location = Uri.parse(arrayList.get(i).getLocation());
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);

                    /*Intent chooser = Intent.createChooser(mapIntent,"Bir tane uygulama seçin");


                    context.startActivity(chooser);*/
                    // Verify it resolves
                PackageManager packageManager =context.getPackageManager();
                List<ResolveInfo> activities = packageManager.queryIntentActivities(mapIntent, 0);
                boolean isIntentSafe = activities.size() > 0;

                // Start an activity if it's safe
                if (isIntentSafe) {
                    context.startActivity(mapIntent);
                }
                }
                    
                
            }
        });

        Glide.with(context).load(arrayList.get(i).getMekanFoto()).into(mekanHolder.mekanIv);


    }


    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
