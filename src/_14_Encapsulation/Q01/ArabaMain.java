package _14_Encapsulation.Q01;

public class ArabaMain {
    public static void main(String[] args) {

        Araba honda = new Araba();
        honda.setYil(-2018);
        honda.setModel("Accord");
        honda.setRenk("Kırmızı");
        honda.setMotor(1600);

        Araba toyota = new Araba("Avensis","Gümüs",2000,2019);

        Araba volvo = new Araba("S80","Siyah",200,2020);

        System.out.println(honda); // toString methodu olmazsa bu obj referans degeri return eder
        System.out.println(volvo);
        System.out.println("Sectiginiz arac modeli : "+ toyota.getModel()+" rengi : "+ toyota.getRenk());

        Araba hacimurat =  new Araba(1200, 1974);

    }
}
