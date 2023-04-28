package _09_Arrays;

import java.util.Arrays;

public class Q07 {

    public static void main(String[] args) {
        /* TASK :
         * write a method that accepts a 2 dimensional array and finds the max value
         * (2 boyutlu bir diziyi kabul eden ve maksimum degeri bulan bir method yazin )
         * Input : {{1,2,-3},{41,55},{-61,-17,80}}
         * Output : 80
         */

        int arr[][] = {{1,2,-3},{41,550},{-61,-17,80}};
        int maxDeger = maxDegerBul(arr);

        System.out.println(maxDeger);
        System.out.println("---");
        System.out.println(Arrays.stream(arr).flatMapToInt(Arrays::stream).max().getAsInt());

    }

    private static int maxDegerBul(int[][] arr) {
        int maxDeger=Integer.MIN_VALUE;

        for (int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                if (arr[i][j]>maxDeger){
                    maxDeger = arr[i][j];
                }
            }
        }
        return maxDeger;
    }
}
