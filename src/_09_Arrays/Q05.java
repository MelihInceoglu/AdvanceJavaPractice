package _09_Arrays;

import java.util.Arrays;

public class Q05 {

    public static void main(String[] args) {
        /*  TASK :
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output : 4
         */

        int[] arr = {1,2,3,4,5,6,7};

        ortalamaBul(arr);

        System.out.println("---");

        System.out.println(Arrays.stream(arr).average().getAsDouble());
        Arrays.stream(arr).filter(t->t> Arrays.stream(arr).average().getAsDouble()).forEach(System.out::println);

    }

    private static void ortalamaBul(int[] arr) {
        int toplam=0;

        for (int i=0; i<arr.length;i++){
            toplam += arr[i];
        }

        int ortalama = toplam / arr.length;

        for(int w: arr){
            if (w>ortalama){
                System.out.print(w+" ");
            }
        }

    }

}


