package _08_While_DoWhile;

import java.util.Scanner;

public class Q06 {


	public static void main(String[] args) {
		/*TASK :
		 kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
		 kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.

		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("İki sayi giriniz");
		int bolunen = scan.nextInt();
		int bolen = scan.nextInt();

		bolme(bolunen,bolen);

	}

	private static void bolme(int bolunen, int bolen) {

		int bolum=-1;

		do {
			bolunen -= bolen;	// 15	12	9	6	3	0
			bolum++;			// 1	2	3	4	5	6
		}while(bolunen>=0);

		System.out.println("Bolum : "+ bolum);
	}

}


