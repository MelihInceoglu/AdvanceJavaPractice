package JavaProjects.Projects_01.Projects_01;

import java.util.Scanner;

public class factorialNumber {

    public static void main(String[] args) {

        /*
        Write a program to find the factorial value of any number entered through the scanner class.

        Example:
        number:7
        factorial:1*2*3*4*5*6*7=5040
        output should be == 5040

        number:6
        factorial:1*2*3*4*5*6=720
        output should be == 720

       */

        /*
        Scanner class aracılığıyla girilen herhangi bir sayının faktöriyel değerini bulmak için bir program yazın.

        number:6
        factorial:1*2*3*4*5*6=720
        output ---> 720


         */

        Scanner dp = new Scanner(System.in);

        String  strNum = dp.nextLine();

        int number = Integer.parseInt(strNum);

         //      code start here  use int number
         //      kodu burdan başlatın ve int number kullanın

        System.out.println(faktoriyelBul(number));

    }

    private static int faktoriyelBul(int number) {
        int toplam=1;
        while (number>0){
            toplam *= number;
            number--;
        }
        return toplam;
    }
}
