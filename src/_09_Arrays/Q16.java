package _09_Arrays;

import java.util.Arrays;

public class Q16 {
    public static void main(String[] args) {
        /*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */

        String str = "ade1r4d3";

        sumOfDigits(str);

        System.out.println("---");
        System.out.println(Arrays.stream(str.split("")).filter(t -> Character.isDigit(t.charAt(0)))
                .mapToInt(Integer::parseInt).sum());



    }

    private static void sumOfDigits(String str) {
        String[] arr = str.split("");
        int toplam=0;

        for (String w: arr){
            if (Character.isDigit(w.charAt(0))){
                toplam += Integer.parseInt(w);
            }
        }

        System.out.println(toplam);
    }


}

