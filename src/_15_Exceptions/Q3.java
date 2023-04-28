package _15_Exceptions;

import java.util.Random;

public class Q3 {
    /*
            randomSayi isminde static void bir method create ediniz.
            Bu method içerisinde iki int random sayı oluştursun. (0'dan 10 a kadar)
            Bu iki random sayının toplamını yazdırın.
            Eğer bu iki random sayının toplamı 12 den küçükse "Exception" versin ve mesaj olarak
             ("Sayı 12'den küçük ise hata verir") print edin.
     */

    public static void main(String[] args) {

        randomSayi();
    }

    private static void randomSayi() {
        Random rand = new Random();
        int sayi1= rand.nextInt(10);
        int sayi2= rand.nextInt(10);
        int sonuc = sayi1+sayi2;
        System.out.println(sonuc);
        try {
            if (sonuc<12){
                throw new Exception();
            }
            else{
                System.out.println("Sonuc : "+sonuc);
            }
        }catch(Exception e){
            System.out.println("Sayı 12'den küçük");
        }
    }
}
