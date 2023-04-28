package _10_List;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Q06 {

    public static void main(String[] args) {
        /* TASK :
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir code create ediniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,3,1,4,2,5,6,8,7,5,9,1));

        System.out.println(Arrays.toString(tekHaneliyeCevir(list)));

        System.out.println("---");

        System.out.println(list.stream().distinct().collect(Collectors.toList()));

    }

    private static int[] tekHaneliyeCevir(List<Integer> list) {

        List<Integer> yeniList = new ArrayList<>();

        for (int i=0; i<list.size(); i++) {
            if (!yeniList.contains(list.get(i))){
                yeniList.add(list.get(i));
            }
        }
        Collections.sort(yeniList);
        int tekrarsizArr[] = new int[yeniList.size()];
        for (int i=0; i<yeniList.size(); i++){
            tekrarsizArr[i] = yeniList.get(i);
        }
        return tekrarsizArr;
    }

}
