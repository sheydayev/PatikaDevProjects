import java.util.Scanner;

public class burcBulucu {

    // Burc bulma programı

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Doğum gününüz(rakam): ");
        int day;
        int month;
        day=input.nextInt();
        System.out.print("Doğum ayınız(rakam): ");
        month=input.nextInt();
        System.out.println("********************");

        if (month==1){
            if (day>=1 && day<=31){
                if (day>=22){
                    System.out.println("Kova Burcu");
                }else System.out.println("Oğlak Burcu");
            }
            else System.out.println("Geçersiz işlem");
        }
        else if (month==2) {
            if (day>=1 && day<=29){
                if (day<=19){
                    System.out.println("Kova Burcu");
                }else System.out.println("Balık Burcu");
            }else System.out.println("Geçersiz işlem");
        }
        else if (month==3) {
            if (day>=1 && day<=31){
                if (day<20){
                    System.out.println("Balık Burcu");
                }else System.out.println("Koç Burcu");
            }else System.out.println("Geçersiz işlem");
        }
        else if (month==4) {
            if (day>=1 && day<=30){
                if (day<=20){
                    System.out.println("Koç Burcu");
                }else System.out.println("Boğa Burcu");
            }else System.out.println("Geçersiz işlem");
        }
        else if (month==5) {
            if (day>=1 && day<=31){
                if (day<=21){
                    System.out.println("Boğa Burcu");
                }else System.out.println("İkizler Burcu");
            }else System.out.println("Geçersiz işlem");
        }
        else if (month==6) {
            if (day>=1 && day<=30){
                if (day<=22){
                    System.out.println("İkizler Burcu");
                }else System.out.println("Yengeç Burcu");
            }else System.out.println("Geçersiz işlem");
        }
        else if (month==7) {
            if (day>=1 && day<=31){
                if (day<=23){
                    System.out.println("Yengeç Burcu");
                }else System.out.println("Aslan Burcu");
            }else System.out.println("Geçersiz işlem");
        }
        else if (month==8) {
            if (day>=1 && day<=31){
                if (day<=22){
                    System.out.println("Aslan Burcu");
                }else System.out.println("Başak Burcu");
            }else System.out.println("Geçersiz işlem");
        }
        else if (month==9) {
            if (day>=1 && day<=30){
                if (day<=22){
                    System.out.println("Başak Burcu");
                }else System.out.println("Terazi Burcu");
            }else System.out.println("Geçersiz işlem");
        }
        else if (month==10) {
            if (day>=1 && day<=31){
                if (day<=22){
                    System.out.println("Terazi Burcu");
                }else System.out.println("Akrep Burcu");
            }else System.out.println("Geçersiz işlem");
        }
        else if (month==11) {
            if (day>=1 && day<=31){
                if (day<=21){
                    System.out.println("Akrep Burcu");
                }else System.out.println("Yay Burcu");
            }else System.out.println("Geçersiz işlem");
        }
        else if (month==12) {
            if (day>=1 && day<=31){
                if (day<=21){
                    System.out.println("Yay Burcu");
                }else System.out.println("Oğlak Burcu");
            }else System.out.println("Geçersiz işlem");
         }
        else System.out.println("Geçersiz işlem");
    }
}
