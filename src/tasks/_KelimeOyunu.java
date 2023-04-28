package tasks;

import java.util.Scanner;

public class _KelimeOyunu {
    /* Iki kisinin oynayacagi bir kelime oyunu uretelim
     * Kurallar
     * 1- Baslangicta 1.oyuncudan bir kelime girmesini isteyin ve kelimeyi yazdirin
     *
     * 2- 1.oyuncu kelimeyi girince 2.oyuncuya kelimeyi kabul edip etmedigini sorun.
     *      * Eger kelimeyi kabul ederse onceki oyuncuya kelimedeki harf sayisi kadar puan ekleyin
     *        ve 3.adima gecin
     *      * girilen kelimeyi kabul etmezse "gecersiz kelime" yazdirin ve onceki oyuncunun
     *        kazandigini yazip oyunu bitirin
     *
     * 3- yeni oyuncuya oyuna devam etmek isteyip istemedigini sorun
     *      * devam etmek isterse kelimeye eklemek istedigi string'i ve
     *          basa mi sona mi ekleyecegini sorun
     *          aldiginiz string'i kelimeye ekleyip 2.adima gidin
     *
     *      *   Devam etmek istemezse
     *          "Oyun bitti" yazin
     *          kullanicilarin puanlarini ve kazanan oyuncuyu yazdirin
     */

    static Scanner scan = new Scanner(System.in);
    static int birinciOyuncuPuan=0;
    static int ikinciOyuncuPuan=0;
    static String kelime="";
    static int kelimeKabul;
    static int oyunaDevam =0;
    static int tur=1;

    public static void main(String[] args) {

        kelimeAl();

    }
    private static void kelimeAl(){

        System.out.println("Kelime girin");
        kelime = scan.next();
        kelimeKabul();

    }
    private static void kelimeKabul(){
        System.out.println("Kelimeyi kabul ediyor musunuz? Evet:1 Hayır:2");
        kelimeKabul = scan.nextInt();
        if (kelimeKabul == 1){
            puanEkle();
            oyunaDevam();

        }else if(kelimeKabul == 2){
            System.out.println("Geçersiz kelime");
            oyunBitti();
        }else{
            System.out.println("Evet icin 1, Hayır icin 2 girin");
            kelimeKabul();
        }


    }
    private static void metinEkle(){
        System.out.println("Kelimenin başına mı sonuna mı metin eklemek istersiniz: Başı 1 Sonu 2 ");
        int metinEkle= scan.nextInt();
        System.out.println("Ne eklemek istersin?");
        String metin = scan.next();
        if (metinEkle == 1){
            kelime = metin+kelime;
            System.out.println(kelime);
            kelimeKabul();
        }else if (metinEkle == 2){
            kelime = kelime + metin;
            System.out.println(kelime);
            kelimeKabul();
        }else{
            System.out.println("Başı 1 Sonu 2");
            metinEkle= scan.nextInt();
            metinEkle();
        }
    }
    private static void puanEkle(){

        if (tur%2==1){
            birinciOyuncuPuan = kelime.length();
            System.out.println("1. oyuncu puan kazandı : "+ birinciOyuncuPuan);
        }else{
            ikinciOyuncuPuan = kelime.length();
            System.out.println("2. oyuncu puan kazandı : "+ ikinciOyuncuPuan);
        }
        tur++;
    }
    private static void oyunaDevam(){
        System.out.println("Oyuna devam etmek istiyor musunuz: Evet:1 Hayır:2");
        oyunaDevam= scan.nextInt();
        if (oyunaDevam == 1){
            metinEkle();
        }else if(oyunaDevam == 2){
            oyunBitti();
        }else{
            System.out.println("Evet icin 1, Hayır icin 2 girin");
            oyunaDevam();
        }
    }
    private static void oyunBitti(){
        System.out.println("Oyun bitti");
        System.out.println("1. oyuncunun puanı : "+ birinciOyuncuPuan);
        System.out.println("2. oyuncunun puanı : "+ ikinciOyuncuPuan);

        if(birinciOyuncuPuan>ikinciOyuncuPuan){
            System.out.println("1. oyuncu kazandı");
        }else if(ikinciOyuncuPuan>birinciOyuncuPuan){
            System.out.println("2. oyuncu kazandı");
        } else System.out.println("Berabere");
    }


}
