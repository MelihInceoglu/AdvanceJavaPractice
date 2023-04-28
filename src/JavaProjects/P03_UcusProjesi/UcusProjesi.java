package JavaProjects.P03_UcusProjesi;

import java.util.Scanner;

public class UcusProjesi {

    static Scanner scan = new Scanner(System.in);
    static String gidilecekSehir;
    static String terkEdilenSehir;
    static double biletFiyati;

    int yas;
    boolean gidisDonus;

    public static void main(String[] args) {

        System.out.println("Gitmek istediginiz sehri seçin : ");
        terkEdilenSehir = scan.next();
        System.out.println("Gitmek istediginiz sehri seçin : ");
        gidilecekSehir = scan.next();


        biletUcreti(terkEdilenSehir,gidilecekSehir);
        indirim();
    }

    private static void indirim() {
        double yonIndirim =0;
        double yasIndirimi=0;
        System.out.println("Gidiş-Dönüş : 1\nTek Yön : 2");
        int yon = scan.nextInt();

        if (yon == 1) {
            yonIndirim = biletFiyati * 0.2;
        }

        System.out.println("Yasınızı girin");
        int yas = scan.nextInt();

        if(yas<12){
            yasIndirimi = biletFiyati * 0.5;
        }else if(yas>12&&yas<24){
            yasIndirimi = biletFiyati * 0.1;
        }else if(yas>65){
            yasIndirimi = biletFiyati * 0.3;
        }



    }

    private static void biletUcreti(String terkEdilenSehir,String gidilecekSehir) {
        double birimFiyat = 0.1;

        switch (gidilecekSehir){
            case "B":
            case "C":
            case "D":

        }

    }

}
