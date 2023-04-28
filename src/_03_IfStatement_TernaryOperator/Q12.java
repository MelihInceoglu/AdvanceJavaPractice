package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {
        /*
        TASK :
        Kullanıcıdan vize ve final notlarını alınız.
        Kullanıcın istediği oranlarda vize ve final yüzdeleri not ile not ortalamasını hesaplayıp
        not ortalamasını yazdırıp 50 ve büyük ise "Tebrikler dersi başarı ile geçtiniz..." küçük ise
        "Malesef dersten kaldınız..." yazdırınız
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Vize notunu giriniz : ");
        double vizePuanı = scan.nextDouble();

        System.out.println("Final notunu giriniz : ");
        double finalPuanı = scan.nextDouble();

        System.out.println("Hesaplama oranını giriniz : % ? ");
        double oran = scan.nextDouble();

        double ortalama = (vizePuanı + finalPuanı) * oran / 100;

        if (vizePuanı < 0 || finalPuanı < 0 || oran < 0 ){
            System.out.println("0'dan küçük değer giremezsiniz.");
        } else {
            if (ortalama >= 50){
                System.out.println("Tebrikler dersi başarı ile geçtiniz. Ortalamanız : " + ortalama);
            } else if (ortalama < 50){
                System.out.println("Malesef dersten kaldınız.Ortalamanız :  " + ortalama);
            } else {
                System.out.println("Bilgileri kontrol ediniz.");
            }
        }






    }
}
