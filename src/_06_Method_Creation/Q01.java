package _06_Method_Creation;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {

		/* TASK :
           String girildiginde ilk iki karakteri haric string return eden java method yaziniz
           Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin
          ORNEK:
           INPUT      :  goat
                         photo
                         ghost
                         kalem
           OUTPUT :      gat
                         hoto
                         ghost
                         lem
		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir kelime giriniz");
        String str = scan.nextLine();
        harfKontrol(str);

        System.out.println(ilkIkısiz(str));

    }

    private static void harfKontrol(String str){
        str= str.toLowerCase();
        if (str.charAt(0) == 'g' ){
            if (str.charAt(1)=='h'){
                System.out.println(str);
            }else System.out.println("g"+str.substring(2));
        } else if (str.charAt(1) == 'h'){
            if (str.charAt(0)=='g'){
                System.out.println(str);
            }else System.out.println("h"+str.substring(2));
        } else System.out.println(str.substring(2));
    }

    private static String ilkIkısiz(String kelime){
        String kalanHarfler="";

        if(kelime.startsWith("gh")){
            kalanHarfler = kelime;
        }else if(kelime.startsWith("g")){
            kalanHarfler = kelime.charAt(0)+kelime.substring(2);
        }else if(kelime.charAt(1)=='h'){
            kalanHarfler = kelime.substring(1);
        }else {
            kalanHarfler = kelime.substring(2);
        }

        return kalanHarfler;
    }



}

