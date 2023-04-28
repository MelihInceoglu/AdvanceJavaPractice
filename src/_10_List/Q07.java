package _10_List;

import java.util.Arrays;

public class Q07 {

    public static void main(String[] args) {
		/* TASK :
		ayna check sorusu:
		 input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
		 output : verilen array simetriktir
		 */

        int arr[] = {1, 2, 3, 4, 4, 3, 2, 1};

        boolean simetrikMi = simetrikMi(arr);

        if (simetrikMi){
            System.out.println("Verilen array simetrik");
        }else System.out.println("Verilen array simetrik degil");

    }

    private static boolean simetrikMi(int[] arr) {
        boolean simetrikMi = false;
        int sayac =0;

        for (int i = 0; i < arr.length/2; i++){
            if (arr[i] == arr[arr.length-1-i]) {
                sayac++;
            }
        }

        if (sayac >= arr.length/2) {
            simetrikMi = true;
        }
        return simetrikMi;
    }

}
