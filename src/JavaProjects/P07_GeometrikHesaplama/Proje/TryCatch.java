package JavaProjects.P07_GeometrikHesaplama.Proje;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    Scanner scanner = new Scanner(System.in);

    public String stringGirisi(){
        String giris="";
        try {
            giris = scanner.nextLine();
        } catch (Exception e) {
            System.out.println("lütfen geçerli bir giris yapınız");
        }
        return giris;
    }
    public int intGirisi(){
        int giris=0;
        try {
            giris = scanner.nextInt();
        } catch (InputMismatchException e){
            System.out.println("lütfen geçerli bir giris yapınız");
        } catch(IndexOutOfBoundsException e){
            System.out.println("Girdiginiz sayı indexi asıyor");
        }
        return giris;
    }
}
