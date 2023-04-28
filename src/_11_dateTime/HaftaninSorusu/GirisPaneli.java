package _11_dateTime.HaftaninSorusu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GirisPaneli {
    public static void panel(){
        Scanner scan = new Scanner(System.in);
        Kayit yeniKayit = new Kayit();
        List<Kullanici> kisi = new ArrayList<>();
        boolean cikilsinMi=false;

        while (!cikilsinMi) {
            System.out.println("Kayıt al: 1\nSanslı kisi bul: 2\nKisileri listele: 3\nCıkıs: 4");
            System.out.println("İsleminizi seciniz : ");
            int islem = scan.nextInt();
            switch(islem){
                case 1:
                    kisi=yeniKayit.kayıtAl(); // kisi listi degerini yeniKayıt obj ile kayıtAl() method call dan alacak
                    break;
                case 2:
                    yeniKayit.sansliKullanici(kisi);
                    break;
                case 3:
                    yeniKayit.listele(kisi);
                    break;
                case 4:
                    cikilsinMi=true;
                    break;
                default:
                    System.out.println("Hatalı veri girdiniz");


            }
        }
    }

}
