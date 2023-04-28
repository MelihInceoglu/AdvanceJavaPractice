package _09_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		/*
		 * Anagram, bir kelimenin harflerinden baska bir kelime olusturmaya denir.
			Kullanıcıdan alınacak  iki kelimenin Anagram durumunu belirleyen  Java kodunu yazınız.
			isAnagram("listen", "Silent") ==> true
		 */

		String str1 = "Listen";
		String str2 = "Silent";

		System.out.println(isAnagram(str1, str2));


	}

	private static boolean isAnagram(String str1, String str2) {

		boolean isAnagram = false;

		str1= str1.toLowerCase();
		str2 = str2.toLowerCase();

		String[] arr1 = str1.split("");
		String[] arr2 = str2.split("");

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		if (Arrays.equals(arr1, arr2)){
			isAnagram = true;
		}

		return isAnagram;
	}

}
