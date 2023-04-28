package JavaProjects.P01_FilmTahmin.filmTahmin;

import java.util.*;

public class FilmTahmin {

	static List<String> film = new ArrayList<>(Arrays.asList("JOKER","INCEPTION","PIYANIST","GREENMILE","LEON","GODFATHER","JURASSICPARK","TITANIC"));
	static Scanner scan = new Scanner(System.in);
/*
 TASK :
  yukarıdaki film listinde bulunan filmlerden herhangi birisini kullanıcının filim ismini  görmeden
  filmin index nosuna göre sectiriniz
  seçilen filmin  ismini filmin harf saysının 2 katı kadar hak tanıyarak tahmin etmesini
  sağlayan method create ediniz...
  Ahanda TRICK...
  kullanıcının sectiği filmin harf sayısını  console yazdırınız.
  kullanıcının sectiği film için tahmin hakkını  console yazdırınız.
  kullanıcının her tahmininde kalan hak sayısını console yazdırınız.
  kullanıcının her tahmininde doğru ve yanlış tahmin  sayısını console yazdırınız.
  kullanıcının kaybedip veya kazandığını ve tahmin etmesi gereken filmin ismini  console yazdırınız.

 */
	
	public static void main(String[] args) {
		
		System.out.println("~~~FILM TAHMIN OYUNUNA HOSGELDINIZ~~~");

		boolean oyna = true;

		String cikis="";


		while (oyna) {

			if (cikis.equalsIgnoreCase("x")){
				oyna=false;
				System.out.println("Yine bekleriz");
				break;
			} else{
				filmTahminOyunu();
			}
			System.out.println("Oyunu bitirmek icin x'e basin");
			cikis = scan.next();

		}


	}

	private static void filmTahminOyunu() {

		System.out.println("1-"+(film.size())+" arasinda bir sayi giriniz");

		int secim = scan.nextInt()-1;


		int tahminHakki = film.get(secim).length() * 2;

		String tahmin="";

		int yanlisTahmin=0;
		int dogruTahmin=0;

		boolean bulduMu=false;

		System.out.println("Sectiginiz filmin harf sayisi : " + film.get(secim).length());

		while(tahminHakki>0){

			System.out.println("Tahmin hakkiniz : " + tahminHakki);
			tahminHakki--;
			System.out.println("Tahmininizi girin");

			tahmin= scan.next();

			if (tahmin.equalsIgnoreCase(film.get(secim))){
				bulduMu=true;
				dogruTahmin++;
				break;
			} else{
				yanlisTahmin++;
				System.out.println("Yanlis tahmin, bir daha dene");
				ipucuVer(tahmin,secim);
			}

		}

		if (bulduMu){
			System.out.println("Tebrikler oyunu kazandın ");
			System.out.println(yanlisTahmin+" kere yanlıs tahmin de bulundun ama olsun :)");
		} else {
			System.out.println("Cevap : "+ film.get(secim));
			System.out.println("Şans bu seferlik yüzüne gülmedi :(");
			System.out.println("Ama en azından "+ yanlisTahmin+ " kere denedin");
		}


	}

	private static void ipucuVer(String tahmin,int secim) {


		List<String> ipucuListesi = new ArrayList<String>();

		for (int i=0; i< film.get(secim).length();i++){
			for (int j=0; j< tahmin.length(); j++){
				if(tahmin.substring(j,j+1).equalsIgnoreCase(film.get(secim).substring(i,i+1))){
					System.out.print(tahmin.substring(j,j+1));
				}else{
					System.out.print("_");
				}
			}
		}




/*		// int maxIpucu = 3; //film.get(secim).length()/2;

		Random rand = new Random();
		int ipucu = 0; rand.nextInt(film.get(secim).length());

		String ipucuHarf ="";
		//ipucuListesi.add(film.get(secim).substring(ipucu,ipucu+1));



		for (int i=0; i<film.get(secim).length();  i++) {

				if(film.get(secim).substring(i,i+1).equalsIgnoreCase(ipucuHarf)){
					System.out.print(film.get(secim).charAt(i));
				} else{
					System.out.print("_");
				}
				ipucu= rand.nextInt(film.get(secim).length()-1);
				ipucuHarf = film.get(secim).substring(ipucu,ipucu+1);

		}

 */
		System.out.println();
	}
}
