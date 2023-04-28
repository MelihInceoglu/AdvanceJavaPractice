package _06_Method_Creation;

import java.util.Scanner;

public class Q11 {
    static int bakiye = 1000;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int islem = 5;
        do {
            System.out.println("Hangi işlemi yapmak istersiniz?\nBakiyenizi öğrenmek için 1\nPara yatırmak için 2\nPara çekmek için 3\nÇıkmak için 4'ü tuşlayın");
            islem = scan.nextInt();
            switch(islem){
                case 1: bakiyeOgrenme(); break;
                case 2: paraYatirma(); break;
                case 3: paraCekme(); break;
                case 4:cikis(); break;
            }
        }while (islem!=4);
         /*
  Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma
  ve cekme, çıkış işlemlerinin yapıldıgı bir
   ATM app. method create ediniz
   */

    }

    private static void bakiyeOgrenme(){
        System.out.println("Toplam bakiyeniz : "+ bakiye);
    }
    private static void paraCekme(){
        System.out.println("Çekmek istediğiniz miktarı giriniz");
        double cekilecekPara = scan.nextDouble();
        if (cekilecekPara>bakiye){
            System.out.println("Bakiyenizi aştınız");
        } else{
            bakiye -= cekilecekPara;
            System.out.println("Para çekme işlemi sonrası toplam bakiyeniz "+ bakiye);
        }
    }
    private static void paraYatirma(){
        System.out.println("Yatırmak istediğiniz miktarı giriniz");
        double yatirilacakPara = scan.nextDouble();
        if (yatirilacakPara>0){
            bakiye += yatirilacakPara;
            System.out.println("Para yatırma işlemi sonrası toplam bakiyeniz "+ bakiye);
        } else{
            System.out.println("Girdiğiniz miktarı kontrol ediniz");
        }
    }
    private static void cikis(){
        System.out.println("Çıkış işleminiz gerçekleşmiştir. Teşekkür ederiz.");
    }


}



