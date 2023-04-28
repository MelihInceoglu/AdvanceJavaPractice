package _04_switchCase;

import java.util.Scanner;

public class Q04_IkinciCozum {
    // Bugüne göre 100 gün sonra hangi gün olduğunuz yazdırınız.
    // pazartesi
    // Hocanın çözümü

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen gün sayısı giriniz");
        int gun = scan.nextInt();
        System.out.println("Kaç gün sonrasını öğrenmek istiyorsunuz?");
        int kacGunSonrasi = scan.nextInt();

        int bulunanGun = ((kacGunSonrasi%7)+ gun)%7;
        if (gun>0 && gun<=7){

            switch(bulunanGun){
                case 1:
                    System.out.println(kacGunSonrasi +" gün sonra Pazartesi");
                    break;
                case 2:
                    System.out.println(kacGunSonrasi +" gün sonra Salı");
                    break;
                case 3:
                    System.out.println(kacGunSonrasi +" gün sonra Çarşamba");
                    break;
                case 4:
                    System.out.println(kacGunSonrasi +" gün sonra Perşembe");
                    break;
                case 5:
                    System.out.println(kacGunSonrasi +" gün sonra Cuma");
                    break;
                case 6:
                    System.out.println(kacGunSonrasi +" gün sonra Cumartesi");
                    break;
                case 7:
                    System.out.println(kacGunSonrasi +" gün sonra Pazar");
                    break;
                default:
                    System.out.println("Hata!");
                    break;
            }
        } else System.out.println("0-7 arası bir değer giriniz");


    }


}
