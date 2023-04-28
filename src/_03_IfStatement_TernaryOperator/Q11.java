package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {

    /* TASK :
        Kullanıcıdan bir tarihi gün, ay ve yıl şeklinde alıp bu tarihi
        ay, gün, yıl ve yıl, ay, gün sıralarına çevirerek yazan bir kod yazınız.



        Örnek Ekran Çıktısı
        Lütfen günü giriniz: 10
        Lütfen ayı giriniz: 02
        Lütfen yılı giriniz: 2009
        Gün ay yıl: 10.02.2009
        Ay gün yıl: 02.10.2009
        Yıl ay gün: 2009.02.10
        */

        Scanner scan = new Scanner(System.in);
        System.out.println(" Lütfen günü giriniz: ");
        int gün = scan.nextInt();
        System.out.println(" Lütfen ayı giriniz: ");
        int ay = scan.nextInt();
        System.out.println(" Lütfen yılı giriniz: ");
        int yil = scan.nextInt();

        if (gün <= 0 || ay <= 0 || yil <=0){
            System.out.println("0'dan büyük bir değer giriniz");
        } else {
            System.out.println( "Gün ay yıl : " + gün + " " + ay + " "+ yil );
            System.out.println( "Ay gün yıl : " + ay + " " + gün + " "+ yil );
            System.out.println( "Yıl ay gün : " + yil + " " + ay + " "+ gün );
        }



    }
}
