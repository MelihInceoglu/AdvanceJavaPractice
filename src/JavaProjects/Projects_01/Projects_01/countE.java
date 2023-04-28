package JavaProjects.Projects_01.Projects_01;

import java.util.Scanner;

public class countE {

/*    Determine and print the number of times
      the character ‘b’ appears in the input entered by the user.

     input: Test output
            b: 0
        output should be 0


     input: bucket
            b:1
        output should be 1
        */


    //hint: .charAt, length(), for, index, counter,



    /*  Kullanıcı tarafından girilen inputda kac tane 'b' karakteri olduğunu belirle ve print et.

     input: Test output
            b: 0
        output 0 olmalı


     input: bucket
            b:1
        output 1 olmalı
        */


    //hint: .charAt, length(), for, index, counter,


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String text = input.nextLine();

         // code start here
         // kodu burdan başlatın ve bu satırdan önceki kodlari değiştirmeyin

        System.out.println("aradiginiz harfi girin");
        String harf = input.next().substring(0,1);

        harfAra(text,harf);

        }

    private static void harfAra(String text, String harf) {
        int sayac=0;
        for (int i = 0; i <text.length();i++){
            if (text.substring(i,i+1).equalsIgnoreCase(harf)){
                sayac++;
            }
        }

        if (sayac>0) System.out.println(text+" metninde "+ harf+" harfi "+ sayac+" kere var");
        else System.out.println(text+" metninde "+ harf+" harfi "+"yok");

    }

}
