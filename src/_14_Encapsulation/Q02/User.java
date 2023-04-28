package _14_Encapsulation.Q02;

public class User {
    int id;
    String userName;
    String password;
    boolean active=false;
    boolean signedIn= false;

    static int sayac =0;

    User(){
        this.id =sayac;
        sayac++;
    }
    User(int id, String userName, String password, boolean active, boolean signedIn){
        this.id = sayac;
        this.userName = userName;
        this.password = password;
        this.active=active;
        this.signedIn=signedIn;
        sayac++;


    }
}
