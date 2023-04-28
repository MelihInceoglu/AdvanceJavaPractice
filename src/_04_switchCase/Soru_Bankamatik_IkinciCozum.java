package _04_switchCase;

import java.util.Scanner;

public class Soru_Bankamatik_IkinciCozum {
    /*
  Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bie ATM app. code create ediniz
   */
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Hangi işlemi yapmak istiyorsunuz?\n Bakiyenizi öğrenmek için 1\n Para çekmek için 2\n" +
                " Para yatırmak için 3\n Çıkmak için 4 'ü tuşlayın");

        int islem = scan.nextInt();
        int bakiye = 1000;

        switch(islem){
            case 1:
                System.out.println("Mevcut bakiyeniz " + bakiye);
                break;
            case 2:
                System.out.println("Çekeceğiniz miktarı giriniz");
                int cekilenMiktar = scan.nextInt();
                if (cekilenMiktar>=bakiye){
                    bakiye -= cekilenMiktar;
                    System.out.println("Yeni bakiyeniz : "+ bakiye);
                }else System.out.println("Bakiyenizden fazla para çekemezsiniz");

                break;
            case 3:
                System.out.println("Yatıracağınız miktarı giriniz");
                int yatirilanMiktar = scan.nextInt();
                bakiye+=yatirilanMiktar;
                System.out.println("Yeni bakiyeniz : "+ bakiye);

                break;
            case 4:
                System.out.println("Çıkışınız gerçekleşmiştir yine bekleriz");
                break;
        }


    }
}
