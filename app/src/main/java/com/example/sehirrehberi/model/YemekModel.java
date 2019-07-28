package com.example.sehirrehberi.model;

public class YemekModel {

    private String yemekAd;
    private String yemekFoto;

    public YemekModel(String yemekAd, String yemekFoto) {
        this.yemekAd = yemekAd;
        this.yemekFoto = yemekFoto;
    }

    public YemekModel() {
    }

    public String getYemekAd() {
        return yemekAd;
    }

    public void setYemekAd(String yemekAd) {
        this.yemekAd = yemekAd;
    }

    public String getYemekFoto() {
        return yemekFoto;
    }

    public void setYemekFoto(String yemekFoto) {
        this.yemekFoto = yemekFoto;
    }
}
