package _08_While_DoWhile;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {

        // TASK : STRING OLAN PIN kodunuzu kontrol eden ve 3 giris hakki veren bir kod yazınız.

        Scanner scan = new Scanner(System.in);
        String pin = "admin123";
        String pinKodu="";



        int sayac=0;

        do {
            System.out.println("Pin kodu giriniz");
            pinKodu = scan.nextLine();
            if (pinKodu.equals(pin)){
                System.out.println("Giris yapildi");
                break;
            }
            sayac++;
        }while (sayac <3);

        System.out.println("Giris basarisiz");


    }
}
