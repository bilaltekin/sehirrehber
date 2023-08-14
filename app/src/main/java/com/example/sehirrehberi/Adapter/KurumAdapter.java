package com.example.sehirrehberi.Adapter;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sehirrehberi.R;
import com.example.sehirrehberi.holder.KurumHolder;
import com.example.sehirrehberi.model.KurumModel;
import com.example.sehirrehberi.model.MekanModel;

import java.util.ArrayList;
import java.util.List;

public class KurumAdapter extends RecyclerView.Adapter<KurumHolder> {

    private Context context;
    private ArrayList<KurumModel> arrayList;

    public KurumAdapter(Context context, ArrayList<KurumModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }



    @NonNull
    @Override
    public KurumHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(context).inflate(R.layout.kurum_row_item,parent,false);



        return new KurumHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final KurumHolder holder, final int position) {

        holder.kurumNameTV.setText(arrayList.get(position).getKurumName());
        holder.kurumPhoneTV.setText(arrayList.get(position).getKurumPhone());
        holder.kurumLocationTV.setText(arrayList.get(position).getKurumLocation());
        holder.kurumPhoneIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(arrayList.get(position).getKurumPhone()==null)
                {
                    Toast.makeText(context, "Hatalı konum", Toast.LENGTH_SHORT).show();
                }
                else
                {



                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" + arrayList.get(position).getKurumPhone()));
                    if (intent.resolveActivity(context.getPackageManager()) != null) {
                        context.startActivity(intent);
                    }

                }
            }
        });
        holder.kurumLocationIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(arrayList.get(position).getKurumLocationGeo()==null)
                {
                    Toast.makeText(context, "Hatalı konum", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Uri location = Uri.parse(arrayList.get(position).getKurumLocationGeo());
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);


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
    }

    @Override
    public int getItemCount() {
        return arrayList.size();

    }
}
