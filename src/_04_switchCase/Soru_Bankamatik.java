package _04_switchCase;

import java.util.Scanner;

public class Soru_Bankamatik {
  /*
  Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bie ATM app. code create ediniz
   */
    public static void main(String[] args) {

      double bakiye = 1000;

      Scanner scan = new Scanner(System.in);
      System.out.println("Hangi işlemi yapmak istiyorsunuz?\n Bakiyenizi öğrenmek için 1\n Para yatırmak için 2\n" +
              " Para çekmek için 3\n Çıkmak için 4 'ü tuşlayın");
      int islem = scan.nextInt();

      if (islem<=0 || islem >4){
        System.out.println("Hatalı giriş yaptınız");
      } else {
        switch(islem){
          case 1:
            System.out.println("Toplam bakiyeniz : " + bakiye + "TL");
            break;
          case 2:
            System.out.println("Ne kadar para yatırmak istiyorsunuz ?");
            double yatirilacakPara = scan.nextDouble();
            bakiye += yatirilacakPara;
            System.out.println("Para yatırma işleminden sonra toplam bakiyeniz : " + bakiye);
            break;
          case 3:
            System.out.println("Ne kadar para çekmek istiyorsunuz ?");
            double cekilecekPara = scan.nextDouble();
            if (cekilecekPara> bakiye){
              System.out.println("Bakiye miktarını aştınız.");
            } else {
              bakiye -= cekilecekPara;
              System.out.println("Para çekme işleminden sonra toplam bakiyeniz : " + bakiye);
            }
            break;
          case 4:
            System.out.println("İşleminiz bitmiştir. İyi günler dileriz.");
            break;
        }

      }



    }
}

