package com.example.sehirrehberi.activity;

import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.sehirrehberi.R;

public class KurumlarActivity extends AppCompatActivity {

    TextView valiPhoneTV, belediyePhoneTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kurumlar);

        getSupportActionBar().hide();

        init();
    }

    private void init() {

        valiPhoneTV= findViewById(R.id.valiPhoneTV);
        belediyePhoneTV=findViewById(R.id.belediyePhoneTV);
    }

    public void makePhone(View view) {

        int id = view.getId();

        if(id == R.id.valiPhoneIV)
        {

            Uri number = Uri.parse("tel:"+valiPhoneTV.getText().toString());
            Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
            Intent chooser = Intent.createChooser(callIntent,"rgdsfg");

            if(callIntent.resolveActivity(getPackageManager()) != null)
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
