package JavaProjects.Projects_02.Projects_02;

import java.util.Arrays;
import java.util.Scanner;

public class arrayContains {

    /*
        Given two arrays of ints sorted in increasing order,
        outer and inner,
        return true if all of the numbers in inner appear in outer.
        Verify first array contains second array.

        linearIn([1, 2, 4, 6], [2, 4]) → true
        linearIn([1, 2, 4, 6], [2, 3, 4]) → false
        linearIn([1, 2, 4, 4, 6], [2, 4]) → true

     */

    /*

         Artan düzende sıralanmış iki adet ınt array göz önüne alındığında,
 dış ve iç, içteki tüm sayılar dışta görünüyorsa true değerini döndürür.
İlk arrayin ikinci arrayi içerdiğini doğrulayın.

         linearIn([1, 2, 4, 6], [2, 4]) → true
         linearIn([1, 2, 4, 6], [2, 3, 4]) → false
         linearIn([1, 2, 4, 4, 6], [2, 4]) → true

     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String myStr = scan.nextLine();
        String[] arr = myStr.split(" ");
        int[] myArr = new int[5];
        for(int i = 0 ; i< arr.length ; i++){
            int num = Integer.parseInt(arr[i]);
            myArr[i] = num;
        }

        int[] UseThisArray1 = new int[3];
        int[] UseThisArray2 = new int[2];

        for(int i = 0 ; i <3 ; i++){
            UseThisArray1[i] = myArr[i];
        }

        for(int i = 3 ; i <5 ; i++){
            UseThisArray2[i-3] = myArr[i];
        }

//        Code start here
//        Use the array name UseThisArray1 and UseThisArray2

//        Koda burdan başla
//        UseThisArray1 ve UseThisArray2 array isimlerini kullan

        /*
        int sayac=0;
        for(int w:UseThisArray1){
            for (int z: UseThisArray2){
                if (w==z){
                    sayac++;
                }
            }
        }

        if (sayac == UseThisArray2.length){
            System.out.println("true");
        } else System.out.println("false");

         */



        /*
        List<Integer> list1 = new ArrayList();
        List<Integer> list2 = new ArrayList();

        list1.add(scan.nextInt());
        list1.add(scan.nextInt());
        list1.add(scan.nextInt());
        list2.add(scan.nextInt());
        list2.add(scan.nextInt());


        System.out.println(list1);
        System.out.println(list2);

        if (list1.containsAll(list2)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

         */

        Arrays.sort(UseThisArray1);
        Arrays.sort(UseThisArray2);

        int sayac=0;
        for (int each: UseThisArray2) {
            if(Arrays.binarySearch(UseThisArray1,each) >=0){
                sayac++;
            }
        }
        if (sayac == UseThisArray2.length){
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }
}
