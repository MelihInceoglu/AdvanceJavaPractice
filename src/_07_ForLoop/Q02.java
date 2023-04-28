package _07_ForLoop;

public class Q02 {
    public static void main(String[] args) {


// 0-255 e kadar olan harflerin , sayı ve harf değerini konsola yazdırınız.

        char i =0;

        do {
            if (i>='a'&&i<='z'||i>='A'&&i<='Z'){
                System.out.println(i+ " = " + (i+0));
            }
            i++;
        }while(i<=255);



    }
}


