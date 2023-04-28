package _07_ForLoop;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        /* TASK :
        Kullanicidan bir String isteyin. Kullanicinin girdigi
        String’in palindrome olup olmadigini kontrol eden bir program yazin.

         */

        String str = "ama";
        String tersStr ="";
        str =str.toLowerCase();
        for (int i=str.length()-1; i>=0;i--){
            tersStr += str.substring(i,i+1);
        }
        if (str.equals(tersStr)) System.out.println("palindrome");
        else System.out.println("palindrome degil");
        System.out.println(tersStr);


    }

}

