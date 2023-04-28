package JavaProjects.P05_HalukMarket;

import java.util.ArrayList;
import java.util.List;



public class ProductRunner {
    static List<Product> products = new ArrayList<>();
    static List<Product> productsInCart = new ArrayList<>();
    static double totalPrice;

    public void showProducts(){ // toString() de kullanilabilir
        for(Product p : products){
            System.out.println(p.id+"    "+p.getName()+"    "+p.getPrice());
        }
    }

    public void sell(int id, double kg){

        productsInCart.add(products.get(id-1));
        System.out.println(productsInCart);
        double totalPrice = products.get(id-1).price * kg;

        System.out.println(kg+" kilo "+ products.get(id-1)+" "+ totalPrice+" TL");
    }
}
