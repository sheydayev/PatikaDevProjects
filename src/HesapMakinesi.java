import java.util.Scanner;

public class HesapMakinesi {
    /**
    hesap makinesini switch-case kullanarak yapınız.
    */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int secim,sayi1,sayi2;
        System.out.print("1.sayı'yı giriniz: ");
        sayi1=input.nextInt();
        System.out.print("2. sayı'yı giriniz: ");
        sayi2=input.nextInt();

        System.out.println("Yapmak istediğiniz işlemi seçiniz");
        System.out.println("Toplama işlemi için: +" +
                "\nÇıkarma işlemi için: -"+
                "\nÇarpma işlemi için: *"+
                "\nBölme işlemi için: /");
        secim=input.next().charAt(0);
        switch (secim) {
            case '+':
                System.out.println("İşlem sonucu = "+(sayi1 + sayi2));
                break;
            case '-':
                System.out.println("İşlem sonucu = "+(sayi1 - sayi2));
                break;
            case '*':
                System.out.println("İşlem sonucu = "+(sayi1 * sayi2));
                break;
            case '/':
                System.out.println("İşlem sonucu = "+(sayi1 / sayi2));
                break;
            default:
                System.out.println("Yanlış işlem !!!");
        }
    }
}
