package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q10 {
    /* TASK :
     * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
     * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
     * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
     */
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList( 3, 5, 1, 2, 7, 9, 2, 3, 5, 7));

        List<String> yeniList = yeniListeyeCevir(list);

        System.out.println(yeniList);


    }

    private static List<String> yeniListeyeCevir(List<Integer> list) {

        List<String> yeniList = new ArrayList<>();

        String eleman="";
        int index=0;
        int sayac=0;

        for (int i=0; i<list.size(); i++) {
            for (int j=0;j<i+1;j++){
                if(j != i){
                    eleman += list.get(0)+"+";
                }else{
                    eleman += list.get(0);
                }

                list.remove(0);
            }

            yeniList.add(eleman);
            eleman="";
        }

        return yeniList;
    }

}

