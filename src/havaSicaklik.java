import java.util.Scanner;

public class havaSicaklik {

    //Hava Sıcaklığına Göre Etkinlik Önerme
    /*  Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
        */
    public static void main(String[] args) {
        int hava;
        Scanner scan = new Scanner(System.in);
        System.out.print("Hava sıcaklığı giriniz: ");
        hava =scan.nextInt();
        if (hava<5){
            System.out.println("Kayak yapabilirsiniz");
        } else if (hava>=5 && hava<=25) {
            if (hava<=15){
                System.out.println("Sinemaya zaman8ı");
            }if (hava>=10){
                System.out.println("Piknik yapabilirsiniz");
            }
        }else {
            System.out.println("Yuzme zamanı");
        }

    }
}
