package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QFibonacci {
     /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     1-1-2-3-5-8-13-21-34....
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Sayı giriniz");
        int verilenSayi = scan.nextInt();

        int sayi1 = 1;
        int sayi2 = sayi1;


        for (int i = 0; i <=verilenSayi;i++){

            System.out.print(sayi1+"-"+sayi2);
            sayi1 += sayi2;
            sayi2 += sayi1;

            if (sayi1>= verilenSayi || sayi2>=verilenSayi){
                break;
            }
        }
    }
}
