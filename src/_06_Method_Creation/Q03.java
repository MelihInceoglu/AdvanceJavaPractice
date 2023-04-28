package _06_Method_Creation;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

/*      TASK :
        Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        ceviren bir method yaziniz.

 */
        int saniye = 120;
        int mil = 15;
        int kilo = 200;

        System.out.println(saatCevir(saniye));
        System.out.println(kmCevir(mil));
        System.out.println(kiloCevir(kilo));
    }

    private static int kiloCevir(int kilo) {
        int gram = kilo*1000;
        return gram;
    }

    private static double kmCevir(double mil){
        double km = mil/1.609;
        return km;

    }

    private static int saatCevir(int saniye) {
        int saat = saniye/60;
        return saat;
    }
}

