package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q01 {

    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

        List<String> list1= new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
        System.out.println(list1.stream().filter(t -> !t.contains("a") && !t.contains("A")).collect(Collectors.toList()));



/*
        List<String> list2= new ArrayList<>();
        String harf = "a";
        for (int i=0; i<list1.size(); i++){
            if (!list1.get(i).toLowerCase().contains(harf)){
                list2.add(list1.get(i));
            }
        }
 */
        // Hocanın çözümü
/*
        for(String w: list1){
            if (!w.toLowerCase().contains("a")){
                list2.add(w);
            }
        }

        System.out.println(list2);

 */




    }


}
