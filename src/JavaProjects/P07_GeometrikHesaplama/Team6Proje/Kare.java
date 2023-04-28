package JavaProjects.P07_GeometrikHesaplama.Team6Proje;

public class Kare implements alanCevre {

/*    private static double kenar;

    public Kare(double kenar){
        this.kenar=kenar;
    }

 */

    @Override
    public void Alan() {
        double Alan = Variables.getKenar()*Variables.getKenar();
        System.out.println("Alan : "+Alan);
        Cevre();
    }

    @Override
    public  void Cevre() {
        double Cevre = Variables.getKenar()*4;
        System.out.println("Cevre : "+Cevre);

    }
}
