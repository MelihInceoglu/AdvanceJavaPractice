package _05_StringManipulation;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {

		/*  TASK :
				StringMethods:
				cift uzunlukta bir degiskenin ilk yarisini konsolda yazdirmak icin bir Java programi yaziniz.
	    	    ORNEK:
		     	INPUT      :  Python
				OUTPUT :   Pyt
	    */
        String str = "HEllOy";

        if (str.length()%2==0){
            yarisiniYazdir(str);
        }else{
            yarisiDegilYazdir(str);
        }

    }

    private static void yarisiDegilYazdir(String str) {
        System.out.println("yarisini yazamiyoruz : "+ str);
    }

    private static void yarisiniYazdir(String str) {
        System.out.println(str.substring(0, str.length()/2));
    }
}
