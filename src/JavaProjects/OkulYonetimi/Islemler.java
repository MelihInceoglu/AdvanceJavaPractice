package JavaProjects.OkulYonetimi;

import java.util.ArrayList;
import java.util.Scanner;

public class Islemler {
    static ArrayList<Kisi> ogrenciListesi = new ArrayList<>();
    static ArrayList<Kisi> ogretmenListesi = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static String kisiTuru;

    public static void girisPaneli(){
        System.out.println("====================================\nOGRENCI VE OGRETMEN YONETIM PANELI\n" +
                "====================================\n"
                + "1- OGRENCI ISLEMLERI\n2- OGRETMEN ISLEMLERI\nQ- CIKIS");
        System.out.print("isleminiz seciniz : ");
        String secim = scan.next().toUpperCase();
        switch(secim){
            case "1":
                kisiTuru = "OGRENCI";
                islemMenusu();
                break;
            case "2":
                kisiTuru = "OGRETMEN";
                islemMenusu();
                break;
            case "Q":
                cikis();
                break;
            default:
                System.out.println("Hatalı giriş yaptınız");
                girisPaneli();
                break;
        }
    }

    private static void cikis() {
        System.out.println("Yine bekleriz");
    }

    public static void islemMenusu() {
        System.out.println("Sectiginiz  Kişi turu: " + kisiTuru + " icin  aşağıdaki işlemlerden tercih yapınız.\r\n"
                + "============= İŞLEMLER =============\r\n"
                + "     1-EKLEME\r\n"
                + "     2-ARAMA\r\n"
                + "     3-LİSTELEME\r\n"
                + "     4-SİLME\r\n"
                + "     0-ANA MENU");
        System.out.print("islem tercihinizi giriniz : ");
        int secilenIslem = scan.nextInt();
        switch(secilenIslem){
            case 1:
                ekle();
                islemMenusu();
                break;
            case 2:
                arama();
                islemMenusu();
                break;
            case 3:
                listele();
                islemMenusu();
                break;
            case 4:
                sil();
                islemMenusu();
                break;
            case 0:
                girisPaneli();
                break;
            default:
                System.out.println("Hataı giriş yaptınız");
                islemMenusu();
                break;

        }
    }

    private static void sil() {
        System.out.println("   ***   " + kisiTuru + " silme sayfası   ***");

        boolean flag = true;

        if (kisiTuru.equalsIgnoreCase("OGRENCI")){//ogrenci arıyorsa if
            scan.nextLine();//dummy
            System.out.println();//bos satır print
            System.out.print("silinecek ogrenci kimlik no giriniz : ");

            String silinecekKimlikNo=scan.next();

            for (Kisi k:ogrenciListesi) {
                if (k.getKimlikNo().equals(silinecekKimlikNo)){//flag havada
                    System.out.println("silinen ogrenci : "+k.getAdSoyad());
                    ogrenciListesi.remove(k);//ogrsc silindi
                    flag=false;
                    break;
                }

            }if (flag){//flag inince
                System.out.println("silinecek ogrenci mevcut değil ");
            }
        }else{//ogretmen aranıyor
            System.out.print("silinecek ogretmenin kimlik no giriniz : ");
            String silinecekOgrtKimlikNo=scan.next();
            for (Kisi k: ogretmenListesi) {
                if (k.getKimlikNo().equalsIgnoreCase(silinecekOgrtKimlikNo)){//flag havada
                    System.out.println("silinen ogretmen : "+k.getAdSoyad());
                    ogretmenListesi.remove(k);
                    flag=false;
                    break;
                }

            }if (flag){//flag inince
                System.out.println("silnecek ogretmen mevcut değil ");
            }
        }
    }


    private static void listele() {
        System.out.println("   ***   " + kisiTuru + " listeleme sayfası   ***");
        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {//ogrenci listeleme if
            System.out.println(ogrenciListesi);
        } else {//ogretmen listeleniyor
            for (Kisi k : ogretmenListesi) {
                System.out.println(k.toString() + " adı soyadı : " + k.getAdSoyad() + k.getYas());

            }
        }
    }

    private static void arama() {
        System.out.println("   ***   " + kisiTuru + " arama sayfası   ***");
        boolean flag=true;

        if (kisiTuru.equalsIgnoreCase("OGRENCI")){
            scan.nextLine();
            System.out.println("Aradıgınız ogrenci kimlik no giriniz");
            String arananKimlikNo = scan.nextLine();
            for (Kisi k:ogrenciListesi){
                if (k.getKimlikNo().equalsIgnoreCase(arananKimlikNo)){
                    System.out.println("Aradıgınız ogrenci "+k.getAdSoyad());
                    flag=false;
                }

            }if(flag){
                System.out.println("Aradıgınız ogrenci mevcut degil ");
            }
        }else{ // ogretmen aranıyor
            System.out.println("Aradıgınız ogretmen sicil no giriniz");
            String arananSicilNo = scan.nextLine();
            for (Kisi k:ogretmenListesi){
                if (k.getKimlikNo().equalsIgnoreCase(arananSicilNo)){
                    System.out.println("Aradıgınız ogretmen "+k.getAdSoyad());
                    flag=false;
                }

            }if(flag){
                System.out.println("Aradıgınız ogretmen mevcut degil ");
            }
        }
    }

    private static void ekle() {
        System.out.println("   ***   " + kisiTuru + " ekleme sayfası   ***");
        System.out.print("Ad Soyad giriniz : ");
        scan.nextLine();//dummy hayalet komut
        String adSoyad = scan.nextLine();
        System.out.print("kimlik No giriniz : ");
        String kimlikNo = scan.next();
        System.out.print("yas giriniz : ");
        int yas = scan.nextInt();

        if (kisiTuru.equals("OGRENCI")){
            System.out.print("Ogrenci No giriniz : ");
            String ogrcNo = scan.next();
            scan.nextLine();//dummy --> hayalet komut
            System.out.print("Sınıf giriniz : ");
            String sinif = scan.next();
            Ogrenci ogrenci = new Ogrenci(adSoyad,kimlikNo,yas,ogrcNo,sinif);
            ogrenciListesi.add(ogrenci);
        }else{
            System.out.print("Sicil No giriniz : ");
            String sicilNo = scan.next();
            scan.nextLine();//dummy --> hayalet komut
            System.out.print("Bolum giriniz : ");
            String bolum = scan.next();
            Ogretmen ogretmen = new Ogretmen(adSoyad, kimlikNo, yas, sicilNo, bolum);
            ogretmenListesi.add(ogretmen);
        }
    }
}
