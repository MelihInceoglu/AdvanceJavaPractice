package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        /*
            TASK :
            Kulanıcıdan aracının hızını alınız
            Trafik cezasının değerini hesaplayın.
            45 hız sınırıdır.
            Eğer hızınız 55-74 arasında ise:
            Ceza 100 $'dır.

            Eğer hızınız 75 - 84 arasında ise:
            Ceza 150 $'dır.

            Eğer hızınız 85 -94 arasında ise:
            Ceza 320 $'dır.

            Eğer hızınız 94'den daha fazla ise:
            Ceza 500 $'dır.

            ve ayrıca,
            Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

            Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.

-----------------------------------------

            Örn;

            currentSpeed(Hızınız) 87
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;

            sonuç 320 olmalıdır.

            currentSpeed(Hızınız) 65
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;

            sonuç 300 olmalıdır.
     */


        Scanner scan = new Scanner(System.in);
        System.out.println("Hızınızı giriniz");

        double hiz = scan.nextDouble();

        int ceza =0;
        if (hiz <= 0){
            System.out.println("0'dan büyük bir değer giriniz!");
        } else {
            if (hiz >= 55 && hiz<=74 ){
                ceza = 100;
            } else if (hiz >= 75 && hiz <= 84 ){
                ceza = 150;
            } else if (hiz >= 85 && hiz <= 94 ){
                ceza = 320;
            } else if (hiz > 94 ){
                ceza = 500;
            }

            System.out.println("Ehliyetiniz var mı?\n E\n H");
            char ehliyet = scan.next().toUpperCase().charAt(0);

            if (ehliyet == 'E'){
                System.out.println("Ceza miktarı : " + ceza +"$");
            } else if( ehliyet == 'H'){
                ceza += 200;
                System.out.println("Ceza miktarı : " + ceza +"$");
            } else {
                System.out.println("Evet için E, Hayır için H giriniz!");
            }
        }




    }
}
