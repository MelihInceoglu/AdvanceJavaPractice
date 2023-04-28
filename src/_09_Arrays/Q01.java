package _09_Arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Q01 {

	/* TASK :
	 kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
	 ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
	 java code create ediniz.

	 */
	public static void main(String[] args) {
	/*	Scanner scan = new Scanner(System.in);
		System.out.println("Kac elemanli array olusturmak istiyorsunuz");
		int elemanSayisi = scan.nextInt();

		int[] sayilar = new int[elemanSayisi];

		for (int i = 0; i < sayilar.length; i++){
			System.out.println("Bir sayi giriniz");
			sayilar[i] = scan.nextInt();
		}

	 */
		int[] sayilar = IntStream.range(5,12).toArray();
		System.out.println(Arrays.toString(sayilar));

		Arrays.sort(sayilar);
		int fark = sayilar[sayilar.length - 1]- sayilar[0];

		System.out.println("1. yol "+fark);

		System.out.println("2.yol "+ (Arrays.stream(sayilar).summaryStatistics().getMax() - Arrays.stream(sayilar).summaryStatistics().getMin()));

		System.out.println("3.yol "+(Arrays.stream(sayilar).max().getAsInt() - Arrays.stream(sayilar).min().getAsInt()));


	}

}
