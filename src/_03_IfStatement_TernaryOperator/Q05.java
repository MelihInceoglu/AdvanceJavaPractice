package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		/*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen yaşınızı giriniz");
		double yas = scan.nextDouble();


		if (yas > 0 && yas < 18){
			System.out.println("Kan bağışı yapamazsınız");
		}else if ( yas >= 18){
			System.out.println("Lütfen kilonuzu giriniz");
			double kilo = scan.nextDouble();

			if (kilo >0 && kilo < 50){
				System.out.println("Kan bağışı yapamazsınız");
			}else if (kilo>= 50){
				System.out.println("Kan bağışı yapabilirsiniz");
			} else {
				System.out.println("Değerleri kontrol ediniz");
			}
		} else {
			System.out.println("Hatalı değer!");
		}


	}

}
