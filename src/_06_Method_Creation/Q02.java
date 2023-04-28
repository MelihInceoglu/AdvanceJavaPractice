package _06_Method_Creation;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
		/*
		name1 ve name2 degiskenlerini olusturun.
		name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
		name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirinan bir method oluşturun
		          e.g:
		         name1= mehmet
		         name2= ahmet
		         Print ==> mehahmetmet
		*/

        String name1 = "mehmet";
        String name2 = "ahmet";

        myMethod(name1,name2);
    }
    private static void myMethod(String str1, String str2){
        if (str1.length()%2==0){
            System.out.println(str1.substring(0,str1.length()/2) + str2 + str1.substring(str1.length()/2));
        } else System.out.println("İlk kelime cift sayili olmadigi icin ortasina yerlestiremedik");

    }





}
