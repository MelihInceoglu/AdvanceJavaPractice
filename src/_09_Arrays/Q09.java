package _09_Arrays;

import java.util.Arrays;

public class Q09 {

    public static void main(String[] args) {
		/* TASK :
        given an int array and find the squares of the elements
        (Verilen bir int dizisi icin elemanlarin karelerini bulun )
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
        */

        int[] arr = {2,6,4,5,8,9};

   /*     int[] kareArr = new int[arr.length];

        for (int i=0; i<arr.length; i++) {
            kareArr[i] = arr[i]*arr[i];
        }

        System.out.println(Arrays.toString(kareArr));

    */

         System.out.println(Arrays.toString(Arrays.stream(arr).map(t->t*t).toArray()));
    }

}
