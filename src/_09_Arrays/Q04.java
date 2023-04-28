package _09_Arrays;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class Q04 {

    public static void main(String[] args) {
        /*  TASK :
         *  verilen bir int  Arrayde toplamlari istenen degere esit olan sayi ciftlerini
         * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1};
         * int istenenToplam=9;
         */

        int[] arr = {5,7,-6,4,2,15,3,8,1};
        int istenenToplam = 9;

        //sayiCiftiBul(arr, istenenToplam);


        IntStream.
                range(0,arr.length).
                forEach(t-> IntStream.range(0,arr.length).
                        filter(x->arr[t]+arr[x]==istenenToplam).
                        forEach(x-> System.out.println(arr[t] + " " + arr[x])));



       // IntConsumer func = (t, u)-> (t+u)==istenenToplam ? ""+t+u : "" ;
       // Arrays.stream(arr).forEach(func)
    }

    private static void sayiCiftiBul(int[] arr, int istenenToplam) {

        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr.length; j++) {
                if (arr[i]+arr[j]==istenenToplam){
                    System.out.println(arr[i]+" + "+arr[j]+" = "+ istenenToplam);
                }
            }
        }
    }

}
