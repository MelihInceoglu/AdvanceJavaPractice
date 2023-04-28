package _07_ForLoop;

import java.util.Scanner;

public class Q14 {

    /*  TASK :
        Girilen bir sayı kadar satır ve sütünu olan ve
        sağ kenara dayalı üçgeni basan kodu yazınız.

        Ekran Çıktısı
        Bir sayi giriniz: 5
            *
           **
          ***
         ****
        *****

        */

     /*
                    *
                    * *
                    * * *
                    * * * *
                    * * * * *
                    şeklini yazdırınız
             */

    public static void main(String[] args) {

        int sayi = 5;

        int tempsayi = sayi;

        for(int k=1;k<=sayi;k++){
            for(int l=1;l<=sayi;l++){

                if(l>=tempsayi) System.out.print("* ");
                else System.out.print(" ");

            }
            tempsayi--;
            System.out.println();
        }









    }
}
