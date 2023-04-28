package _04_switchCase;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

        // Bugüne göre 100 gün sonra hangi gün olduğunuz yazdırınız.
        // pazartesi

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen gün ismi giriniz");
        String gun = scan.next().toLowerCase();
        int gunSayisi=0;

            switch(gun){
                case "pazartesi":
                    gunSayisi=1;
                    break;
                case "salı":
                    gunSayisi=2;
                    break;
                case "çarşamba":
                    gunSayisi=3;
                    break;
                case "perşembe":
                    gunSayisi=4;
                    break;
                case "cuma":
                    gunSayisi=5;
                    break;
                case "cumartesi":
                    gunSayisi=6;
                    break;
                case "pazar":
                    gunSayisi=7;
                    break;

            }

            if (gunSayisi<=0){
                System.out.println("Girdiğiniz gün ismini kontrol ediniz.");
            } else {
                System.out.println("Kaç gün sonrasını hesaplamak istiyorsunuz?");
                int hesaplanacakGun = scan.nextInt();

                int sonuc =  (gunSayisi+hesaplanacakGun)%7;
                String sonucGun = "";
                if (hesaplanacakGun <0){
                    System.out.println("0'dan büyük bir değer giriniz.");
                } else {
                    switch(sonuc){
                        case 1:
                            sonucGun = "Pazartesi";
                            break;
                        case 2:
                            sonucGun = "Salı";
                            break;
                        case 3:
                            sonucGun = "Çarşamba";
                            break;
                        case 4:
                            sonucGun = "Perşembe";
                            break;
                        case 5:
                            sonucGun = "Cuma";
                            break;
                        case 6:
                            sonucGun = "Cumartesi";
                            break;
                        case 7:
                            sonucGun = "Pazar";
                            break;
                        default:
                            System.out.println("Hata! Girdiğiniz bilgileri kontrol ediniz.");
                    }

                    System.out.println( gun+ " gününden " + hesaplanacakGun + " gün sonra " + sonucGun + " olur.");
            }




        }







    }
}

