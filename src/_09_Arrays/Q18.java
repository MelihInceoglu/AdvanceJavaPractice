package _09_Arrays;

import java.util.*;

public class Q18 {
    public static void main(String[] args) {
        /* TASK :
         kullanıcıdan alınan bir  String'deki herbir  karakterin adedini bir array içinde yazdıran bir java programı yazın.
         String  "Javacilar cook afilli" ise cevap şöyle olmalıdır:
         { =2, a=3, r=1, c=1, v=1, o=2, f=1, l=2, J=1, i=2}
         */

        /*  1. Kullanıcıdan string al
            2. String'i array'e cevir
            3. int sayac olustur
            4. array elemanlarını gezen bir for loop olustur
            5. sayacı 1 artır
            6. yeni array olustur
            7. sayac 1 ise yeni array'e eleman olarak ekle

         */


        String input = "Javacilar cook afilli";

      String[] arr = input.split("");// {J,a,v,a.....

      List<String> isim = new ArrayList<>(); // { karakter isimlerini koyacağımız LİST
      List<Integer> adet = new ArrayList<>(); // { karakter ADETLERİNİ koyacağımız LİST
      List<String> arr2 = new ArrayList<>(); // { son sout yapacağımız list

      Arrays.sort(arr);  // alfabetik order'a göre sıraladık


      for (int i = 0; i < arr.length; i++) {// tekrarlanan karakterleri çıkıp
          // "isim" adlı listemize ekleyeceğiz
              if (!isim.contains(arr[i])) {
                  isim.add(arr[i]);
              }
      }//outer for loop
      System.out.println(isim);


      for (int i=0; i<isim.size() ; i++) { // özgün karakterlerden her birinin, ilk cümlede kaç defa geçtiğini bulacağız
          int sayac =0;                    // ve "adet" isimli listimize ekleyeceğiz
          for (int j=0; j<arr.length ; j++) {

              if(isim.get(i).equalsIgnoreCase(arr[j])){
                  sayac++;
              }

          }adet.add(sayac);
      }

      System.out.println(adet);


      for (int i = 0; i <adet.size() ; i++) {// son olarak "isim" ve "adet" listelerimizdeki tüm elemanları eşleştirip
          // yeni arr2 listimize ekleyeceğiz
          arr2.add(isim.get(i)+" = "+adet.get(i));
      }

      System.out.println(arr2);
    }
}

    

