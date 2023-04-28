package _10_List;

import java.util.ArrayList;

public class Q10_2 {
    /* TASK :
     * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
     * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
     * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
     */



    public static void main(String[] args) {
        int arr[] = { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 };
        System.out.println(ardisikTopla(arr));
    }

    private static ArrayList<Integer> ardisikTopla(int[] arr) {
        ArrayList<Integer> toplananSayilar = new ArrayList<>();
        int count=0;
        int toplananSayiAdeti=1;

        while(arr.length-toplananSayiAdeti>=count){ // sayilar bitene kadar action
            int toplam=0;

            for(int i=0;i<=count; i++){
                toplam += arr[toplananSayiAdeti-1+i];
            }
            count++;
            toplananSayiAdeti+=count;
            toplananSayilar.add(toplam);
        }

        return toplananSayilar;
    }
}
