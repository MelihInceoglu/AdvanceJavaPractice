package JavaProjects.Projects_01.Projects_01;

import java.util.Scanner;

public class totalLetterCountCheck {

    /*
        Given a String ,
            if the count of the letter in the String is odd print true else print false

     */

    /*
     Bir String verildiğinde

     Eger String harf sayisi tek ise true print et değilse false print et

     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        //  code Start here don't change before this line
        // kodu burdan başlatın ve bu satırdan önceki kodları değiştirmeyin

        word = word.replaceAll("[^a-zA-Z]","");
        System.out.println(word.length());
        boolean ciftMi=false;
        if (word.length()%2==0){
            ciftMi=true;
        }
        System.out.println(ciftMi);

    }
}
