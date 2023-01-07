import java.util.Scanner;

public class manavKasaProgrami {
    /**
      Manav kasa programı
     Java ile kullanıcıların manavdan almış oldukları ürünlerin
     kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

     Meyveler ve KG Fiyatları
     Armut : 2,14 TL
     Elma : 3,67 TL
     Domates : 1,11 TL
     Muz: 0,95 TL
     Patlıcan : 5,00 TL
     */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Merhaba Manav'a hoş geldiniz");
        System.out.println("Lütfen ürün seçiniz");
        Double Armut,Elma,Domates,Muz,Patlican,Toplam;

        System.out.println("\t1.Armut : 2,14 " +
                "    2.Elma : 3,67 TL" +
                "    3.Domates : 1,11 TL" +
                "    4.Muz: 0,95 TL" +
                "    5.Patlıcan : 5,00 TL");
        System.out.print("Armut: ");
        Armut=input.nextDouble();
        System.out.print("Elma: ");
        Elma=input.nextDouble();
        System.out.print("Domates: ");
        Domates=input.nextDouble();
        System.out.print("Muz: ");
        Muz=input.nextDouble();
        System.out.print("Patlıcan: ");
        Patlican=input.nextDouble();
        Toplam=((Elma*2.14)+(Elma*3.67)+(Domates*1.11)+(Muz*0.95)+(Patlican*5.00));
        System.out.println("Armut Kaç kilo ? :"+Elma +
                "\nElma Kaç kilo ? :"+Elma+
                "\nDomates Kaç kilo ? :"+Domates+
                "\nMuz Kaç kilo ? :"+Muz+
                "\nPatlıcan Kaç kilo ? :"+Patlican+
                "\nToplam Tutar: "+ Toplam+ "TL"

        );

    }
}
