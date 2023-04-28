package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class QAsalSayi {

    /* TASK :
    100 den kucuk asal sayilari yazdiran bir code create ediniz.
     */
    public static void main(String[] args) {

        IntPredicate asalMiPre = QAsalSayi::asalMi;

        IntStream.rangeClosed(1, 100).filter(asalMiPre).forEach(t-> System.out.print(t+" "));

    }

    private static boolean asalMi(int sayi) {

        boolean asalMi = false;
        int sayac=0;

            for (int j=2; j<sayi; j++){
                if (sayi%j == 0){
                    sayac++;
                }
            }
            if (sayac==0){
                asalMi =true;
            }

        return asalMi;
    }

}
