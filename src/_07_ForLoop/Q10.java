package _07_ForLoop;

import java.util.Scanner;

public class Q10 {
    /*
    Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
    değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
            1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

    Sesli harfler: a,e,i,o,u

    Test Data:
    a

    Beklenen Çıktı:
    a harfi sesli harfdir.

    Test Data:
    d

    Beklenen Çıktı:
    d harfi sesiz harftir.

    Test Data:
    we  yada %

    Beklenen Çıktı:
    Yanlis karakter girdiniz!

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir harf giriniz");
        char c = scan.next().charAt(0);

    /*    c=c.toLowerCase();
        int harfKontrol = c.replaceAll("[a-zA-z]","").length();
        if (c.length()>1 || harfKontrol!=0){
            System.out.println("Yanlis karakter girdiniz");
        } else {
            if (c.charAt(0)=='a'||c.charAt(0)=='e'||c.charAt(0)=='i'||c.charAt(0)=='o'||c.charAt(0)=='u'){
                System.out.println(c +" sesli harftir");
            } else System.out.println(c+" sessiz harftir");
        }

     */
        // HOCANIN ÇÖZÜMÜ

        String sesliHarfler ="aeıioöuüAEIİOÖUÜ";

        for(int i=0; i<sesliHarfler.length(); i++){
            if (c==sesliHarfler.charAt(i)){
                System.out.println("sesli harf");
                break;
            } else {
                System.out.println("sessiz harf");
            }
        }
    }

}


