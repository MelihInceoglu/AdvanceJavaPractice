package _09_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Q08 {

    public static void main(String[] args) {
		
		/*
		 TASK :
		 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup yazdıran java code create ediniz.

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 5$ ";

        System.out.println(Arrays.toString(Arrays.stream(str.split(" ")).map(t -> t.replaceAll("\\D", "")).toArray()));

        System.out.println(Arrays.stream(str.split(" ")).filter(t->t.contains("$")).mapToInt(t -> Integer.parseInt(t.replace("$", ""))).sum());
        System.out.println(Arrays.stream(str.split(" ")).filter(t->t.contains("£")).mapToInt(t -> Integer.parseInt(t.replace("£", ""))).sum());

        System.out.println("---");

        String[] arr = str.split(" ");
        int dolarToplam=0;
        int euroToplam=0;

        // for(int i=0; i<arr.length;i++)

        for (String w: arr){
            if (w.contains("$")){
                w=w.replaceAll("\\D","");
                dolarToplam += Integer.valueOf(w);
            }else if(w.contains("£")){
                w=w.replaceAll("\\D","");
                euroToplam += Integer.valueOf(w);
            }
        }

        System.out.println("Dolar toplam : "+ dolarToplam);
        System.out.println("Euro toplam : "+ euroToplam);



/*
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        String arr[]=str.split(" ");
        System.out.println(Arrays.toString(arr));
        int dolarToplam=0;
        int euorToplam=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].contains("$")){
                arr[i]=arr[i].replace("$","").trim();
                dolarToplam+=Integer.valueOf(arr[i]);
            }else if(arr[i].contains("£")){
                arr[i]=arr[i].replace("£","").trim();
                euorToplam+=Integer.valueOf(arr[i]);
            }
        }
        System.out.print("$ toplami = "+ dolarToplam + "\n" + "£ toplami = " + euorToplam);

 */







    }
}


