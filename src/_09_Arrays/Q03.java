package _09_Arrays;

import java.util.Arrays;

public class Q03 {

    public static void main(String[] args) {
        /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir method yaziniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6

         */

        int[] arr = {1,2,-3,4,-5,-6};

        arr = isaretDegistir(arr);

       // System.out.println("1.yol "+Arrays.toString(arr));

        Arrays.stream(arr).map(t->t*-1);
        System.out.println("2.yol "+Arrays.toString(arr));

    }

    private static int[] isaretDegistir(int[] arr) {
        int[] yeniArr = new int[arr.length];

        for (int i=0; i<arr.length;i++){
            yeniArr[i] = arr[i]* -1;
        }
        return yeniArr;
    }


}
