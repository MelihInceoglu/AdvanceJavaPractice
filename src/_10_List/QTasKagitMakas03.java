package _10_List;

import java.util.Random;
import java.util.Scanner;

public class QTasKagitMakas03 {

    public static void main(String[] args) {

         /* TASK:
         tas >makas
         makas >kagit
         kagit >tas

	Oncelikle kullanicidan secim alabilmek icin Scanner yapiyoruz.
	Ardindan main fonksiyonumuzda kullanicinin ve bilgisayarin puanlarini tanimliyoruz.
	While dongumuzun icerisinde kullanicidan aldigimiz secimi “secim” isimli degiskene atiyoruz.
	Bilgisayarin secimini ise Math.random methodunu kullanarak aliyoruz.
	Math.random()*3 diyerek bilgisayara 0 ile 3 arasinda bir rastgele sayi urettiriyoruz.
	Ve secimimiz ile bilgisayarin secimini karsilastirip sonuclarini yaziyoruz.
	En sonda da kullaniciya oyuna devam etmek isteyip istemedigini soruyoruz, eger istiyorsa
	dongumuz en bastan calisiyor, istemiyorsa da cikis yapiyor.

	 */

        Scanner scan = new Scanner(System.in);
        int kullaniciPuan=0;
        int bilgisayarPuan=0;
        String secim ="";

        Random rand = new Random();
        int bilgisayarSecim =  0;



        while(!secim.equals("X")){

            System.out.println("Tas - Kagit - Makas - Cikis icin x");
            secim = scan.next().toUpperCase();

            bilgisayarSecim =  1 + rand.nextInt(3);

            switch(secim){

                case "TAS":
                    if(bilgisayarSecim==1){
                        System.out.println("Bilgisayarın secimi : Tas");
                        System.out.println("Berabere");
                    }else if(bilgisayarSecim==2){
                        System.out.println("Bilgisayarın secimi : Kagit");
                        System.out.println("Bilgisayar puan kazandı");
                        bilgisayarPuan++;
                    }else if(bilgisayarSecim==3){
                        System.out.println("Bilgisayarın secimi : Makas");
                        System.out.println("Puan kazandınız");
                        kullaniciPuan++;
                    }
                    break;

                case "KAGIT":
                    if(bilgisayarSecim==1){
                        System.out.println("Bilgisayarın secimi : Tas");
                        System.out.println("Puan kazandınız");
                        kullaniciPuan++;
                    }else if(bilgisayarSecim==2){
                        System.out.println("Bilgisayarın secimi : Kagit");
                        System.out.println("Berabere");
                    }else if(bilgisayarSecim==3){
                        System.out.println("Bilgisayarın secimi : Makas");
                        System.out.println("Bilgisayar puan kazandı");
                        bilgisayarPuan++;
                    }
                    break;

               case "MAKAS":
                   if(bilgisayarSecim==1){
                       System.out.println("Bilgisayarın secimi : Tas");
                       System.out.println("Bilgisayar puan kazandı");
                       bilgisayarPuan++;
                   }else if(bilgisayarSecim==2){
                       System.out.println("Bilgisayarın secimi : Kagit");
                       System.out.println("Puan kazandınız");
                       kullaniciPuan++;
                   }else if(bilgisayarSecim==3){
                       System.out.println("Bilgisayarın secimi : Makas");
                       System.out.println("Berabere");
                   }
                    break;

               case "X":

                   System.out.println("Yine bekleriz");
                   if (kullaniciPuan>bilgisayarPuan){
                       System.out.println("Puanınız : "+ kullaniciPuan);
                       System.out.println("Bilgisayar puanı : "+ bilgisayarPuan);
                       System.out.println("Kazandınız");

                   } else if(kullaniciPuan<bilgisayarPuan){
                       System.out.println("Puanınız : "+ kullaniciPuan);
                       System.out.println("Bilgisayar puanı : "+ bilgisayarPuan);
                       System.out.println("Kaybettiniz");

                   } else {
                       System.out.println("Puanınız : "+ kullaniciPuan);
                       System.out.println("Bilgisayar puanı : "+ bilgisayarPuan);
                       System.out.println("Berabere kaldınız");
                   }

                   break;

                default:
                    System.out.println("Hatalı giriş");
            }




        }



    }
}
