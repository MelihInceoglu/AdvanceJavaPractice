package _10_List;

import java.util.*;

public class QTasKagitMakas02 {
    static Scanner scan = new Scanner(System.in);
    static List<String> tasKagitMakas = new ArrayList<String>(Arrays.asList("Tas","Kagit","Makas"));
    static int kullaniciPuan=0;
    static int bilgisayarPuan=0;
    static int kullanicisecim=0;
    static int bilgisayarSecim=0;

    public static void main(String[] args) {

        Random rand = new Random();

        char oyunDevam ='*';

        while (oyunDevam != 'x'){
            kullaniciPuan=0;
            bilgisayarPuan=0;
            for (int i=1; i<=3;i++){

                System.out.print(i+". Tur => ");
                System.out.print("Tas : 1, Kagit : 2, Makas : 3 ");
                kullanicisecim = scan.nextInt();
                bilgisayarSecim = 1+rand.nextInt(2);
                tasKagitMakas();

            }

            System.out.println("\nPuaniniz : "+ kullaniciPuan);
            System.out.println("Bilgisayar puani : "+ bilgisayarPuan);

            if (kullaniciPuan>bilgisayarPuan) System.out.println("Kazandınız");
            else System.out.println("Kaybettiniz");

            System.out.println("\nOyunu bitirmek icin x'e bas");
            oyunDevam= scan.next().toLowerCase().charAt(0);
        }
    }


    private static void tasKagitMakas() {

        System.out.println("Sizin seciminiz "+ tasKagitMakas.get(kullanicisecim-1)+"\nBilgisayarin secimi "+ tasKagitMakas.get(bilgisayarSecim-1));

        if (kullanicisecim == 1){
            if (bilgisayarSecim==1){
                System.out.println("Berabere");
            }else if (bilgisayarSecim==2){
                System.out.println("Puan bilgisayara");
                bilgisayarPuan++;
            }else {
                System.out.println("Puan size");
                kullaniciPuan++;
            }
        }else if (kullanicisecim == 2){
            if (bilgisayarSecim==1){
                System.out.println("Puan size");
                kullaniciPuan++;
            }else if (bilgisayarSecim==2){
                System.out.println("Berabere");
            }else {
                System.out.println("Puan bilgisayara");
                bilgisayarPuan++;
            }
        }else if (kullanicisecim ==3){
            if (bilgisayarSecim==1){
                System.out.println("Puan bilgisayara");
                bilgisayarPuan++;
            }else if (bilgisayarSecim==2){
                System.out.println("Puan size");
                kullaniciPuan++;
            }else {
                System.out.println("Berabere");
            }
        }else{
            System.out.println("Hata");
        }

    }

}
