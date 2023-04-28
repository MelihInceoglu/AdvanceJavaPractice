package _09_Arrays;

import java.util.Arrays;

public class Q17 {
  /* TASK :
  Elinizde bir miktar farklı boylarda somun ve bu somunlara uyacak civatalar olsun.
  Civataları somunlara eşlemek için nasıl bir algoritma yazarsınız.

   */

    public static void main(String[] args) {

        int[] arrCivata = {1, 5, 2, 4};
        double[] arrSomun = {1.1, 4.4, 2.2, 5.5};

        String[] arr = new String[arrCivata.length];

        Arrays.sort(arrCivata);
        Arrays.sort(arrSomun);

        for (int i=0; i<arrCivata.length; i++) {
            if (arrCivata[i] == (int)arrSomun[i]) {
                arr[i] = arrCivata[i]+" - "+ arrSomun[i];
            }
        }

        System.out.println(Arrays.toString(arr));


    }


}
