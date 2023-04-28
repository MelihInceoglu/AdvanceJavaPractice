package JavaProjects.Projects_01.Projects_01;

import java.util.Scanner;

public class getTotal {


      /*

        Given three positive Strings
        remove all the non numeric numbers.
        change the Strings to int
        and print the total

        Example:
        String num1 = "$15";
        String num2 = "$20";
        String num3 = "$30";
        output should be == 65;

        NOTE : if the output less then 0 change output to -1

     */


    /*
    3 tane pozitif String verildiğinde
    sayısal olmayan tüm karakterleri kaldırın.
    Stringleri int e çevirin
    ve total print edin

        Ornek:
       String num1 = "$15";
       String num2 = "$20";
       String num3 = "$30";
       output ----> 65; olmali

       NOT : Eğer output 0 dan küçük ise outputu -1 e cevir

        $15 $20 $30

   */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String allElements = scanner.nextLine();

        String[] elements = allElements.split(" ");

        String num1 = elements[0];

        String num2 = elements[1];

        String num3 = elements[2];

        //  code Start here don't change before this line
        //   use String num1 , num2 , num3

        // kodu burdan başlatın ve bu satırdan önceki kodlari değiştirmeyin
        // String num1,num2,num3 kullanın

        int sayi1 = Integer.parseInt(num1.replaceAll("\\D",""));
        int sayi2 = Integer.parseInt(num2.replaceAll("\\D",""));
        int sayi3 = Integer.parseInt(num3.replaceAll("\\D",""));

        int toplam = sayi1+sayi2+sayi3;

        if (toplam>0) {
            System.out.println(toplam);
        }else{
            toplam=-1;
            System.out.println(toplam);
        }


    }


}

