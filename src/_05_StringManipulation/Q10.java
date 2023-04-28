package _05_StringManipulation;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        /*
            TASK :
         * Kullanıcıdan aldığınız  Adı, Soyadı ve kredi kartı numaralarını aşağıdaki gibi özel forma dönüştürün
         * Kredi kartı numarasını kontrol edin, yoksa 16 haneden küçük olursa   "Geçersiz kredi kartı numarası" yazdırın.
         * input : John White 1234234534561478
           output: Ad : J*** Soyad :W**** kartNo:***********1478 (Adın baş harfleri ve soyadı büyük olmalıdır)
         */

		 /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar         0->9
		  	 \\D    ==> tum rakam disi character ler  0->9    _ disindaki hersey
		 2) \\w   ==> A->Z		a->z
		 	 \\W  ==> A->Z		a->z		tum harf disi character ler
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey
	 */
        String isim = "Sena Tercan";
        String kkNo = "1234567889081234";

        if (kkNo.length()==16){
            System.out.println(isimGizle(isim));
            System.out.println(kkNoGizle(kkNo));

        }else System.out.println("Gecersiz kart no");

    }

    private static String kkNoGizle(String kkNo) {
        String sonDortNo = kkNo.substring(kkNo.length()-4);
        String yeniKkNo = kkNo.replaceAll("\\d", "*").substring(0,kkNo.length()-4).concat(sonDortNo);
        return yeniKkNo;

    }

    private static String isimGizle(String str) {
        int bosluk = str.indexOf(" ");
        String isim = str.substring(0,1).toUpperCase().concat(str.replaceAll("\\w","*").substring(1,bosluk));
        String soyisim = str.substring(bosluk+1,bosluk+2).toUpperCase().concat(str.replaceAll("\\w","*").substring(bosluk+2));
        return isim+" "+soyisim;
    }
}
