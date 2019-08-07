package com.example.sehirrehberi.fragment;


import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.sehirrehberi.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class KurumlarFragment extends Fragment {

    private View mainView;
    private TextView valiPhoneTV, belediyePhoneTV;
    private Context context;

    public KurumlarFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         mainView = inflater.inflate(R.layout.fragment_kurumlar, container, false);

        init();

        return  mainView;


    }

    private void init() {

        valiPhoneTV= mainView.findViewById(R.id.valiPhoneTV);
        belediyePhoneTV=mainView.findViewById(R.id.belediyePhoneTV);
        this.context=getContext();
    }

    public void makePhone(View view) {

        int id = view.getId();

        if(id == R.id.valiPhoneIV)
        {

            Uri number = Uri.parse("tel:"+valiPhoneTV.getText().toString());
            Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
            Intent chooser = Intent.createChooser(callIntent,"rgdsfg");

            if(callIntent.resolveActivity(context.getPackageManager()) != null)
            {

                startActivity(chooser);
            }

        }
        else
        {

            Uri number = Uri.parse("tel:"+belediyePhoneTV.getText().toString());
            Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
            startActivity(callIntent);
        }
    }

    public void goLocation(View view) {

        int id = view.getId();

        if(id == R.id.valiLocationIV)
        {

            // Map point based on address
            Uri location = Uri.parse("geo:0,0?q=1600+Amphitheatre+Parkway,+Mountain+View,+California");
            // Or map point based on latitude/longitude
            // Uri location = Uri.parse("geo:37.422219,-122.08364?z=14"); // z param is zoom level
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
            startActivity(mapIntent);
        }
        else
        {
            // Map point based on address
            Uri location = Uri.parse("geo:0,0?q=1600+Amphitheatre+Parkway,+Mountain+View,+California");
            // Or map point based on latitude/longitude
            // Uri location = Uri.parse("geo:37.422219,-122.08364?z=14"); // z param is zoom level
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
            startActivity(mapIntent);
        }
    }

}
