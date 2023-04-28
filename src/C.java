import java.util.*;

public class C {

        public static  void main(String[] args) {
            // en cok tekrar eden karaktere sahip kelimeyi yazdirin
            // tekrar sayisi esitse, tekrar eden karakterlerden alfabetik olarak once gelen hangisiyse o kelimeyi yazdirin

           String str = "Hello apple pie";
           String[] cumleArr = str.split(" ");
           List<Map<Character,Integer>> harfSayisiListesi = new ArrayList<>();

           for (int i = 0; i<cumleArr.length;i++){
               String[] harfArr = cumleArr[i].split("");
               Map<Character,Integer> harflerMap = new HashMap<>();
               for (int j = 0; j < harfArr.length; j++){

                   if(harflerMap.containsKey(harfArr[j].charAt(0))){
                       harflerMap.compute(harfArr[j].charAt(0), (k,v) -> v+1);
                   }
                   else{
                       harflerMap.put(harfArr[j].charAt(0), 1);
                   }

               }
                harfSayisiListesi.add(harflerMap);
           }

            System.out.println(harfSayisiListesi);

           int index=-1;
           String arananKelime="";
           int tekrarSayisi=-1;
           char tekrarEdenKarakter='~';

           for(Map<Character,Integer> each : harfSayisiListesi){
               index++;
               for (Map.Entry<Character,Integer> entry: each.entrySet()){
                   if (entry.getValue()>=tekrarSayisi){
                       if (entry.getKey()<tekrarEdenKarakter){
                            tekrarEdenKarakter=entry.getKey();
                            arananKelime=cumleArr[index];
                       }
                       tekrarSayisi=entry.getValue();

                   }

               }
           }
            System.out.println(arananKelime);


        }
 }

