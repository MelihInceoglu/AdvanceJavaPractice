package _06_Method_Creation;

public class Q06 {

 /*
        TASK  :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method create ediniz.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */
 public static void main(String[] args) {
     String str = "aabbcccccdaaa";
     System.out.println(checkChars(str));

     birKereYazdir(str);


 }

    private static String checkChars(String str) {

     String newStr ="";

     for (int i = 0; i<str.length(); i++) {

             if (!newStr.contains(str.substring(i,i+1))){
                 newStr += str.charAt(i);
             }
     }
     return newStr;

    }

    private static  void birKereYazdir(String str){
        String sonuc ="";

        for (int i = 0; i<str.length(); i++) {
            if(!sonuc.contains(str.substring(i,i+1))) {
                sonuc += str.substring(i,i+1);
            }
        }
        System.out.println(sonuc);
    }



}
