import java.util.Scanner;

public class kullaniciGirisi {
    /**
     *Kullanıcı Girişi
     * Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
     * eğer kullanıcı sıfırlamak isterse yeni girdiği
     * şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
     * şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz.
     * " sorun yoksa "Şifre oluşturuldu" yazan programı yazınız. */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String userName,password,newPassword;
        System.out.print("Kullanıcı adı: ");
        userName=input.nextLine();
        System.out.print("Şifreniz: ");
        password=input.nextLine();
        if (userName.equals("senan") && password.equals("s12345")){
            System.out.println("Giriş Başarılı");
        }else {
            System.out.println("Hatalı giris bilgileri");
            System.out.println("Şifreyi sıfırlamak istermisiniz? (evet/hayır)");
            String cevap=input.nextLine();
            if (cevap.equals("evet")) {
                System.out.println("Yeni şifre giriniz: ");
                newPassword=input.nextLine();
                if (newPassword.equals("s12345")){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz");

                }else {
                    System.out.println("Şifre oluşturuldu");
                    System.out.println("Şifreniz: "+ newPassword);
                }

            }
        }

    }
}
