import java.util.Scanner;
public class ucgenAlanHesaplama {
    /**
     Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
     Hipotenüs bulma.
     */
    public static void main(String[] args) {
        //değüişenler
        int a;
        int b;
        double c;

        //Kullanıcıdan verileri alalım
        Scanner input =new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz: ");
        a=input.nextInt();
        System.out.print("2. Kenarı Giriniz: ");
        b=input.nextInt();
        c=Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs: "+c);


    }
}
