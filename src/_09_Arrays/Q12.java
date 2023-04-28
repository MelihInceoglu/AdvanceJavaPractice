package _09_Arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Q12 {

    public static void main(String[] args) {
        //Aşağıdaki multi dimensional array’in iç array’lerindeki tum elemanların
        //toplamını birer birer bulan ve herbir sonucu yeni bir array’in elemanı yapan
        // ve yeni array’i ekrana yazdıran bir program yazınız
        // Ornegin; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6  4+5=9  6+7=13 ==> output: {6, 9, 13}

        int[][] arr = { {1,2,3}, {4,5}, {6,7} };

        System.out.println(Arrays.toString(arrayCevir(arr)));

        System.out.println(Arrays.toString(Arrays.stream(arr).flatMapToInt(t -> IntStream.of(Arrays.stream(t).sum())).toArray()));

    }

    private static int[] arrayCevir(int[][] arr) {

        int[] yeniArr = new int[arr.length];
        int toplam=0;

        for (int i=0; i<arr.length; i++) {
            toplam=0;
            for (int z: arr[i]){
                toplam += z;
            }
            yeniArr[i] = toplam;
        }

        return yeniArr;
    }
}
