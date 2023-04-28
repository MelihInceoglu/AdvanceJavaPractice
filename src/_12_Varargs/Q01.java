package _12_Varargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        //  verilen Stringleri birlestiren concat isimli bir method olusturunuz
        // input : "m", "e", "r", "v", "e";
        // output : merve

        String str1 = "m";
        String str2 = "e";
        String str3 = "r";
        String str4 = "v";
        String str5 = "e";
        //String sonuc = strBirlestir(str1,str2,str3,str4,str5);
       // System.out.println(sonuc);
        strBirlestir(str1,str2,str3,str4,str5);

    }


    public static void strBirlestir(String... harfler){
        String sonuc ="";

        for (String each:harfler){
            sonuc+=each;
        }

        System.out.println(sonuc);
        //return sonuc;
    }



}

