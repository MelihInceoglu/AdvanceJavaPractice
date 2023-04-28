package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		/*
		  TASK :
		  Kullanici tarafindan girilen bir sayinin
		  mutlak degerini yazdiran code create ediniz.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayı giriniz");
		int sayi = scanner.nextInt();

		if (sayi <0){
			System.out.println(sayi * -1);
		} else System.out.println(sayi);




		
		
		
		
	}

}
