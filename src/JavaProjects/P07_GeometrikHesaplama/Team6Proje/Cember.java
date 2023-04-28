package JavaProjects.P07_GeometrikHesaplama.Team6Proje;

import JavaProjects.P07_GeometrikHesaplama.Team6Proje.alanCevre;

public class Cember implements alanCevre {

    public final double piSayisi=3.14159;
    @Override
    public void Alan() {
        double Alan = Variables.getYaricap()*Variables.getYaricap()*piSayisi;
        System.out.println("Alan = "+Alan);
        Cevre();
    }

    @Override
    public void Cevre() {
        double Cevre = 2*piSayisi*Variables.getYaricap();
        System.out.println("Cevre = "+Cevre);
    }
}
