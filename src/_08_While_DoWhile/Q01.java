package _08_While_DoWhile;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {
       /* TASK :
        verilen bir sayinin Armstrong sayi olup olmadigini kontrol eden code create ediniz
        Armstrong sayi rakamlarinin kuplerinin toplamina esit olan sayidir
        153 = (1*1*1) + (5*5*5) + (3*3*3) gibi

        */

        int sayi = 153;
        int tempSayi= sayi;
        int sayi2 =0;
        int i=0;

        do {
           i= tempSayi%10;
           sayi2 += (i*i*i);
           tempSayi/=10;

        }while(tempSayi%10!=0);


        if (sayi==sayi2){
            System.out.println("Armstrong sayisi");
        }else System.out.println("Armstrong sayisi degil");

    }

}
