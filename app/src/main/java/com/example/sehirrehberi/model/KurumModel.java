package com.example.sehirrehberi.model;

import android.widget.TextView;

public class KurumModel {

    private String kurumName;
    private String kurumPhone;
    private String kurumLocation;
    private String kurumLocationGeo;

    public KurumModel(String kurumName, String kurumPhone, String kurumLocation) {
        this.kurumName = kurumName;
        this.kurumPhone = kurumPhone;
        this.kurumLocation = kurumLocation;
    }

    public KurumModel(String kurumName, String kurumPhone, String kurumLocation, String kurumLocationGeo) {
        this.kurumName = kurumName;
        this.kurumPhone = kurumPhone;
        this.kurumLocation = kurumLocation;
        this.kurumLocationGeo = kurumLocationGeo;
    }

    public String getKurumLocationGeo() {
        return kurumLocationGeo;
    }

    public void setKurumLocationGeo(String kurumLocationGeo) {
        this.kurumLocationGeo = kurumLocationGeo;
    }





    public String getKurumName() {
        return kurumName;
    }

    public void setKurumName(String kurumName) {
        this.kurumName = kurumName;
    }

    public String getKurumPhone() {
        return kurumPhone;
    }

    public void setKurumPhone(String kurumPhone) {
        this.kurumPhone = kurumPhone;
    }

    public String getKurumLocation() {
        return kurumLocation;
    }

    public void setKurumLocation(String kurumLocation) {
        this.kurumLocation = kurumLocation;
    }
}
