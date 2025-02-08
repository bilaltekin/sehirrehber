package com.tekin.sehirrehber;

import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;




public class ChangeFragment {


    private static Context context;
    private static  ChangeFragment changeFragment;



    private ChangeFragment() {
    }

    public static ChangeFragment getInstance(Context context )
    {
        if( changeFragment == null)
        {

            changeFragment = new ChangeFragment();

        }
        ChangeFragment.context=context;
        return changeFragment;
    }



    public void  change(Fragment fragment, Boolean addbackstack)
    {


        FragmentManager fragmentManager = ((AppCompatActivity) context).getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);

        fragmentTransaction.setCustomAnimations(android.R.anim.slide_in_left,android.R.anim.slide_out_right);

        if(addbackstack)
            fragmentTransaction.addToBackStack(null);
        else
            fragmentTransaction.disallowAddToBackStack();



        fragmentTransaction.replace(R.id.frmlayout,fragment);
        fragmentTransaction.commit();


    }



}
