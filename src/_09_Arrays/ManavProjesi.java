package _09_Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManavProjesi {
    /*
     * Basit bir 5 ürünlü manav alisveris programi yaziniz.
     *
     * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
     * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
     *            istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
     *            Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
     * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
     * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
     *
     * */

     static List<String> urunListesi = new ArrayList<String>();
     static List<Double> urunFiyatlari = new ArrayList<Double>();
     static double toplamOdeme;
     static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        urunListesi.add("Domates - urunkodu: 1");
        urunListesi.add("Muz - urunkodu: 2");
        urunListesi.add("Elma - urunkodu: 3");
        urunListesi.add("Cilek - urunkodu: 4");
        urunListesi.add("Erik - urunkodu: 5");

        urunFiyatlari.add(15.0);
        urunFiyatlari.add(18.0);
        urunFiyatlari.add(8.0);
        urunFiyatlari.add(47.0);
        urunFiyatlari.add(27.0);

        musteriSecim();
    }

    private static void musteriSecim() {
        System.out.println(urunListesi);
        System.out.println("Ürün kodunu giriniz");
        int secim = scan.nextInt();
        System.out.println("Kaç kilo alacaksınız");
        double kilo = scan.nextDouble();

        double urunTutari = kilo* urunFiyatlari.get(secim-1);
        toplamOdeme += urunTutari;

        islemDevam();

    }

    private static void islemDevam() {
        System.out.println("Alısverise devam etmek icin 1\nKasa icin 2'ye basiniz");
        int devamTamam = scan.nextInt();

        if (devamTamam==1){
            musteriSecim(); // recursive method
        }else if(devamTamam==2){
            kasa();
        } else System.out.println("Gecerli bir islem seciniz");

    }

    private static void kasa() {
        System.out.println("Toplam ödemeniz : "+ toplamOdeme+" TL'dir.");
    }
}
