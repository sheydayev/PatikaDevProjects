import java.util.Scanner;

public class KdvTutarHesaplama {
    /** Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
        tutar 1000 TL'den büyük ise KDV oranını %8 olarak
         KDV tutarı hesaplayan programı yazınız.*/

    public static void main(String[] args) {
        double tutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen tutar giriniz: ");
        tutar= input.nextDouble();
        double kdvOran8=0.08;
        double kdvOran18=0.18;
        double kdv18 = tutar+(tutar*kdvOran18);
        double kdv8 = tutar+(tutar*kdvOran8);
        double hesapla = tutar>1000 ? kdv8:kdv18;
        System.out.println("%18 KDV uygulanır 1000 TL ve altı geri kalan %8");
        System.out.println("Tutar: "+tutar);
        System.out.println("KDL'li Tutar: "+hesapla);

    }
}
