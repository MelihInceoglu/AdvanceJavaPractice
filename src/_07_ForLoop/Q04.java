package _07_ForLoop;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {
       /* TASK :
        Kullanıcıdan 5 adet sayı isteyiniz
        Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        */
        Scanner scan = new Scanner(System.in);
        int sayac =0;
        int sayi=0;
        int toplam =0;


        do {
            System.out.println("Bir sayı giriniz");
            sayi = scan.nextInt();
            sayac++;
            if (sayi<5 || sayi>10){
                toplam +=sayi;
            }
        }while(sayac <=5);
        System.out.println(toplam);

    }

}
