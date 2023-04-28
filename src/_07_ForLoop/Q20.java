package _07_ForLoop;

import java.util.Scanner;

public class Q20 {
    /*
     * SORU 1 Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak
     * Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin. Input : 30 40
     * Beklenen Cikti: 30 ve 40 icin EBOB = 10 30 ve 40 icin EKOK = 120
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("iki sayı girin");
        int sayi = scan.nextInt();
        int sayi2 = scan.nextInt();

        int ebob =0;
        int ekok=0;

        for (int i=1; i<=sayi*sayi2; i++){
            if(sayi%i==0 && sayi2%i==0){
                ebob =i;
            }

        }
        ekok = (sayi*sayi2)/ebob;

        System.out.println("Ekok : "+ ekok+"\nEbob : "+ebob);

    }
}
