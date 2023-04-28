package JavaProjects.P02_javaBankATM;

import java.util.Scanner;

class JavaBankAtm {
   /*      ATM
        Kullaniciya giriş için kart numarasi ve şifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
        Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
        Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,

        Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis.

        Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,
        Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger değilse menü ekranina geri donsun.
        Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,       */


    static Scanner scanner = new Scanner(System.in);
    static String kartNo = "12345678123456781234";
    static String sifre = "5678";
    static double bakiye = 1000;

    public static void main(String[] args) {

        hesabaGiris();

    }

    private static void hesabaGiris() {

        System.out.println("Kart numaranızı giriniz");
        String girilenKartNo= scanner.nextLine();
        girilenKartNo= girilenKartNo.replace(" ","");


        System.out.println("Şifrenizi giriniz");
        String girilenSifre = scanner.nextLine();

        if (girilenKartNo.equals(kartNo) && girilenSifre.equals(sifre) ){
            System.out.println("Giriş başarılı");
            islemSec();

        }else{
            System.out.println("Kart numarası veya sifre yanlış. Tekrar deneyin");
            hesabaGiris();
        }
    }

    private static void islemSec() {

        int islem = 0;

        while(islem!=6){
            System.out.println("Yapmak istediginiz islemi seçiniz");
            System.out.println("Bakiye sorgulama : 1\nPara yatirma : 2\nPara çekme : 3\nPara gönderme : 4\nSifre değiştirme : 5\nÇıkıs : 6");
            islem = scanner.nextInt();
            switch(islem){
                case 1:
                    bakiyeSorgula();
                    break;
                case 2:
                    paraYatir();
                    break;
                case 3:
                    paraCek();
                    break;
                case 4:
                    paraGonder();
                    break;
                case 5:
                    sifreDegistir();
                    break;
                case 6:
                    cikis();
                    break;
                default:
                    System.out.println("Hatalı tuşlama");
                    break;
            }
        }

    }

    private static void bakiyeSorgula() {
        System.out.println("Mevcut bakiyeniz : "+ bakiye);
    }

    private static void paraYatir() {
        System.out.println("Yatırmak istediginiz miktarı giriniz");
        double yatirilacakPara = scanner.nextDouble();
        bakiye += yatirilacakPara;
        System.out.println("Para yatırma işlemi başarıyla gerçekleşti");
        scanner.nextLine();
    }

    private static void paraCek() {
        System.out.println("Cekmek istediginiz miktarı giriniz");
        double cekilecekPara = scanner.nextDouble();
        if (cekilecekPara>bakiye){
            System.out.println("Girdiginiz miktar bakiyenizi asmaktadır. Lütfen tekrar deneyin");
            scanner.nextLine();
        }else{
            bakiye -= cekilecekPara;
            System.out.println("Para çekme işlemi başarıyla gerçekleşti");
            scanner.nextLine();
        }

    }

    private static void paraGonder() {
        System.out.println("IBAN girin");
        scanner.nextLine();
        String iban = scanner.nextLine();
        if (iban.startsWith("TR")&& iban.length()==26){
            System.out.println("Göndermek istediginiz miktarı girin");
            double gonderilecekPara = scanner.nextDouble();

            if (gonderilecekPara>bakiye){
                System.out.println("Girdiginiz miktar bakiyenizi asmaktadır. Lütfen tekrar deneyin");
            }else{
                bakiye-=gonderilecekPara;
                System.out.println("Para gönderme işlemi başarıyla gerçekleşti");
            }

        }else{
            System.out.println("Hatalı giriş yaptınız. Tekrar deneyin");

        }
    }

    private static void sifreDegistir() {
        System.out.println("Lütfen sifrenizi giriniz");
        String girilenSifre = scanner.next();
        String yeniSifre="";

        if (girilenSifre.equals(sifre)){
            System.out.println("Yeni sifrenizi belirleyin");
            yeniSifre = scanner.next();
            if (yeniSifre.equals(sifre)){
                System.out.println("Farklı bir şifre girin");
            }else{
                sifre = yeniSifre;
                System.out.println("Şifreniz degistirildi");
            }

        }else{
            System.out.println("Sifrenizi yanlıs girdiniz. Tekrar deneyin");
        }
    }

    private static void cikis() {
        System.out.println("Yine bekleriz");
    }
}


