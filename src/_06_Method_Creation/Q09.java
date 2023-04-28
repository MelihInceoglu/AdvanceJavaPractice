package _06_Method_Creation;

import java.util.Scanner;

public class Q09 {
/*
    TASK :
    addDigits isminde bir method create ediniz.
    Parametresi int
    Return tipi de int
    Pozitif int değerler ver ve en son sonuç tek basamaklı çıkana kadar basamakları birbiriyle topla.
    Tek basamaklı çıktığında, return etsin

    Örnek1:
    Girdi 38
    Çıktı: 2
    Açıklama: İşlemler şöyle olacak: 3 + 8 = 11, 1 + 1 = 2.
                 2 , tek basamaklı olduğundan, bunu döndürün.
    */

    public static void main(String[] args) {

        System.out.println(addDigits(39));
    }

    private static int addDigits(int sayi){

        int sonuc =0;

 /*       while (sayi >0){
            rakamlarToplami +=sayi%10;
            sayi/=10;
        }
        if (rakamlarToplami>=10){
            while (rakamlarToplami>0){
                sonuc += rakamlarToplami%10;
                rakamlarToplami/=10;
            }
        }

  */

        while(sayi>10){
            sayi= rakamTopla(sayi);
        }

        return sonuc;
    }

    private static int rakamTopla(int sayi) {
        int rakamlarToplami=0;
        while (sayi >0){
            rakamlarToplami +=sayi%10;
            sayi/=10;
        }
        return rakamlarToplami;

    }

}
