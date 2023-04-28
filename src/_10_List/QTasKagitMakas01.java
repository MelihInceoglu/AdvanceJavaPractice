package _10_List;

import java.util.*;

public class QTasKagitMakas01 {

    static Scanner scan = new Scanner(System.in);

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

        Random rand = new Random();

        List<String> tasKagitMakas = new ArrayList<String>(Arrays.asList("Tas","Kagit","Makas"));

        int kullaniciPuan=0;
        int bilgisayarPuan=0;

        int kullanicisecim=0;
        int bilgisayarSecim=0;

        char oyunBitti='*';


        while(oyunBitti != 'x'){

            kullaniciPuan=0;
            bilgisayarPuan=0;
            for (int i=0; i<3; i++){

                System.out.println("Tas : 1, Kagit : 2; Makas : 3");
                kullanicisecim = scan.nextInt();
                bilgisayarSecim = 1+rand.nextInt(2);

                switch(kullanicisecim){

                    case 1:

                        if (bilgisayarSecim==1){
                            System.out.println("Bilgisayarin secimi : "+ tasKagitMakas.get(bilgisayarSecim-1));
                        }else if(bilgisayarSecim==2){
                            System.out.println("Bilgisayarin secimi : "+ tasKagitMakas.get(bilgisayarSecim-1));
                            bilgisayarPuan++;
                        }else if(bilgisayarSecim==3){
                            System.out.println("Bilgisayarin secimi : "+ tasKagitMakas.get(bilgisayarSecim-1));
                            kullaniciPuan++;
                        } else System.out.println("Hata");
                        break;
                    case 2:
                        if (bilgisayarSecim==1){
                            System.out.println("Bilgisayarin secimi : "+ tasKagitMakas.get(bilgisayarSecim-1));
                            kullaniciPuan++;
                        }else if(bilgisayarSecim==2){
                            System.out.println("Bilgisayarin secimi : "+ tasKagitMakas.get(bilgisayarSecim-1));
                        }else if(bilgisayarSecim==3){
                            System.out.println("Bilgisayarin secimi : "+ tasKagitMakas.get(bilgisayarSecim-1));
                            bilgisayarPuan++;
                        } else System.out.println("Hata");
                        break;
                    case 3:
                        if (bilgisayarSecim==1){
                            System.out.println("Bilgisayarin secimi : "+ tasKagitMakas.get(bilgisayarSecim-1));
                            bilgisayarPuan++;
                        }else if(bilgisayarSecim==2){
                            System.out.println("Bilgisayarin secimi : "+ tasKagitMakas.get(bilgisayarSecim-1));
                            kullaniciPuan++;
                        }else if(bilgisayarSecim==3){
                            System.out.println("Bilgisayarin secimi : "+ tasKagitMakas.get(bilgisayarSecim-1));
                        } else System.out.println("Hata");
                        break;
                }

            }


            System.out.println("Puaniniz : "+ kullaniciPuan);
            System.out.println("Bilgisayar puani : "+ bilgisayarPuan);

            if (kullaniciPuan>bilgisayarPuan) System.out.println("Kazandınız");
            else System.out.println("Kaybettiniz");

            System.out.println("Oyundan cikmak icin x'e basin");
            oyunBitti= scan.next().charAt(0);

        }

        System.out.println("Oyun Bitti");



    }
}



