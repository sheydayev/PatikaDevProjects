import java.util.Scanner;

public class daireAlanHesaplama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r;
        double pi = 3.14;
        System.out.print("Dairenin yarı çapını giriniz: ");
        r=input.nextInt();
        double alan = pi *r *r;
        double cevre = 2*pi*r;
        System.out.println("Dairenin alanı: "+alan);
        System.out.println("Dairenin çevresi: " +cevre);
    }
}
