package com.tekin.sehirrehber.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.tekin.sehirrehber.ChangeFragment;
import com.tekin.sehirrehber.R;
import com.tekin.sehirrehber.fragment.MainFragment;

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
