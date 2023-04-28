package _07_ForLoop;

import java.util.Scanner;

public class Q13 {
	
	
	public static void main(String[] args) {
		
		/* TASK :
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: <Java ogrenmek cok guzel.> Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */

		String str = "Java ogrenmek cok guzel.";
		char c = 'a';

		int sayac =0;

		for (int i = 0; i <str.length()-1; i++) {
			if(str.charAt(i)==c){
				sayac++;
			}
		}
		System.out.println(sayac);

		
		
		
	}

}
