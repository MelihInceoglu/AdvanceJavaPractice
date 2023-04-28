package _09_Arrays;

import java.util.Arrays;

public class Q15 {

    public static void main(String[] args) {
		/*  TASK :
        check your array's first and last elements are same
        (dizinizin ilk ve son elemanlarının ayni olup olmadığını kontrol eden kod yaziniz
        int []arr={2,6,4,8,2,6,2};
         */

        int []arr={5,2,6,4,8,2,6,2,5};
        System.out.println(Arrays.stream(arr).findFirst().getAsInt() == Arrays.stream(arr).skip(arr.length-1).findFirst().getAsInt());

        /*
        boolean ayniMi=false;

        if (arr[0]==arr[arr.length-1]){
            ayniMi=true;
        }
        System.out.println(ayniMi);

         */

    }

}
