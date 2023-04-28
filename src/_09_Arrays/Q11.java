package _09_Arrays;

import java.util.Arrays;

public class Q11 {

    public static void main(String[] args) {
        /* TASK :
        arr1 = { {1,2}, {3,4,5}, {6} }  ve  arr2 = { {7,8,9}, {10,11}, {12} }  veriliyor.
        Bu iki array'in tum elemanlarinin toplamini bulan programi yaziniz.
         */

        int[][] arr1 = { {1,2}, {3,4,5}, {6} };
        int[][] arr2 = { {7,8,9}, {10,11}, {12} };

        int toplam1=0;
        int toplam2=0;

        for (int[] w: arr1 ) {
            for (int z: w){
                toplam1 += z;
            }
        }
        for (int[] w: arr2){
            for (int z: w){
                toplam2 += z;
            }
        }

        System.out.println(toplam1+" + "+toplam2+" + "+" = "+ (toplam1+toplam2));

        System.out.println(Arrays.stream(arr1).flatMapToInt(Arrays::stream).sum());
        System.out.println(Arrays.stream(arr2).flatMapToInt(Arrays::stream).sum());


    }

}
