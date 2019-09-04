package com.example.sehirrehberi.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sehirrehberi.Adapter.MekanAdapter;
import com.example.sehirrehberi.R;
import com.example.sehirrehberi.model.MekanModel;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class TarihiMekanFragment extends Fragment {

    private RecyclerView recyclerView;
    private MekanAdapter mekanAdapter;
    private ArrayList<MekanModel> mekanList;
    private RecyclerView.LayoutManager mekanLayoutManager;
    private View mainView;



    public TarihiMekanFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

         mainView = inflater.inflate(R.layout.fragment_tarihi_mekan, container, false);


        init();

        setuprecyleView();
        listeyidoldur();
        mekanAdapter.notifyDataSetChanged();

        return mainView;
    }


    private void listeyidoldur() {

        mekanList.add(new MekanModel("Hasan Paşa Hanı","https://gezievreni.com/wp-content/uploads/2017/04/Hasan-Pasa-Hani-Diyarbakir.jpg","geo:37.912914,40.2369558?q=37.912914,40.2369558,20(Hasan Paşa Hanı)"));

        mekanList.add(new MekanModel("Ulu cami","http://semerkandvakfi.org/wp-content/uploads/2018/12/diyarbakir-ulu-camii-banner-1024x556.jpg","geo:37.9123646,40.2357003?q=37.9123646,40.2357003,20(Diyarbakır+Ulu+Cami)"));
        mekanList.add(new MekanModel("Sülüklü Han","https://seymenbozaslan.com/wp-content/uploads/2018/12/IMG_9759-1024x683.jpg","geo:37.9115354,40.2373282?q=37.9115354,40.2373282,20(Sülüklü+Han)"));
        mekanList.add(new MekanModel("Suluk Han","http://web.demirhotel.com.tr/images/tarih/sulukluhan.jpg","geo:41.017099,28.9402765"));


        mekanList.add(new MekanModel("Tarihi Sur","https://i.emlaktasondakika.com/Files/NewsImages2/2018/07/29/760x430/diyarbakir_138506_04876.jpg","geo:0,0?q=41.0240873,29.012031"));

        mekanList.add(new MekanModel("Hevsel Bahçeleri","https://seyyahdefteri.com/wp-content/uploads/2018/12/Hevsel-Bah%C3%A7eleri-3-620x330.jpg","geo:37.9002134,40.2392367?q=37.9002134,40.2392367,20(Hevsel Bahçeleri)"));
        mekanList.add(new MekanModel("Surp Giragos Kilisesi","http://galeri3.arkitera.com/var/resizes/Haber/2015/04/14/surpgrigos.jpg.jpg.jpeg","geo:37.910833,40.238889?q=37.910833,40.238889,20(Surp Giragos Kilisesi)"));

        mekanList.add(new MekanModel("On gözlü Köprü","https://diyarbekirde.com/wp-content/uploads/2019/05/Diyarbak%C4%B1r-On-G%C3%B6zl%C3%BC-K%C3%B6pr%C3%BC-740x300.png","geo:37.8873015,40.228318?q=37.8873015,40.228318,20(On gözlü Köprü)"));

        mekanList.add(new MekanModel("Mar Petyun Keldani Katolik Kilisesi","https://i.pinimg.com/originals/91/4f/c8/914fc858b760484e8f089caaecb449f5.jpg","geo:37.9108069,40.2379022?q=37.9108069,40.2379022,20(Mar Petyun Keldani Katolik Kilisesi)"));

        mekanList.add(new MekanModel("Meryem Ana Süryani Kadim Kilisesi","https://i0.wp.com/blog.obilet.com/wp-content/uploads/2018/03/Meryem-Ana-S%C3%BCryani-Kadim-Kilisesi.jpg","geo:37.9091298,40.2292736?q=37.9091298,40.2292736,20(Meryem Ana Süryani Kadim Kilisesi)"));
        mekanList.add(new MekanModel("Deliler Hanı","http://2.bp.blogspot.com/-E8H8GYeYYpI/VQKnLQhLmoI/AAAAAAAAAks/NBK4qQOGEnU/s1600/DEL%C4%B0LER%2BHANI.jpg","geo:37.906673,40.2336483?q=37.906673,40.2336483,20(Deliler Hanı)"));

        mekanList.add(new MekanModel("Gazi Köşkü","https://seyyahdefteri.com/wp-content/uploads/2019/01/Diyarbak%C4%B1r-Gazi-K%C3%B6%C5%9Fk%C3%BC-2.jpg","geo:37.8956018,40.2283558?q=37.8956018,40.2283558,20(Gazi Köşkü)"));

        mekanList.add(new MekanModel("Hz. Süleyman Cami","https://elifinatlasi.com/wp-content/uploads/2018/11/IMG_3234.jpg","geo:37.9148602,40.2393317?q=37.9148602,40.2393317,20(Hz. Süleyman Cami)"));




        mekanList.add(new MekanModel("Behram Paşa Cami","http://www.svbusinesshotel.com/file/behram-pasa-camii.jpg","geo:37.9094457,40.2320188?q=37.9094457,40.2320188,20(Behram Paşa Cami)"));
        mekanList.add(new MekanModel("Nebi Cami","https://www.nenerede.com.tr/wp-content/uploads/2017/05/Nebi-Cami-3.jpg","geo:37.915096,40.2342801?q=37.915096,40.2342801,20(Nebi Cami)"));
        mekanList.add(new MekanModel("Arkeoloji Müzesi","https://media-cdn.tripadvisor.com/media/photo-s/11/9c/61/bd/muze-bahcesinden-goruntu.jpg"));
        mekanList.add(new MekanModel("Fatih Paşa Cami","https://scontent-atl3-1.cdninstagram.com/vp/cd14417d2a44ea79090d32bfce5b4e0e/5DAD3699/t51.2885-15/e35/58008189_2315518385371443_6546098505634370435_n.jpg?_nc_ht=scontent-atl3-1.cdninstagram.com","geo:37.9115471,40.2405092?q=37.9115471,40.2405092,20(Fatih Paşa Cami)"));
        mekanList.add(new MekanModel("Hüsrevpaşa Camii","http://www.diyarbakiryasam.com/wp-content/gallery/husrev-pasa-camii/02.jpg","geo:37.9071203,40.2349743?q=37.9071203,40.2349743,20(Hüsrevpaşa Camii)"));
        mekanList.add(new MekanModel("Melik Ahmet Camii","https://www.kulturportali.gov.tr/repoKulturPortali/large/13022013/550077e5-2b53-48bf-b124-b8bc09702fac.JPG","geo:37.9108843,40.2280751?q=37.9108843,40.2280751,20(Melik Ahmet Camii)"));



    }

    private void init()
    {

        recyclerView = mainView.findViewById(R.id.mekanRecycleView);
        mekanList = new ArrayList<>() ;
        mekanAdapter = new MekanAdapter(getContext(),mekanList);
        mekanLayoutManager = new LinearLayoutManager(getContext());

    }
    private void setuprecyleView()
    {
        recyclerView.setLayoutManager(mekanLayoutManager);
        recyclerView.setAdapter(mekanAdapter);
    }


}
