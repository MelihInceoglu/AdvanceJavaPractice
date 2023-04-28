package _08_While_DoWhile;

import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {
        /* TASK :
         * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
         * musteri karti olup olmadigini sorun
         *
         * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
         * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az alirsa %10
         * indirim yapin
         */

        Scanner scan = new Scanner(System.in);

        int urunAdeti;
        double listeFiyati;
        int kart;
        boolean musteriKarti = false;
        double indirim=0;
        int islem=0;

        do {
            System.out.println("Urun adedini giriniz");
            urunAdeti = scan.nextInt();
            System.out.println("Urunun liste fiyatini giriniz");
            listeFiyati = scan.nextInt();
             double toplamFiyat = listeFiyati * urunAdeti;

            System.out.println("Musteri kartiniz var mi? Evet için 1\nHayir icin 2'ye basiniz");
            kart = scan.nextInt();
            if (kart==1){
                musteriKarti = true;
            } else if( kart != 2 || kart != 1){
                System.out.println("Gecerli bir rakam giriniz.");
            }

            if (musteriKarti){
                if(urunAdeti >=10){
                    indirim = (listeFiyati*urunAdeti)*20/100;
                    System.out.println(toplamFiyat-indirim);
                }else {
                    indirim = (listeFiyati*urunAdeti)*15/100;
                    System.out.println(toplamFiyat-indirim);
                }
            } else {
                if(urunAdeti >=10){
                    indirim = (listeFiyati*urunAdeti)*15/100;
                    System.out.println(toplamFiyat-indirim);
                }else {
                    indirim = (listeFiyati*urunAdeti)*10/100;
                    System.out.println(toplamFiyat-indirim);
                }
            }

            System.out.println("İsleme devam etmek istiyor musunuz? Evet 1\nHayır 2");
            islem = scan.nextInt();
            if(islem ==2){
                break;
            }

        }while(islem == 1);

        System.out.println("İslem sonuclandi");

    }
}
