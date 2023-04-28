package JavaProjects.Projects_02.Projects_02;

import java.util.ArrayList;
import java.util.List;

public class sumTotal {

    /*
        Create String 2D array

        {{"$12" , "$22" , "5"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}}

        if the String has $ multiply by 3.2

        if the String has € multiply by 4.2

        return the double

     */


    /*
        String 2D array oluştur

       {{"$12" , "$22" , "5$"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}}

       String de $ varsa 3.2 ile çarp

       String de € varsa 4.2 ile çarp

       double return et

    */
    public static void main(String[] args) {

//        Koda burdan başlayın

        String[][] arr =  {{"$12" , "$22" , "5$"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}};

        List<Double> list = new ArrayList<>();
        double toplam =0;

        for (String[] eachArr: arr){
            for (String each: eachArr){
                if(each.contains("$")){
                    list.add(Integer.parseInt(each.replaceAll("\\D","")) * 3.2);
                }else if(each.contains("€")){
                    list.add(Integer.parseInt(each.replaceAll("\\D","")) * 4.2);
                }
            }
        }
        for (double each : list){
            toplam += each;
        }

        System.out.println(list);
        System.out.println(toplam);





    }
}



