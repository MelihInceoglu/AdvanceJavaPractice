package JavaProjects.P05_HalukMarket;

public class Product {
    int id;
    String name;
    double price;

    static int idCount=0;

    Product(String name, double price){
        idCount++;
        this.id=idCount;
        this.name = name;
        this.price = price;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private int sayac;
    Product(){
        sayac++;
        id=sayac;
    }

}
