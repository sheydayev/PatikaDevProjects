import java.util.Scanner;

public class vucutKitleEndekisHesaplama {

    /**
     Vücut Kitle İndeksi Hesaplayan Program
     */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Kilonuzu giriniz kg olarak: ");
        double kilo;
        kilo=input.nextDouble();
        System.out.print("Boyunuzu giriniz m olarak:");
        double boy;
        boy=input.nextDouble();
        double sonuc = kilo/(boy*boy);
        System.out.println("Vücut kitle endeksiniz: "+sonuc);


    }
}
