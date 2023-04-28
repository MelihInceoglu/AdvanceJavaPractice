package _08_While_DoWhile;

import java.util.Scanner;

public class haftanınTaskiii {

   /* HAFTANIN TASK'iiii :-)
    Bir top belirli yükseklikten atılmaktadır.
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.

    */

    public static void main(String[] args) {

        double yukseklik = 2;
        double toplamYol =0;
        int yereVurmaSayisi=0;

        do {
            toplamYol += yukseklik;

            yereVurmaSayisi++;

            yukseklik *= 0.75;

            toplamYol += yukseklik;

        }while(yukseklik>=1);

        System.out.println("Topun vurma sayısı : "+ yereVurmaSayisi );
        System.out.println("Topun toplam aldığı yol : "+ toplamYol);


    }
}
