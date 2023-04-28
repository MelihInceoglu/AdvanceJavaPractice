package tasks;

import java.util.Scanner;

public class _IkininKuvveti {
    /*
     * Kullanicidan gelen datayi methodda parametre olarak alan
     * ve datanın 2'nin kuvveti olup olmadığını kontrol eden PowersofTwo(num) methodu create ediniz.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("pozitif tam sayi giriniz");
        int sayi = scan.nextInt();

        System.out.println(ikininKuvveti(sayi));
    }

    private static boolean ikininKuvveti(int sayi) {
        boolean kuvvetiMi = false;

        do {
           sayi /= 2;
            System.out.println(sayi);
        }while (sayi>0);

        return kuvvetiMi;
    }
}
