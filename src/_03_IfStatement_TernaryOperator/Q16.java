package _03_IfStatement_TernaryOperator;
import java.util.Scanner;

public class Q16 {
/* TASK :
    Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve 
    en kucuk olanlarini konsola yazdiriniz
    int num1 
    int num2 
    int num3
*/
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("3 sayı giriniz : ");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        int sayi3 = scan.nextInt();

        if (sayi1 >= sayi2 && sayi1>= sayi3){
            System.out.println(sayi1 + " en büyük sayıdır.");
            if (sayi2>=sayi3){
                System.out.println(sayi3 + " en küçük sayıdır.");
            } else {
                System.out.println(sayi2 + " en küçük sayıdır.");
            }
        } else if (sayi2 >= sayi1 && sayi2>= sayi3){
            System.out.println(sayi2 + " en büyük sayıdır.");
            if (sayi1>=sayi3){
                System.out.println(sayi3 + " en küçük sayıdır.");
            } else{
                System.out.println(sayi1 + " en küçük sayıdır.");
            }
        } else if (sayi3 >= sayi1 && sayi3>= sayi2){
            System.out.println(sayi3 + " en büyük sayıdır.");
            if (sayi1>=sayi2){
                System.out.println(sayi2 + " en küçük sayıdır.");
            } else{
                System.out.println(sayi1 + " en küçük sayıdır.");
            }
        }

        
    }
}

