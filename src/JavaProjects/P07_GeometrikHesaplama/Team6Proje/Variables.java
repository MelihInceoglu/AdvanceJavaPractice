package JavaProjects.P07_GeometrikHesaplama.Team6Proje;

public class Variables {
    private static double kenar;
    private static double kisaKenar;
    private static double uzunKenar;
    private static double yaricap;

    public static double getKenar() {

        return kenar;
    }

    public static void setKenar(double kenar) throws InterruptedException {
        if (kenar > 0) {
                Variables.kenar =kenar;
            }else{
            System.out.println("Hatali giris...");
            Methods.secBegenOlc();
        }
    }

    public static double getKisaKenar() {
        return kisaKenar;
    }

    public static void setKisaKenar(double kisaKenar) throws InterruptedException {
        if (kenar > 0) {
            Variables.kisaKenar=kisaKenar;
        }else{
            System.out.println("Hatali giris...");
            Methods.secBegenOlc();
        }
    }

    public static double getUzunKenar() {
        return uzunKenar;
    }

    public static void setUzunKenar(double uzunKenar) throws InterruptedException {

            if (uzunKenar > 0) {
                Variables.uzunKenar = uzunKenar;
            }else{
                System.out.println("Hatali giris...");
                Methods.secBegenOlc();
            }
        }


    public static double getYaricap() {
        return yaricap;
    }

    public static void setYaricap(double yaricap) throws InterruptedException {
            if (yaricap > 0) {
                Variables.yaricap = yaricap;
            }else{
                System.out.println("Hatali giris...");
                Methods.secBegenOlc();
            }
        }
}

