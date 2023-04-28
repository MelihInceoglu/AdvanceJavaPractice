package _15_Exceptions.Q2;

import java.util.ArrayList;

public class Okul {
    String okulAd;
    int maxOgrenciSayisi=5;
    ArrayList<Ogrenci> ogrenciListesi=new ArrayList<>();

    public Okul(){

    }
    public Okul(String okulAd, int maxOgrenciSayisi) {
        this.okulAd = okulAd;
        this.maxOgrenciSayisi = maxOgrenciSayisi;

    }
}
