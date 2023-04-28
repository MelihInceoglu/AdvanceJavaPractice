package _11_dateTime.HaftaninSorusu;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kayit {
    List<Kullanici> kisiler = new ArrayList<>(); // kayıtAl() methodu bu liste element atayacak


    public List<Kullanici> kayıtAl(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Adınızı girin : ");
        String isim = scan.nextLine();
        Kullanici k1 = new Kullanici(isim, LocalDateTime.now());
        kisiler.add(k1);
        return kisiler;
    }

    public void sansliKullanici(List<Kullanici> kll){

        for (Kullanici k: kll){
            if (k.kayitZamani.getSecond()<10){
                System.out.println("Sanslı kisiniz "+k.name+" 5 kilo bal kazandınız");
            }
            else System.out.println("Malesef sanslı kisi degilsiniz "+k.name);
        }
    }
    public void listele(List<Kullanici> kullanicilar){
        for (Kullanici k:kullanicilar){
            System.out.println("Ad : "+ k.name+" Kayıt zamanı : "+k.kayitZamani );
        }
    }
}
