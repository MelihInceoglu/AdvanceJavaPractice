/*package JavaProjects.P11_depoYonetimi;

import java.util.*;

public class depoyonetimimethods {
    import java.util.*;

    public class Methods {

        static Scanner scan = new Scanner(System.in);
        static Map<Integer,Urun> urunListesi=new HashMap<>();
        static List<Integer> rafListesi=new ArrayList<>(Arrays.asList(1,2,3));
        static int idCount=1000;

        public static void girisEkrani(){

            System.out.println("Lütfen yapmak istediğiniz işlemi seçin\n"
                    + "Ürün tanımlama : 1\n"
                    + "Ürün listeleme : 2\n"
                    + "Ürün girişi :3\n"
                    + "Ürün rafa koyma : 4\n"
                    + "Ürün çıkışı : 5\n"
                    + "İşlemi bitirme : 6");

            String secim = scan.nextLine();

            switch (secim) {
                case "1":
                    urunTanimla();
                    break;
                case "2":
                    urunListele();
                    break;
                case "3":
                    urunGirisi();
                    break;
                case "4":
                    urunRafaKoy();
                    break;
                case "5":
                    urunCikis();
                    break;
                case "6":
                    bitir();
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız. Tekrar deneyin");
                    girisEkrani();
                    break;
            }
            girisEkrani();

        }


        public static void urunTanimla(){

            System.out.println("Ürün ismini girin");
            String urunIsmi=scan.nextLine().toUpperCase();
            System.out.println("Üretici bilgisini girin");
            String uretici=scan.nextLine().toUpperCase();
            System.out.println("Birim bilgisini girin");
            String birim=scan.nextLine().toUpperCase();
            Urun urun = new Urun(urunIsmi,uretici,birim);
            urun.setId(++idCount);
            urunListesi.put(urun.getId(),urun);

            System.out.println("Ürün kaydı tamamlandı");

        }
        public static void urunListele(){

            System.out.printf("%-7s %-14s %-25s %-15s %-14s %-5s\n", "Id", " İsim", " Üretici", " Miktar","Birim","Raf");
            System.out.println("-------------------------------------------------------------------------------------");

            Collection<Urun> valueSet = urunListesi.values();


            for (Urun u:valueSet){
                System.out.printf("%-8d %-14s %-25s %-14s %-14s %-5d",u.getId(),u.getUrunIsmi(),u.getUretici(),u.getMiktar(),u.getBirim(),u.getRaf());
                System.out.println();
            }

            System.out.println();

        }
        public static void urunGirisi(){
            urunListele();
            System.out.println("Id girin");
            int id= 0;
            try {
                id=scan.nextInt();
                scan.nextLine();

                for (Urun urun: urunListesi.values()){
                    if (urun.getId()==id){
                        System.out.println("Ürün ismini degistirme : 1\n"
                                +"Ürün üretici bilgisini degistirme : 2\n"
                                +"Ürün birim bilgisini degistirme : 3\n"
                                +"Ürün adetini degistirme : 4\n");

                        System.out.println("Hangi islemi yapmak istersiniz?");
                        String islem = scan.nextLine();
                        switch (islem){
                            case "1":
                                System.out.println("Yeni ürün ismini girin");
                                urun.setUrunIsmi(scan.nextLine().toUpperCase());
                                break;
                            case "2":
                                System.out.println("Yeni üretici bilgisini girin");
                                urun.setUretici(scan.nextLine().toUpperCase());
                                break;
                            case "3":
                                System.out.println("Yeni birim bilgisini girin");
                                urun.setBirim(scan.nextLine().toUpperCase());
                                break;
                            case "4":
                                System.out.println("Yeni adet bilgisini girin");
                                int adet = 0;
                                try {
                                    adet = scan.nextInt();
                                    scan.nextLine();
                                } catch (Exception e) {
                                    System.out.println("Hatalı veri girdiniz");
                                }
                                urun.setMiktar(adet);
                                break;
                            default:
                                System.out.println("Hatalı veri girdiniz");
                                break;
                        }
                    }
                }
            } catch (Exception e) {
                scan.nextLine();
                System.out.println("Hatalı giriş yaptınız");
            }

        }
        public static void urunRafaKoy(){

            urunListele();
            System.out.println("Rafa yerlestirmek istediginiz ürün id bilgisini girin");
            int urunId=0;
            try {
                urunId = scan.nextInt();

                System.out.println("Seçebileceginiz raflar:");
                for (Integer raf: rafListesi){
                    System.out.print(" < "+raf+" > ");
                }
                System.out.println();
                int rafId=0;
                try {
                    rafId = scan.nextInt();
                    scan.nextLine();

                    if (rafListesi.contains(rafId)){
                        if (getUrunById(urunId).getRaf() != rafId){
                            getUrunById(urunId).setRaf(rafId);
                        }else{
                            System.out.println("Sectiginiz ürün zaten bu rafta bulunuyor");
                        }

                    }else{
                        System.out.println("Böyle bir raf bulunmuyor");
                    }

                } catch (Exception e) {
                    scan.nextLine();
                    System.out.println("Hatalı veri girdiniz");
                }

            } catch (Exception e) {
                scan.nextLine();
                System.out.println("Hatalı veri girdiniz");
            }

        }
        public static void urunCikis(){

            urunListele();
            System.out.println("Cıkısını yapmak istediginiz ürün id bilgisini girin");
            int urunId=0;
            try {
                urunId = scan.nextInt();
                scan.nextLine();

                System.out.println("Kaç adet cıkıs yapmak istersiniz");
                int miktar=0;
                try {
                    miktar = scan.nextInt();
                    scan.nextLine();
                } catch (Exception e) {
                    scan.nextLine();
                    System.out.println("Hatalı veri girdiniz");
                }

                if(getUrunById(urunId).getMiktar()>=miktar){
                    int yeniMiktar = getUrunById(urunId).getMiktar()-miktar;
                    getUrunById(urunId).setMiktar(yeniMiktar);
                    System.out.println("Cıkıs islemi basarıyla gerceklesti");
                    System.out.println("Yeni adet bilgisi : "+ getUrunById(urunId).getMiktar());
                }else {
                    System.out.println("Girdiginiz miktar stoklarımı aşıyor");
                }
            } catch (Exception e) {
                scan.nextLine();
                System.out.println("Hatalı veri girdiniz");
            }

        }
        private static void bitir() {
            System.out.println("Yine bekleriz :)");
            System.exit(0);
        }
        public static Urun getUrunById(int id) {
            Urun secilenUrun= new Urun();
            for (Urun u : urunListesi.values()){
                if (u.getId()==id) {
                    secilenUrun= u;
                    break;
                }
            }
            return secilenUrun;
        }
    }
}

 */
