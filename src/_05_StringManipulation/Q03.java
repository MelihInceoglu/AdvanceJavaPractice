package _05_StringManipulation;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimedne oluşan ismi
         Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("3 kelimeli isim giriniz");
        String str = scan.nextLine();
         int bosluk1 = str.indexOf(" ");
         int bosluk2 = str.indexOf(" ", bosluk1+1);
         String str1= str.substring(0,bosluk1).toUpperCase();
         String str2= str.substring(bosluk1+1,bosluk2).toUpperCase();
         String str3= str.substring(bosluk2+1).toUpperCase();

        System.out.println(str1+str2+str3);

        System.out.println(str1.substring(0,1).toUpperCase()+ "."+
                str2.substring(0,1).toUpperCase()+ "."+
                str3.substring(0,1).toUpperCase()+ ".");
    }
}
