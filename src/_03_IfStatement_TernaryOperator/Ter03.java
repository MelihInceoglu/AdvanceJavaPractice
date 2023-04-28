package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ter03 {

    public static void main(String[] args) {
        /*
        TASK :
         Kullanıcıdan bir pozitif tamsayı girmesini isteyin, o pozitif tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın.
         3 basamaklı degilse çift olup olmadigini kontrol edin. Çift ise “3 basamaklı olmayan çift sayı” yazdırın.
         Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.”
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Sayı giriniz");
        int sayi = scan.nextInt();

        if (sayi >= 0){
            System.out.println((sayi <= 999 && sayi >= 100) ? "3 basamaklı" : (sayi % 2 == 0 ? "3 basamaklı olmayan çift sayı" : "3 basamaklı olmayan tek sayı"));
        } else System.out.println("Pozitif sayı giriniz");

        }

}