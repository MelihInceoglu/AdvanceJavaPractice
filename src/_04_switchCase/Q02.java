package _04_switchCase;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
// 2- Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız

        Scanner scan = new Scanner(System.in);
        System.out.println("3 basamaklı bir sayı giriniz");
        int sayi = scan.nextInt();


        switch ((sayi / 100)%10) {
            case 0:
                System.out.println("3 basamaklı sayı giriniz");
                break;
            case 1:
                System.out.print("Yüz ");
                break;
            case 2:
                System.out.print("İki yüz ");
                break;
            case 3:
                System.out.print("Üç yüz ");
                break;
            case 4:
                System.out.print("Dört yüz ");
                break;
            case 5:
                System.out.print("Beş yüz ");
                break;
            case 6:
                System.out.print("Altı yüz ");
                break;
            case 7:
                System.out.print("Yedi yüz ");
                break;
            case 8:
                System.out.print("Sekiz yüz ");
                break;
            case 9:
                System.out.print("Dokuz yüz ");
                break;
        }

        switch ((sayi / 10)%10) {
            case 0:
                break;
            case 1:
                System.out.print("on ");
                break;
            case 2:
                System.out.print("yirmi ");
                break;
            case 3:
                System.out.print("otuz ");
                break;
            case 4:
                System.out.print("kırk ");
                break;
            case 5:
                System.out.print("elli ");
                break;
            case 6:
                System.out.print("altmış ");
                break;
            case 7:
                System.out.print("yetmiş ");
                break;
            case 8:
                System.out.print("seksen ");
                break;
            case 9:
                System.out.print("doksan ");
                break;

        }
        switch (sayi % 10) {
            case 0:
                break;
            case 1:
                System.out.print("bir");
                break;
            case 2:
                System.out.print("iki");
                break;
            case 3:
                System.out.print("üç");
                break;
            case 4:
                System.out.print("dört");
                break;
            case 5:
                System.out.print("beş");
                break;
            case 6:
                System.out.print("altı");
                break;
            case 7:
                System.out.print("yedi");
                break;
            case 8:
                System.out.print("sekiz");
                break;
            case 9:
                System.out.print("dokuz");
                break;
        }


    }
}
