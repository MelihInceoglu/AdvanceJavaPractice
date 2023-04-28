package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q08 {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        /* TASK :
         * 10 elamanli bir list olusturun. Ardindan dizinin 3. elemani ile
         * 8. elemaninin yerlerini degistirin.
         *
         * ORNEK:
         *
         * INPUT : String[] isimler={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
         * OUTPUT : String[] isimler={"Umit","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal","Ahmet","Ali"};
         */

        String[] isimler={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};

        isimler = yerleriniDegistir(isimler);

        System.out.println(Arrays.toString(isimler));


    }

    private static String[] yerleriniDegistir(String[] isimler) {

        System.out.println("Hangi elemanlarin yerini degistirmek istiyorsunuz?");
        int yer1 = scanner.nextInt()-1;
        int yer2 = scanner.nextInt()-1;

        String[] isimlerYeni = new String[isimler.length];

        for (int i = 0; i < isimler.length; i++){

            if (i == yer1){
                isimlerYeni[i]= isimler[yer2];
            }else if (i == yer2){
                isimlerYeni[i] = isimler[yer1];
            }else {
                isimlerYeni[i] = isimler[i];
            }
        }

        return isimlerYeni;

    }

}
