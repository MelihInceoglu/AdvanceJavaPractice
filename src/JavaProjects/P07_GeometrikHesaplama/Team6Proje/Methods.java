package JavaProjects.P07_GeometrikHesaplama.Team6Proje;

import JavaProjects.P07_GeometrikHesaplama.Team6Proje.Cember;
import JavaProjects.P07_GeometrikHesaplama.Team6Proje.Dikdortgen;
import JavaProjects.P07_GeometrikHesaplama.Team6Proje.Kare;

import java.util.*;

public class Methods{

   /* TreeMap eslemeMapi=new TreeMap();
    ArrayList<String>sekilNo=new ArrayList<>(Arrays.asList("1"));
    ArrayList<Object>sekil=new ArrayList<Object>(Arrays.asList(kare1.Alan())*/


    static Scanner scan = new Scanner(System.in);
    public static final String W = "\u001B[37m";
    public static final String R = "\u001B[31m";
    public static final String G = "\u001B[32m";
    public static final String Y = "\u001B[33m";
    public static final String B = "\u001B[34m";

    public static void secBegenOlc() throws InterruptedException {
        Kare kare1 = new Kare();
        Dikdortgen dikdortgen1 = new Dikdortgen();
        Cember cember1 = new Cember();

        System.out.println(G+ "Kare icin 1\nDikdortgen icin 2\nCember icin 3\nCikis Q");

        String secim = scan.next();
            switch (secim) {
                case "1":
                    System.out.println(R+"Karenin kenar uzunlugu kac olacak : ");
                    try {
                        Variables.setKenar(scan.nextDouble());
                        kare1.Alan();
                        secBegenOlc();
                    } catch (InputMismatchException e) {
                        scan.nextLine();
                        System.out.println("Once sayilari ogren");
                        secBegenOlc();
                    }
                    Thread.sleep(1400);
                    scan.nextLine();
                    break;
                case "2":
                    System.out.println(Y+"Dikdortgenin uzun kenari uzunlugu kac olacak : ");
                    Variables.setUzunKenar(scan.nextDouble());
                    System.out.println("Dikdortgenin kisa kenar uzunlugu kac olacak : ");
                    Variables.setKisaKenar(scan.nextDouble());
                    dikdortgen1.Alan();
                    Thread.sleep(1400);
                    secBegenOlc();
                    break;
                case "3":
                    System.out.println(B+"Cemberin yaricapi kac olacak : ");
                    Variables.setYaricap(scan.nextDouble());
                    cember1.Alan();
                    Thread.sleep(1400);
                    secBegenOlc();
                    break;
                case "Q":
                case "q":
                    break;
                default:
                    System.out.println("Yanlis giris yaptin,tekrar dene :)");
                    secBegenOlc();
                    break;
            }
    }
}

