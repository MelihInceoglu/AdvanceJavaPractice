package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
    /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(11);
        list.add(7);
        list.add(16);

        //list = karesiniGetir(list); //[25, 81, 121, 49, 256]
        //System.out.println(list);


        System.out.println(Arrays.toString(list.stream().mapToInt(t -> t * t).toArray()));

    }

    private static List<Integer> karesiniGetir(List<Integer> list) {

        List<Integer> listKare = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            listKare.add(list.get(i)*list.get(i));
        }
        return listKare;

    }
}
