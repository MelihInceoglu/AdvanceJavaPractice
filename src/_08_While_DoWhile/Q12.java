package _08_While_DoWhile;

import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {
         /* TASK :
        Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
        */

        int sayi = 37;
        int i =0;

        do {
           if (i%2==1){
               System.out.print(i+" ");
           }
           i++;
        }while (i<=sayi);


    }
}
