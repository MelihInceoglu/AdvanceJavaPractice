package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q08 {
	/*
	 * TASK :

	 * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
	 * musteri karti olup olmadigini sorun
	 * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin 
	 * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
	 * alirsa %10 indirim yapan code create ediniz.
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Kaç adet ürün almak istiyorsunuz?");
		int adet = scan.nextInt();
		System.out.println("Ürün fiyatını giriniz");
		double fiyat = scan.nextDouble();
		System.out.println("Müşteri kartınız var mı? \n Evet için E \n Hayır için H");
		char kart = scan.next().toUpperCase().charAt(0);
		double toplamFiyat = adet * fiyat;
		double indirim;

		if (kart == 'E') {
			if (adet >= 10) {
				indirim = (toplamFiyat * 20) / 100;
				toplamFiyat = toplamFiyat - indirim;
				System.out.println(toplamFiyat);
			} else {
				indirim = (toplamFiyat * 15) / 100;
				toplamFiyat = toplamFiyat - indirim;
				System.out.println(toplamFiyat);
			}

		} else if (kart == 'H'){
			if (adet >= 10) {
				indirim = (toplamFiyat * 15) / 100;
				toplamFiyat = toplamFiyat - indirim;
				System.out.println(toplamFiyat);
			} else{
				indirim = (toplamFiyat * 10) / 100;
				toplamFiyat = toplamFiyat - indirim;
				System.out.println(toplamFiyat);
			}
		} else{
			System.out.println("Hatalı giriş yaptınız");
		}

	}

}
