package _04_switchCase;

import java.util.Scanner;

public class Soru_SeyahatProjesi_IkinciCozum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Frankfurt : 60 km \n Koln : 80 km \n 20 km basına 5 euro ucretlendirme yapilmaktadir");

        System.out.println("yolculuk yapacaginiz sehri seciniz");
        String hedef = scan.next().toUpperCase();

        double bakiye = 100;

        double frUcret=(60/20)*5;
        double klUcret = (80/20)*5;

        switch(hedef){
            default:
                System.out.println("Hatali giris yaptiniz");
                break;

            case "FRANKFURT":
                System.out.println("Rota : Frankfurt \n Frankfurt ücreti : "+ frUcret+" euro");
                System.out.println("Kac kisi seyahat edeceksiniz?");
                int kisi = scan.nextInt();
                switch(kisi){
                    case 1:
                        System.out.println("1 kisilik bilet talep ettiniz.\nBilet tutarı : "+ frUcret+"Euro \nGüncel Bakiyeniz : "+ (bakiye-frUcret));
                        break;
                    case 2:
                        System.out.println("2 kisilik bilet talep ettiniz.\n Bilet tutarı : "+ (frUcret*2)+"Euro\nGüncel Bakiyeniz : "+ (bakiye-(frUcret*2)));
                        break;
                    default:
                        System.out.println("Hatali giris yaptiniz");
                        break;
                }
                break;

            case "KOLN":
                System.out.println("Rota : Koln \n Koln ücreti : "+ klUcret+" euro");
                System.out.println("Kac kisi seyahat edeceksiniz?");
                int kisi1 = scan.nextInt();
                switch(kisi1){
                    case 1:
                        System.out.println("1 kisilik bilet talep ettiniz.\nBilet tutarı : "+ klUcret+"Euro \nGüncel Bakiyeniz : "+ (bakiye-klUcret));
                        break;
                    case 2:
                        System.out.println("2 kisilik bilet talep ettiniz.\n Bilet tutarı : "+ (klUcret*2)+"Euro\nGüncel Bakiyeniz : "+ (bakiye-(klUcret*2)));
                        break;
                    default:
                        System.out.println("Hatali giris yaptiniz");
                        break;
                }
                break;
        }
    }
}
