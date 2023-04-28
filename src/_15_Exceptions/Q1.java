package _15_Exceptions;

import java.util.Scanner;

/*
        'ortalama' isminde bir method create ediniz ve int v  - int f  isminde 2 adet parametresi olsun.
        int v = vize
        int f = final

        Eğer  vize 100 den büyük, veya final 100'den büyük, veya vize 0'dan küçük, veya final 0'dan küçük ise,
        Sistem ArithmeticException hatası versin ve "Notlar 0-100 arasında olmalı" mesajını döndürsün.
        Diğer durumlarda ise,
        vizenin yüzde 40 ını, finalin yüzde 60 ını alsın ve toplasın.(ortalama =)
        vizeye 120, finale 80 girin.

        Programın çalışmasını sağlayın. (handle edin)
 */
public class Q1 {
    public static void main(String[] args) {

        ortalamaAl();
    }

    private static void ortalamaAl() {

       try {
           Scanner scan = new Scanner(System.in);
           System.out.println("Vize notunu giriniz");
           double vizeNotu = scan.nextDouble();
           System.out.println("Final notunu giriniz");
           double finalNotu = scan.nextDouble();

           if (vizeNotu<0 || vizeNotu > 100 || finalNotu<0 ||finalNotu > 100){
               throw new ArithmeticException();
           }else{
               double ortalama = (vizeNotu*0.40 + finalNotu*0.60);
               System.out.println("Ortalama : " + ortalama);
           }

       }
       catch(ArithmeticException e){
           System.out.println("Notlar 0-100 arasında olmalı");
           ortalamaAl();
       }catch(Exception e){
           System.out.println("Geçersiz not girdiniz");
           ortalamaAl();
       }
    }
}
