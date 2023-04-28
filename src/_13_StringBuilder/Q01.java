package _13_StringBuilder;

public class Q01 {
    public static void main(String[] args) {
		/*
		Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom
	        olup olmadığını kontrol eden (büyük/küçük harf duyarlılığı olmadan) bir Java programı yazın.
	     (without case sensitivity)
	     Eg : input : I love Java
	     Output: "Reversed sentence : avaJ evol I 
	        It is not a palindrome"

		 */

        StringBuilder sb = new StringBuilder();
        sb.append("I Love Java");

        reversePalindrome(sb);

    }

    private static void reversePalindrome(StringBuilder sb) {
        boolean palindrome= false;
        String tersStr = sb.reverse().toString();

        System.out.println(tersStr);

        if (sb.equals(tersStr)){
            palindrome=true;
        }

        if (palindrome){
            System.out.println("Cümle palindrome");
        }else{
            System.out.println("Cümle palindrome degil");
        }

    }

}
