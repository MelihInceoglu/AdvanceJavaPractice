package JavaProjects.P05_HalukMarket;

import java.util.Scanner;

public class HalukMarket {


    public static void main(String[] args) {

		/* Basarili Market alış-veriş programı.
		 *
		 * 1. Adım: Ürünler ve fiyatları içeren listeleri oluşturunuz.
		 * 			No 	   Ürün 		  Fiyat
				   ====	 =======	 	=========
					00	 Domates   	 	 2.10 TL
					01	 Patates   	 	 3.20 TL
					02	 Biber     	 	 1.50 TL
					03	 Soğan      	 2.30 TL
					04	 Havuç     	   	 3.10 TL
					05	 Elma      	   	 1.20 TL
					06	 Muz     	 	 1.90 TL
					07	 Çilek 	 		 6.10 TL
					08	 Kavun      	 4.30 TL
					09	 Üzüm      	 	 2.70 TL
					10	 Limon     	 	 0.50 TL

		 * 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini isteyiniz.
		 * 3. Adım: Kaç kg satın almak istediğini sorunuz.
		 * 4. Adım: Alınacak bu ürünü sepete ekleyiniz ve Sepeti yazdırınız.
		 * 5. Başka bir ürün alıp almak istemediğini sorunuz.
		 * 6. Eğer devam etmek istiyorsa yeniden ürün seçme kısmına yönlendiriniz.
		 * 7. Eğer bitirmek istiyorsa ödemeyi kontrol edip para ustu hesaplayarak  programı bitirinzi.
		 */

        Scanner scan = new Scanner(System.in);
        ProductRunner rp = new ProductRunner();

        rp.products.add(new Product("Domates",2.10));
        rp.products.add(new Product("Patates",3.20));
        rp.products.add(new Product("Biber",1.50));
        rp.products.add(new Product("Sogan",2.30));
        rp.products.add(new Product("Havuc",3.10));
        rp.products.add(new Product("Elma",1.20));
        rp.products.add(new Product("Muz",1.90));
        rp.products.add(new Product("Cilek",6.10));
        rp.products.add(new Product("Kavun",4.30));
        rp.products.add(new Product("Üzüm",2.70));
        rp.products.add(new Product("Limon",0.50));

        System.out.println("Sepete eklemek istediginiz ürünün id numarasını ve kaç kg istediginizi girin");
        rp.showProducts();

        String choosenProduct= scan.nextLine();
        String[] productToCart = choosenProduct.split(" ");

        int choosenProductId = Integer.parseInt(productToCart[0]);
        double choosenProductKg = Double.parseDouble(productToCart[1]);


        rp.sell(choosenProductId,choosenProductKg);



    }
}
