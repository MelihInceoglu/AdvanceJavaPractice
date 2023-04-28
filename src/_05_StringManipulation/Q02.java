package _05_StringManipulation;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       */

        Scanner scan = new Scanner(System.in);
        System.out.println("ad soyad giriniz");
        String str = scan.nextLine();

        int bosluk = str.indexOf(" ");
        String ad = str.substring(0, bosluk);
        String soyad = str.substring(bosluk);
        System.out.println("Ad : " + ad +"\n"+"Soyad : "+ soyad);
    }
}
