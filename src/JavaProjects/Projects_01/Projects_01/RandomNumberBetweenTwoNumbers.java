package JavaProjects.Projects_01.Projects_01;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberBetweenTwoNumbers {


    /*
    Given two positive integer numbers

     integer 1 is min
     integer 2 is max

    create a random number between min and max

    output should be int

     */

    /*
    İki tane pozitif integer sayısı verildiğinde

    sayı 1 min degerinde

    sayı 2 max degerinde

    min ve max arasinda random sayi elde et(olustur)

    output veri tipi int olmali
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String s1 = scanner.nextLine();

        String[] elements = s1.split(" ");

        int min = Integer.parseInt(elements[0]);
        int max = Integer.parseInt(elements[1]);

        //  code Start here don't change before this line
       // kodu burdan başlatın ve bu satırdan önceki kodlari değiştirmeyin

        // 5 - 10 arasında rastgele sayı

        Random rnd = new Random();

        int sayi = min + rnd.nextInt(max-min);

        System.out.println(sayi);



    }
}
