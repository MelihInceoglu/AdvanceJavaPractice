package _09_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Q14 {

    public static void main(String[] args) {
        /*  TASK :
         * Congratulations kelimesini Array yontemlerini kullanarak asagidaki outputu
         * alin.
         * input : Congratulations
         * output: [C, o, n, g, r, a, t, u, l, a, t, i, o, n, s]    sniitilitirgniC --> o ,a ve u harfini i ye donusturun.

         */

        String str = "Congratulations";
        System.out.println(Arrays.stream(str.split("")).map(t -> {
            if (t.equalsIgnoreCase("a") || t.equalsIgnoreCase("o") || t.equalsIgnoreCase("u")) {
                return t = "i";
            } else {
                return t;
            }
        }).reduce("", (a, b) -> b + a));


        // List strList = new ArrayList(Arrays.asList(str.split("")));
       // List<String> list2= strList.stream().sorted(Comparator.comparingInt(strList::indexOf)).collect(Collectors.toList());
       // System.out.println(list2);
//


    /*    String[] arr = str.split("");
        String[] yeniArr = new String[arr.length];

        for (int i=0; i<arr.length; i++){
            if (arr[i].equals("o")||arr[i].equals("a")||arr[i].equals("u")){
                 yeniArr[arr.length-1-i] = "i";
            }else{
                yeniArr[arr.length-1-i] = arr[i];
            }
        }

     System.out.println(Arrays.toString(yeniArr));

     */




    }

}
