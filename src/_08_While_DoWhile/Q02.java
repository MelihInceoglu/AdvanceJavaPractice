package _08_While_DoWhile;

import java.util.Scanner;

public class Q02 {

    public static void main(String[] args) {
        // TASK : indexi tek sayi olan karakterleri yazdiran bir code create ediniz

        String str ="Hello World!";
        int i = 1;
        String str2="";

        do {
            str2 += str.charAt(i);
            i+=2;
        }while(i<= str.length());
        System.out.println(str2);

    }

}
