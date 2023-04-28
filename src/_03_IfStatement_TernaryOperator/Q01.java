package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/* TASK :
		 * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
		 *  dort islemden biri ile isleme koyup sonucun yazdiriniz
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen iki sayı giriniz");
		double sayi1 = scan.nextDouble();
		double sayi2 = scan.nextDouble();
		System.out.println("Operatör giriniz : + - * /");
		char operator = scan.next().charAt(0);

		if (operator == '+'){
			System.out.println(sayi1 + sayi2);
		} else if(operator == '-'){
			System.out.println(sayi1-sayi2);
		}else if(operator =='*'){
			System.out.println(sayi1*sayi2);
		}else if(operator =='/'){
			System.out.println(sayi1/sayi2);
		}else {
			System.out.println("Girdiğiniz bilgileri kontrol ediniz");
		};


	}

}
