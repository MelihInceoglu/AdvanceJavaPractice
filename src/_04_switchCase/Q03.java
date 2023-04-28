package _04_switchCase;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

// Girilen bir ay numarasına göre , ayın kaç gün olduğunu sayı ile yazdırınız
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir ay numarası giriniz");
        int ay = scan.nextInt();

        switch(ay){
            case 1:
                System.out.println("Ocak ayı 31 gündür.");
                break;
            case 2:
                System.out.println("Lütfen hangi yılda olduğunuzu giriniz");
                int yil =scan.nextInt();
                if(yil%4==0) System.out.println("Bu yıl Şubat ayı 29 gündür.");
                else System.out.println("Bu yıl Şubat ayı 28 gündür.");
                break;
            case 3:
                System.out.println("Mart ayı 31 gündür.");
                break;
            case 4:
                System.out.println("Nisan ayı 30 gündür.");
                break;
            case 5:
                System.out.println("Mayıs ayı 31 gündür.");
                break;
            case 6:
                System.out.println("Haziran ayı 30 gündür.");
                break;
            case 7:
                System.out.println("Temmuz ayı 31 gündür.");
                break;
            case 8:
                System.out.println("Ağustos ayı 31 gündür.");
                break;
            case 9:
                System.out.println("Eylül ayı 30 gündür.");
                break;
            case 10:
                System.out.println("Ekim ayı 31 gündür.");
                break;
            case 11:
                System.out.println("Kasım ayı 30 gündür.");
                break;
            case 12:
                System.out.println("Aralık ayı 31 gündür.");
                break;
            default:
                System.out.println("Geçerli bir ay numarası giriniz.");
                break;
        }


    }
}

