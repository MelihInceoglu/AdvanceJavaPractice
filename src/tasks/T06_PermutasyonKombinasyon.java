package tasks;

public class T06_PermutasyonKombinasyon {
    /*  Problem Tanımı
            Verilen iki sayının kombinasyonunu bulan kodu yazınız.
            Hatırlatma C(n,r) = n! / (r!(n-r)!)

            Verilen iki sayının permütasyonunu bulan kodu yazınız.
            Hatırlatma P(n,r) = n! / (n-r)!

            Ekran Çıktısı
            Birinci sayıyı giriniz: 15
            Ikinci sayıyı giriniz: 4
            Kombinasyon: 1365
            permütasyon: 32760

            Birinci sayıyı giriniz: 5
            Ikinci sayıyı giriniz: 3
            Kombinasyon: 10
            permütasyon: 60
          */
    public static void main(String[] args) {

        long n  =15, r=4, nR=n-r;
        long nFaktoriyel=1, rFaktoriyel=1, nRFaktoriyel=1;

        while(n>0){
            nFaktoriyel *= n;
            n--;
        }
        while(r>0){
            rFaktoriyel *= r;
            r--;
        }
        while(nR>0){
            nRFaktoriyel *= nR;
            nR--;
        }
        long kombinasyon = nFaktoriyel/ (rFaktoriyel*nRFaktoriyel);
        long permutasyon = nFaktoriyel / nRFaktoriyel;
        System.out.println("Kombinasyon : "+ kombinasyon);
        System.out.println("Permutasyon : "+ permutasyon);

        System.out.println(faktoriyel(10));
    }

    private static long faktoriyel(long sayi){
        if (sayi<=0) return 1;
        return sayi*faktoriyel(sayi-1); // recrusive method
    }
}
