package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        //TASK :  Kullanıcıdan aldığınız koordinat noktasının hangi bölgede olduğunu yazdıran bir kod yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("X ve Y Koordinat bilgilerini giriniz : ");
        int x = scan.nextInt();
        int y = scan.nextInt();

        if (x>0 && y>0){
            System.out.println("Girdiğiniz değerler 1. bölgede");
        } else  if (x<0 && y>0){
            System.out.println("Girdiğiniz değerler 2. bölgede");
        } else  if (x>0 && y<0){
            System.out.println("Girdiğiniz değerler 3. bölgede");
        } else  if (x>0 && y<0){
            System.out.println("Girdiğiniz değerler 4. bölgede");
        } else  if (x==0 && y!=0){
            System.out.println("Girdiğiniz değerler X ekseninde");
        } else  if (y==0 && x!=0){
            System.out.println("Girdiğiniz değerler Y ekseninde");
        } else  if (x==0 && y==0){
            System.out.println("Girdiğiniz değerler orijinde ");
        } else System.out.println("Hatalı değer girdiğiniz!");


    }
}
