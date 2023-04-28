package _09_Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Q06 {
    public static void main(String[] args) {
	
	/*TASK :
	write a java program to find the second largest number in the array?
	Maximum and minimum number in the array?
	(Dizideki en büyük ikinci sayyiyi, maksimum ve minimum sayiyi
	bulmak için bir java programi yazin)
	
	int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };
	
	*/
        int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };

        Arrays.sort(arr);

        int enBuyukIkinciSayi = arr[arr.length - 2];
        int enBuyukSayi = arr[arr.length-1];
        int enKucukSayi = arr[0];

        System.out.println(Arrays.toString(arr));
        System.out.println("En buyuk sayi "+ enBuyukSayi+"\nEn kucuk sayi "+enKucukSayi+"\nEn buyuk ikinci sayi "+ enBuyukIkinciSayi);

        System.out.println("---");

        System.out.println("En buyuk sayi "+Arrays.stream(arr).max().getAsInt());
        System.out.println("En kucuk sayi "+Arrays.stream(arr).min().getAsInt());

        // Daha kolay yolu ?
        System.out.println("En buyuk 2. sayi "+Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).skip(1).limit(1).max().getAsInt());


    }
}
