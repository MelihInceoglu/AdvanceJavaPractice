package _14_Encapsulation.Q02;

import java.util.Scanner;

public class UserMain {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        User user1  = new User();
        signedIn(user1);
        logIn(user1);

        System.out.println(user1.id+" "+user1.userName+" "+user1.password+" "+user1.active+" "+user1.signedIn);


    }

    private static void logIn(User user){
        user.active=true;
        System.out.println("Kullanıcı bilgilerini giriniz");
        String userName = scanner.nextLine();
        System.out.println("Sifrenizi giriniz");
        String password = scanner.next();

        if (userName.equals(user.userName)&&password.equals(user.password)){
            System.out.println("Giriş başarıyla gerçekleşti");
        }else{
            System.out.println("Yanlış kullanıcı adı veya sifre girdiniz");

        }


    }
    private static void signedIn(User user){
        user.signedIn=true;
        System.out.println("Kullanıcı adınızı belirleyiniz");
        user.userName = scanner.nextLine();
        System.out.println("Sifrenizi belirleyiniz");
        user.password = scanner.next();
        passwordCheck(user.password);

    }

    private static void passwordCheck(String password){
        if (password.length()<6){
            System.out.println("Sifreniz 6 karakterden az olamaz");
        }
    }
}
