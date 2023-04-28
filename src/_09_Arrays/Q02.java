package _09_Arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Q02 {
    public static void main(String[] args) {


        /* TASK :
        multidimensional arrayin iç array lerindeki tüm elemanların toplamını birer birer bulan
        ve herbir sonucu yeni bir arrayin elemanı yapan ve yeni array i ekrana yazdıran programı yaziniz.
        input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}

         */

        int[][] arr1 = {{10,20,30},{4},{6,7,20}};
        int[] yeniArr = new int[arr1.length];


        for (int i=0; i<arr1.length; i++){
            for (int j=0; j<arr1[i].length; j++){
                yeniArr[i] += arr1[i][j];
            }
        }

        System.out.println("1.yol "+Arrays.toString(yeniArr));

        int[] yeniArr2 = Arrays.stream(arr1).mapToInt(t->Arrays.stream(t).sum()).toArray();

        System.out.println("2.yol "+Arrays.toString(yeniArr2));



    }
}
