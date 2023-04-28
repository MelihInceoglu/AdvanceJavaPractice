package _07_ForLoop;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

        /* TASK :
        Girilen bir stringdeki a harfi sayısını bulunuz.
        ama  c harfine  gelirse döngüden çıkılsın

        Bugün hava oldukca güzel.-> 2
         str.CharAt(0)

         */

        String str = "Bugün hava oldukca güzel.";

        int harfSayisi=0;
        str = str.toLowerCase();
        int i =0;

        while (i<=str.length()-1){
            if (str.charAt(i) == 'c'){
                break;
            } else {
                    if (str.charAt(i) == 'a'){
                        harfSayisi++;
                }
            }
            i++;
        }
        System.out.println(harfSayisi);


    }
}
