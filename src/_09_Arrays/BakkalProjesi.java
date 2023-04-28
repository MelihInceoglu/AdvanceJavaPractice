package _09_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BakkalProjesi {
    /*
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
     *
     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
     * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
     * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
     *            for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     *            ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
     *            for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     *            ortalama kazançtan aşağıysa o günleri return yap.
     * */


    static List<String> gunler = new ArrayList<>(Arrays.asList("Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar"));
    static List<Double> gunlukKazanclar = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static double ciro;

    public static void main(String[] args) {

        int gun=0;
        while(gun<7){
            System.out.println(gunler.get(gun)+" gununun kazancini giriniz");
            double gunlukHasilat = scan.nextDouble();
            gunlukKazanclar.add(gunlukHasilat);
            ciro += gunlukHasilat;
            gun++;
        }
        ortalamaKazanciGetir();
        ortalamaninUstundeKazancliGunler();

        System.out.println("Gunluk kazanc : " + gunlukKazanclar);
        System.out.println("Hafta toplamı : " + ciro);
        System.out.println("Haftalık ortalama : "+ ortalamaKazanciGetir());
        System.out.println("Ortalama ustundeki gunler : "+ ortalamaninUstundeKazancliGunler());

    }

    private static String ortalamaninUstundeKazancliGunler() {
        String ortalamaUstuGun="";
        for (int i=0; i<gunlukKazanclar.size();i++){
            if (gunlukKazanclar.get(i)>ortalamaKazanciGetir()){
                ortalamaUstuGun += gunler.get(i)+" ";
            }
        }
        return ortalamaUstuGun;
    }

    private static double ortalamaKazanciGetir() {
        double ortalamaKazanc = ciro/7;

        return ortalamaKazanc;
    }
}
