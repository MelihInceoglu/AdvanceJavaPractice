package tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _RomaRakamlari {

    public static void main(String[] args) {
        System.out.println(convertRomans("DCCCV"));
        System.out.println(convertNumToRoman(805));
    }
    static int convertRomans(String str){
        int sum=0;
        char[] letters = str.toCharArray();
        for (char letter:letters){
            sum += valueOf(letter);
        }
        return sum;
    }
    static String convertNumToRoman(int num){
        String romanNum="";

        while(num>0){

            if (num/1000>=1){
                for(int i=0;i<num/1000;i++){
                    romanNum +="M";
                }
                num=num%1000;
            }else if (num/500>=1){
                for(int i=0;i<num/500;i++){
                    romanNum=romanNum.concat("D");
                }
                num=num%500;
            }else if (num/100>=1){
                for(int i=0;i<num/100;i++){
                    romanNum=romanNum.concat("C");
                }
                num=num%100;
            }else if (num/50>=1){
                for(int i=0;i<num/50;i++){
                    romanNum=romanNum.concat("L");
                }
                num=num%50;
            }else if (num/10>=1){
                for(int i=0;i<num/10;i++){
                    romanNum=romanNum.concat("X");
                }
                num=num%10;
            }else if (num/5>=1){
                for(int i=0;i<num/5;i++){
                    romanNum=romanNum.concat("V");
                }
                num=num%5;
            } else if (num/1>=1){
                for(int i=0;i<num/1;i++){
                    romanNum += "I";
                }
                num=num%1;
            }
        }


        return romanNum;

    }

    static int valueOf(char a) {
        if (a == 'I') return 1;
        if (a == 'V') return 5;
        if (a == 'X') return 10;
        if (a == 'L') return 50;
        if (a == 'C') return 100;
        if (a == 'D') return 500;
        if (a == 'M') return 1000;
        return 0;
    }
}
