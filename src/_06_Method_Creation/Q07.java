package _06_Method_Creation;

import java.util.Scanner;

public class Q07 {
    /*      TASK:
        reverseString isminde bir method create ediniz.
        Bu method bir String'i parametre olarak alsın.
        Ve bu method, girilen String'i tersten print etsin.


        Örn: String = "Java'yı Seviyorum."
        Print: .muroyiveS ıy'avaJ
         */

    public static void main(String[] args) {
        String str ="Java";
        System.out.println(tersStr(str));
    }

    private static String tersStr(String str) {
        String tersStr="";

        for (int i = str.length()-1; i >=0; i--){
            tersStr += str.charAt(i);
        }
        return tersStr;
    }

}
