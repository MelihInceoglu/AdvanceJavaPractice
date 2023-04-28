package _06_Method_Creation;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        /*  TASK :
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden method create ediniz.
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */

        String str ="axyZd";
        System.out.println(checkStr(str));

    }

    private static boolean checkStr(String str) {
        str = str.toLowerCase();
        boolean checkStr = str.contains("xyz");
        return checkStr;
    }

}
