import java.util.Scanner;

public class OrtalamaHesaplama {

    /**
     Ortalama hesaplamak icin gereken hesap makinesi
     */
    public static void main(String[] args) {
        Scanner ortalamaHes = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        int mat = ortalamaHes.nextInt();
        System.out.print("Fizik notunuz : ");
        int fizik = ortalamaHes.nextInt();
        System.out.print("Kimya notunuz : ");
        int kimya = ortalamaHes.nextInt();
        System.out.print("Turkce notunuz : ");
        int turkce = ortalamaHes.nextInt();
        System.out.print("Tarih notunuz : ");
        int tarih = ortalamaHes.nextInt();
        System.out.print("Muzik notunuz : ");
        int muzik = ortalamaHes.nextInt();
        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double sonuc = (double)(toplam / 6);

        System.out.println("Ortalamaniz: " + sonuc);

        String durum = (sonuc>=50) ? "Sınıfı geçtin" :"Sınıfta kaldın";
        System.out.println(durum);

    }
}
