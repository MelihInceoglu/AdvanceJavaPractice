package _10_List;

import java.util.*;

public class Q09 {
    public static void main(String[] args) {


    /*  Write a Java program to get a String from user as input and find the maximumCounts occurring character in that string.
         (Ignore case sensitivity)

         Kullanicidan aldiginiz bir string icinde en cok tekrar eden karakteri yazdiran code create ediniz.
       input : Learning java is easy
       output: maximumCounts occurring character is : a
        */

        String str ="Learning java is easy";

        String karakter = enCokTekrarEdenKarakter(str);

        System.out.println(karakter);

    }

    private static String enCokTekrarEdenKarakter(String str) {

        String karakter="";
        int sayac=0;
        int enCokTekrarEden =0;

        List<String> list = new ArrayList<>(Arrays.asList(str.split(""))) ;

        for (int i=0; i< list.size();i++){

            sayac=0;
            for (int j=i+1; j< list.size();j++){

                if (list.get(i).equalsIgnoreCase(list.get(j))){
                    sayac++;
                }
                if (sayac>enCokTekrarEden){
                    enCokTekrarEden=sayac;
                    karakter= list.get(i);
                } /*else if(sayac == enCokTekrarEden){
                    karakter += " , "+list.get(i);
                }
                */
            }
        }

        return karakter;
    }
}

