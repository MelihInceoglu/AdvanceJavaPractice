package _06_Method_Creation;

public class Q05 {

    public static void main(String[] args) {
         /*
        TASK :
        Bir String içinde kaç kelime olduğunu yazdıran bir method create ediniz.
       Test Data:
       Input the string: The quick brown fox jumps over the lazy dog.
 	   Expected Output: Number of words in the string: 9
         */

        String str = "The quick brown fox jumps over the lazy.";
        System.out.println(checkWord(str));


    }

    // DAHA DUZGUN COZUM BUL
    private static int checkWord(String str) {

        String newStr = str.replaceAll("\\S","");

        int numOfWords = newStr.length()+1;
        return numOfWords;
    }
}
