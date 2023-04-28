package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q04 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.

         */

        List<String> ogrenciler = new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Can","Canan","Han","Handan"));

        List<Double> ogrencinotlari = notGir(ogrenciler);
        double ortalama = ortalamaBul(ogrencinotlari);
        List<String> ortalamaUstuOgrenciler = ortalamaUstuOgrencileriBul(ogrenciler, ogrencinotlari,ortalama);

        System.out.println("Sınıf ortalaması : "+ ortalama);
        System.out.println("Ortalamanın üzerindeki ogrenciler : " + ortalamaUstuOgrenciler);

    }

    private static double ortalamaBul(List<Double> notlar) {
        double ortalama;
        double toplam=0;
        for (int i = 0; i <notlar.size(); i++) {
            toplam += notlar.get(i);
        }
        ortalama= toplam/ notlar.size();
        return ortalama;

    }

    private static List<Double> notGir(List<String> ogrenciler) {

        List<Double> notlar = new ArrayList<>();

        for (int i=0; i<ogrenciler.size(); i++) {
            System.out.println(ogrenciler.get(i)+" ögrencinin notunu girin");
            notlar.add(scan.nextDouble());
        }
        return notlar;
    }

    private static List<String> ortalamaUstuOgrencileriBul(List<String> ogrenciler, List<Double> ogrencinotlari, double ortalama) {

        List<String> ortalamaUstuOgrenciler = new ArrayList<String>();

        for (int i = 0; i <ogrencinotlari.size();i++){
            if (ogrencinotlari.get(i)>ortalama){
                ortalamaUstuOgrenciler.add(ogrenciler.get(i));
            }
        }
        return ortalamaUstuOgrenciler;
    }
}
