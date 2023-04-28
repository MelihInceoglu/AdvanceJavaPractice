package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Q02 {

    public static void main(String[] args) {
        /*TASK :
        2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
        listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
        Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
           Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]

         */

        String[][] arr = {{"Ali","Veli","Ayse"},{"Hasan","Can"},{"Suzan"}};

        List<String> sonuc = harfSirasinaGoreGetir(arr);
        System.out.println(sonuc);

        System.out.println("---");

        System.out.println(Arrays.toString(Arrays.stream(arr).flatMap(Arrays::stream).sorted().toArray()));

    }

    private static List<String> harfSirasinaGoreGetir(String[][] arr) {

        List<String> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length;j++){
                list.add(arr[i][j]);
            }
        }
        Collections.sort(list);
        return list;

    }
}
