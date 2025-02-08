package com.tekin.sehirrehber.model;

public class MekanModel {


    private String mekanAd;
    private String mekanFoto;
    private String location;
    public MekanModel(String mekanAd, String mekanFot) {
        this.mekanAd = mekanAd;
        this.mekanFoto = mekanFot;
    }

    public MekanModel(String mekanAd, String mekanFoto, String location) {
        this.mekanAd = mekanAd;
        this.mekanFoto = mekanFoto;
        this.location = location;
    }

    public void setMekanFoto(String mekanFoto) {
        this.mekanFoto = mekanFoto;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public MekanModel() {
    }

    public String getMekanAd() {
        return mekanAd;
    }

    public void setMekanAd(String mekanAd) {
        this.mekanAd = mekanAd;
    }

    public String getMekanFoto() {
        return mekanFoto;
    }

    public void setMekanFot(String mekanFot) {
        this.mekanFoto = mekanFot;
    }
}
