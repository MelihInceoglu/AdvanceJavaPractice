package _05_StringManipulation;

import java.util.Locale;

public class Q11 {
    public static void main(String[] args) {
	/*  TASK :
		Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 */
        /*
        String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        int ilkHarf = pickName.indexOf('A');
        int ikinciHarf = pickName.indexOf('L');
        int ucuncuHarf = pickName.indexOf("I");


        String newName = pickName.substring(ilkHarf,ilkHarf+1).concat(" ")
                .concat(pickName.substring(ikinciHarf,ikinciHarf+1))
                .concat(" ").concat((pickName.substring(ucuncuHarf,ucuncuHarf+1).toLowerCase(Locale.ENGLISH)));


        System.out.println(newName);

         */
        // Hocanın çözümü

        String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        char a = pickName.charAt(pickName.indexOf('A'));
        char l = pickName.charAt(pickName.indexOf('L'));
        char i = pickName.charAt(pickName.indexOf('I'));

        System.out.println(""+a+l+i);




    }

}
