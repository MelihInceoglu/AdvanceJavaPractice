package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		/* TASK :
		 * Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada 
		   hatali giris seklinde code create ediniz
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir harf giriniz");
		char character = scan.next().charAt(0);

		if (character >= 'A' && character <= 'Z'){
			System.out.println("Büyük harf girdiniz");
		}else if (character >= 'a' && character <= 'z'){
			System.out.println("Küçük harf girdiniz");
		} else {
			System.out.println("Hatalı giriş yaptınız");
		}

	

	}

}
