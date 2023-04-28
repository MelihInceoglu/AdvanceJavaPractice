package _06_Method_Creation;

import java.util.Scanner;

public class Q10 {

    /*
         TASK :
        powerOfThree isminde bir Parametre olarak int Return tipi boolean method create edin.
        Bir tamsayı verildiğinde, 3 üssü olup olmadığını kontrol edin. 3'ün üssü(kuvveti) ise true, değilse false return edin.
        Örnek 1:
        input: 27
        output: true

        Örnek 2:
        Girdi: 0
        Çıktı: false

     */

    public static void main(String[] args) {
        int sayi = 6561;
        System.out.println(powerOfThree(sayi));

        boolean varYok = false;

        for (int i = 3; i <= sayi; i*=3) {

            if(i==sayi) {
                varYok=true;
            }

        }
        System.out.println(varYok+" 2.çözüm");



    }

    private static boolean powerOfThree(int sayi) {
        boolean powerOfThree = false;

        for (int i = 0; i <=sayi;i++){
                if (sayi == Math.pow(3,i)) {
                    powerOfThree = true;
                }
        }
        return powerOfThree;
    }
}
