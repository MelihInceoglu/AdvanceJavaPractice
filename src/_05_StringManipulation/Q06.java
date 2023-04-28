package _05_StringManipulation;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
       /*
        TASK :
        kullanıcıdan bir e-posta adresi girmesini isteyin, ardından "hotmail" içeriyorsa, "gmail" ile değiştirin,
        örneğin: johnbrown@hotmail.com ==> johnbrown@gmail.com
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("3 kelimeli isim giriniz");
    //    String str = scan.nextLine();
        String str = "johnbrown@hotmail.com";

        if (str.contains("hotmail")){
            str=str.replace("hotmail","gmail");
        }else{
            System.out.println("gecerli mail adresi giriniz");
        }
        System.out.println(str);


    }
}
