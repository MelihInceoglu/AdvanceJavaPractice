package _04_switchCase;

import java.util.Scanner;

public class Soru_SeyahatProjesi {

    public static void main(String[] args) {

        /*
        bulundugunuz yerden, bir yere yolculuk edeceksiniz.

        1. Köln veya Frankfurta gidebilirsiniz.
        2. Bilet fiyatı hesabı = Her 20 Km başına 5 euro. örn: (100 km yol. Bilet parası  (100/20)* 5 =25 euro

todo İPUCU:  toplamTutar, işlem, FrankfurtKm, KmBirimFiyat   gibi sabit veri tipleri oluşturabilirsiniz. İşlemlerde direkt bunları cağırabilirsiniz.



        todo İLK OLARAK;

        "Nereye yolculuk etmek istiyorsunuz? (Frankfurt : 60 KM          ---         Köln : 80 KM ---       (20 KM başına 5 euro bilet parası alınmaktadir..)    yazısı gelsin.

    1.    Frankfurt veya Köln olarak bir giriş yapın. (Girdiğiniz sehrin harfleri , girildikten sonra büyük hale gelsin.

   todo    Frankfurt girildiyse,
        örn: girdi= Frankfurt
                case=FRANKFURT:

      Rota = Frankfurt yazdırın.
      Frankfurt km hesabı işlemi yapın.

      son olarak konsolda: Frankfurt 15 Euro         yazsın.


      todo  case: KÖLN ise

      "Rota = Köln" yazdırın.
       km hesabına göre işlemi yapınız.

       son olarak konsolda:  Köln   20 Euro             yazsın.



       2.  Sistem bize "Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):   "   sorusunu sorsun.

       case:1  ise
        " 1 kişilik " yazdırın. (1 kişilik seçerseniz bir işlem yapmanıza gerek kalmaz, bilet ücreti yukarıda çoktan belirlenmiş olur.)

        case:2 ise

        "2 kişilik " yazdırın
        2 kişi için bilet fiyatını hesaplayın.


        todo  Son olarak yolculugunuzu check edin;

        konsolda örn:   Frankfurt  - 2 Kişilik    yazsın.

        1.Bakiyemi belirtin.
        2.Toplam Tutarı belirtin.
        3.double paraUstu oluşturun ve hesaplayın.
        4.Double para üstünü yazdırın.


         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Seyahat etmek istediğiniz şehri yazınız : \n 1) Frankfurt \n 2) Köln");
        String sehir = scan.nextLine().toUpperCase();
        System.out.println("Gitmek istediğiniz şehrin kaç km olduğunu yazınız :" +
                            "\n(20 KM başına 5 euro bilet parası alınmaktadır.)");

        double sehirKm = scan.nextDouble();
        double toplamTutar = (sehirKm/20)*5;

        double bakiye = 1340;
        double paraUstü = bakiye-toplamTutar;

        System.out.println("Rota : " +sehir +  " Tutar : "+ toplamTutar);

        System.out.println("Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir)");
        int kisiSayisi = scan.nextInt();

        switch (kisiSayisi){
            case 1:
                System.out.println("1 kişilik");
                System.out.println(sehir + " şehrine "+ kisiSayisi+ " kişilik bilet ücreti "+ toplamTutar +"TL'dir.");
                break;
            case 2:
                System.out.println("2 kişilik");
                toplamTutar *= 2;
                System.out.println(sehir + " şehrine "+ kisiSayisi+ " kişilik bilet ücreti "+ toplamTutar +"TL'dir.");
                 break;
            default:
                 System.out.println("2'den fazla bilet alamazsınız.");
        }

       if (kisiSayisi == 1 || kisiSayisi == 2){
           System.out.println("Toplam Bakiyeniz : " + bakiye+"TL");
           System.out.println("İşlem Ücreti : " + toplamTutar+"TL");
           if (paraUstü<0){
               System.out.println("Bakiyenizi aştınız");
           } else System.out.println("İşlem sonrası kalan bakiyeniz : "+ paraUstü);
       }











    }
}
