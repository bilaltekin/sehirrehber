package com.example.sehirrehberi.activity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sehirrehberi.ChangeFragment;
import com.example.sehirrehberi.R;
import com.example.sehirrehberi.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        if (savedInstanceState == null) {

            ChangeFragment.getInstance(this).change( new MainFragment(), false);

        }


    }


}
