package _14_Encapsulation.Q01;

public class Araba { // POJO : planning old java object ==> modal class


    private String model;
    private String renk;
    private int motor;
    private int yil;

    Araba(){

    }

    Araba(String model, String renk, int motor, int yil){
        this.model = model;
        this.renk = renk;
        // this.motor = motor;
        // this.yil = yil;
        setMotor(motor); // constructor'a obj create etmek icin parametre olarak girilen motor verisi
                         // setMotor() methoduna parametre olarak calıstı ve degerini aldı
        setYil(yil);

    }

    public Araba(int motor, int yil) {
        setMotor(motor);
        setYil(yil);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {

        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        if (motor<1000){
            System.out.println("Girilen cc degerini kontrol edin");
            this.motor = 1200;
        }else
        this.motor = motor;

    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        if (yil<0){
            this.yil=(-1)*yil;
            System.out.println("0dan kücük yil degeri girdiniz");
        }else
        this.yil = yil;
    }

    @Override
    public String toString() { // bu method bu classdan create edilen obj istenen field'larini stringe cevirir
        return "Araba{" +
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", motor=" + motor +
                ", yil=" + yil +
                '}';
    }
}
