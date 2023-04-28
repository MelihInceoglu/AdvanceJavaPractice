package JavaProjects.P07_GeometrikHesaplama.Team6Proje;

import JavaProjects.P07_GeometrikHesaplama.Team6Proje.alanCevre;

public class Dikdortgen implements alanCevre {
    @Override
    public void Alan() {

        double Alan= Variables.getUzunKenar()*Variables.getKisaKenar();
        System.out.println("Alan = " + Alan);
        Cevre();
    }
    @Override
    public void Cevre() {
        double Cevre= 2*(Variables.getKisaKenar()+Variables.getUzunKenar());
        System.out.println("Cevre = "+Cevre);
    }
}
