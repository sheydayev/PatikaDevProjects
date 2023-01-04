import java.util.Scanner;
public class taxiMetre {
    /**         TaxiMetre Uygulması
     Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

     Taksimetre KM başına 2.20 TL tutmaktadır.
     Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
     Taksimetre açılış ücreti 10 TL'dir.    */

    public static void main(String[] args) {
        int km;
        double startSpice=20;
        double perKm=2.20;
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi giriniz Km cinsinden: ");
        km=input.nextInt();
        double total = startSpice+(km*perKm);
        total=total<40?40:total;
        System.out.println("Toplam tutar: " +total +" TL");

    }

}
