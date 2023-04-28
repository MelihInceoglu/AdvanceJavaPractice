package JavaProjects.Projects_02.Projects_02;

import java.util.Arrays;
import java.util.Scanner;

public class changeArray {

      /*
        Given one arrays of Strings
        If string contains Orange change all Orange to Apple

        For Example:
        Array : Peach , Berry , Orange , WaterMelon , Orange

        Result should be Peach , Berry , Apple , WaterMelon , Apple

        Print the Array

     */


    /*
       String bir array verildiğinde

       Eger String Orange içeriyorsa bütün  Orange leri Apple  çevir

       Örnek:

       Array : Peach , Berry , Orange , WaterMelon , Orange

       Result böyle olmalı --> : Peach , Berry , Apple , WaterMelon , Apple

       Arrayi print edin

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String myStr = "Peach Berry Orange WaterMelon Orange";
        String[] UseThisArray = myStr.split(" ");

//        Koda burdan başla
//        kullanman gereken -> UseThisArray

        String degistirilecekStr = "Orange";
        String yeniStr = "Apple";


        for (int i=0; i< UseThisArray.length; i++){
            if (UseThisArray[i].equalsIgnoreCase(degistirilecekStr)) {
                UseThisArray[i] = yeniStr;
            }
        }

        System.out.println(Arrays.toString(UseThisArray));









    }
}