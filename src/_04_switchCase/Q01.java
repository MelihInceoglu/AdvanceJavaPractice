package _04_switchCase;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/*
		TASK :
		Kullanıcıdan notunu alın ve aşağıdaki kurallara göre console'a A, B, C veya D yazdırın.
		1. 0(dahil) ile 50 arasi - D
		2. 50(dahil) ile 60 arası - C
		3. 60(dahil) ile 80 arası - B
		4. 80(dahil) ustu- A
		Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin
		
		AHAN DA  TRICK :) switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
		switch() de int, byte, short, char, String kullanilir.

		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Notunuzu giriniz");
		int not = scan.nextInt();
		int durum = 0;

		if (not >= 0 && not < 50) {
			durum = 1;
		} else if (not >= 50 && not < 60) {
			durum = 2;
		} else if (not >= 60 && not < 80) {
			durum = 3;
		} else if (not >= 80 && not <= 100) {
			durum = 4;
		}
		switch (durum) {
			case 1:
				System.out.println("D");
				break;
			case 2:
				System.out.println("C");
				break;
			case 3:
				System.out.println("B");
				break;
			case 4:
				System.out.println("A");
				break;
			default:
				System.out.println("Gecerli not giriniz");
				break;
		}

		System.out.println("--------");

		if (not < 0 || not > 100) {
			System.out.println("Lutfen gecerli not giriniz...");
		} else {
			switch (not) {
				case 0:
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
				case 6:
				case 7:
				case 8:
				case 9:
					System.out.println("D");
					break;
			}
			switch (not / 10) {
				case 1:
				case 2:
				case 3:
				case 4:
					System.out.println("D");
					break;
				case 5:
					System.out.println("C");
					break;
				case 6:
				case 7:
					System.out.println("B");
					break;
				case 8:
				case 9:
				case 10:
					System.out.println("A");
					break;
			}
		}
	}
}
