package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Q05 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
       /* TASK :
        Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        sadece tek elemanlarını ayrı diziye bir metodda atayarak
         yazdırınız.

        */

        List<Integer> list = new ArrayList<>();
        list = elemanAl(list);

        Predicate<Integer> cift = t-> t%2==0;
        Predicate<Integer> tek = t-> t%2==1;
        System.out.println("Ciftler "+list.stream().filter(cift).collect(Collectors.toList()));
        System.out.println("Tekler "+list.stream().filter(tek).collect(Collectors.toList()));

        System.out.println("---");
        List<Integer> tekElemanlar = tekElemanlariGetir(list);
        List<Integer> ciftElemanlar = ciftElemanlariGetir(list);

        System.out.println(tekElemanlar);
        System.out.println(ciftElemanlar);



    }

    private static List<Integer> elemanAl(List<Integer> list) {
        System.out.println("Kac elemanli liste olusturmak istiyorsunuz");
        int elemanSayisi= scan.nextInt();
        List<Integer> yeniList = new ArrayList<>();
        for (int i=0; i< elemanSayisi; i++) {
            System.out.println("Eleman giriniz");
            yeniList.add(scan.nextInt());
        }
        return yeniList;
    }

    private static List<Integer> ciftElemanlariGetir(List<Integer> list) {
        List<Integer> ciftElemanlar = new ArrayList<>();
        for (int i=0; i< list.size(); i++) {
            if (list.get(i)%2==0){
                ciftElemanlar.add(list.get(i));
            }
        }
        return ciftElemanlar;
    }

    private static List<Integer> tekElemanlariGetir(List<Integer> list) {
        List<Integer> tekElemanlar = new ArrayList<>();
        for (int i=0; i< list.size(); i++) {
            if (list.get(i)%2==1){
                tekElemanlar.add(list.get(i));
            }
        }
        return tekElemanlar;
    }




}
