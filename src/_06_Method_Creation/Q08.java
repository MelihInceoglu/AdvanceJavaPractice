package _06_Method_Creation;

import java.util.Scanner;

public class Q08 {
  /*
    TASK :
    Kullanıcıdan aldığınız bir String'deki kelimeleri sondan başa doğru yerleştiren
    String parametreli return type li reverseWord isminde bir method create ediniz

     Test Data :
    İnput : Allah Javacı arkadaşlara  zihin açıklığı versin
    Output : versin açıklığı zihin arkadaşlara Javacı Allah
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir cümle giriniz");
        String str = scan.nextLine();
        System.out.println(tersCumle(str));
    }

    private static String tersCumle(String str) {
        String tersCumle="";
        int bosluk =0;

        do {

            bosluk =str.lastIndexOf(" ");
            if (bosluk==-1) {
                tersCumle+=str.substring(0);
                break;
            }else{
                tersCumle += str.substring(bosluk+1);
                tersCumle += " ";
            }

            str = str.substring(0,bosluk);

        }while(true);

        return tersCumle;
    }
}
