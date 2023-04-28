package tasks;

import java.util.Scanner;


public class _UzunKelime {
    /*
     * Kullanicidan gelen cumleyi  parametre olarak alan
     * ve cumledeki en uzun kelimeyi return eden LongestWord(sentence) methodu create ediniz.
     * Trick: Aynı uzunlukta iki veya daha fazla kelime varsa, String'deki en uzun ilk sözcüğü return edilsin
     * Noktalama işaretlerini dikkate almayın ve cumlenin boş olmayacağını varsayın.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("cumle giriniz");

        String sentence = scan.nextLine();

        System.out.println(longestWord(sentence));
    }

    private static String longestWord(String sentence) {

        String enUzunKelime ="";

        String[] kelimeler = sentence.split(" ");
        for (String w : kelimeler){
            if (w.length()>enUzunKelime.length()){
                enUzunKelime = w;
            }
        }
        return enUzunKelime;
    }
}
