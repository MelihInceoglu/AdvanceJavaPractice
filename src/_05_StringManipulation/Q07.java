package _05_StringManipulation;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */
/*
        String str = "rrr";
        str = str.toLowerCase();

       String result = str.length()==3 ? str.charAt(0)== str.charAt(1)?
                        str.charAt(1)==str.charAt(2)? "3 harf aynı": "ilk 2 harf ayni 3. farklı"
                        : str.charAt(0)==str.charAt(2)? "birinci ve sonunca harf aynı": str.charAt(1)==str.charAt(2)? "son iki harf aynı": "butun harfler farkli"
                        : "3 harfli kelime girinz";
        System.out.println(result);

 */
        String str = "artad";
        char c1 = str.charAt(0);
        char c2 = str.charAt(1);
        char c3 = str.charAt(2);

        String sonuc = str.length()==3 ? ((c1!=c2 && c1!=c3 && c2!=c3) ? "girdiginiz isim 3 harfli ve unique karaktere sahip" : "3 harfli ama unique karaktere sahip degil")
                : "girdiginiz isim 3 harfli degil";

        System.out.println(sonuc);



    }
}