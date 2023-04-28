package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		// TASK:
		// Kullanıcının girdiği yılın artık yıl olup olmadığını kontrol eden code create ediniz.
		/*
		Eğer bir yılın son iki rakamı "00" değilse ve bu sayı 4 e tam bölünebiliyorsa bu yıl artık yıldır.
		Örnek: 2008 yılı artık yıldır. Son iki rakamı "00" değildir ve 4 e bölünebilen bir sayıdır.
		2) Eğer bir yılın son iki rakamı "00" ise bu sayının 400 e tam bölünmesi durumunda yine bu yıl yine artık yıldır.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Yıl giriniz");
		int yil = scan.nextInt();

		if (yil%10 != 0 && yil%4 == 0 ){
			System.out.println("Artık yıl");
		}else System.out.println("Artık yıl değil");

	}

}
