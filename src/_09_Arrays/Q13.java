package _09_Arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Q13 {

    public static void main(String[] args) {
        /* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini yazdıran java code create ediniz (negatif sayilar da dahil olsun)

         */

        Scanner scan = new Scanner(System.in);

        int[] arr = IntStream.rangeClosed(2,19).toArray();

        IntPredicate uceBolunenSayi = t-> t%3==0;
        System.out.println(Arrays.toString(Arrays.stream(arr).filter(uceBolunenSayi).toArray()));


/*        int sayac=0;

        for (int i = 0; i<arr.length; i++) {
            System.out.println("Sayı giriniz");
            arr[i] = scan.nextInt();
            if (arr[i]%3==0){
                sayac++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("3'e bolunebilen eleman sayisi : "+ sayac);

 */

    }

}
