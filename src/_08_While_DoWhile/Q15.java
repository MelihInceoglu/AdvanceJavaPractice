package _08_While_DoWhile;

import java.util.Scanner;

public class Q15 {

    public static void main(String[] args) {
         /* TASK :
        Verilen iki sayının kombinasyonunu bulan kodu yazınız.
        Hatırlatma C(n,r) = n! / (r!(n-r)!)

        Ekran Çıktısı
        Birinci sayıyı giriniz: 15
        Ikinci sayıyı giriniz: 4
        Kombinasyon: 1365

        Birinci sayıyı giriniz: 5
        Ikinci sayıyı giriniz: 3
        Kombinasyon: 10

      */

        int n = 15;
        int r = 4;
        int nR = n-r;

        double nFaktoriyel =1;
        double rFaktoriyel =1;
        double nRFaktoriyel =1;

        double kombinasyon =1;

        do {
            rFaktoriyel *= r;
            r--;

        }while(r>0);

        do {
            nFaktoriyel *= n;
            n--;
        }while(n>0);

        do {
            nRFaktoriyel *= nR;
            nR--;
        }while(nR>0);


        kombinasyon = nFaktoriyel / (rFaktoriyel* nRFaktoriyel);
        System.out.println("Kombinasyon : " +kombinasyon );


    }
}

