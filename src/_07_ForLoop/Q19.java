package _07_ForLoop;

public class Q19 {
    /*
     Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız.
            Sonuç böyle olmalıdır;

                   *
                  * *
                 * * *
                * * * *
               * * * * *


     */

    public static void main(String[] args) {
        int sayi = 5;
        int tempsayi = sayi;

        for(int k=1;k<=sayi;k++){

            for(int l=1;l<=sayi;l++){

                System.out.print(" ");
                if(l>=tempsayi) System.out.print("*");
            }
            tempsayi--;
            System.out.println();
        }


    }
}

