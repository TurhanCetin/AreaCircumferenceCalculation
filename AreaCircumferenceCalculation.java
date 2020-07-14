import java.util.Scanner;

public class AlanHesap { /*Circle(daire),Square(kare),Rectangle(dikdörtgen)*/

    public static void main(String[] args) {

        double kareKenar, dikUzun,dikKısa;/*Burada alan ve çevre hesabında kullancağımız değişkenleri double atadık çünkü eğer uzunluk onladık olursa sıkıntı yaşamamak için*/
        double Pi = 3.14, Cap;/*Pi değeri bizden 3.14 sabitinde almamızı istiyordu Math Kütüphanesinden almak yerinde bir değişken halinde atadık*/

        Scanner girdi = new Scanner(System.in);

        double Alan,Cevre;
        int Secim;

        System.out.print("Dairenin alan ve çevresini hesaplamak istiyorsanız 1e basınız , Karenin alan ve çevresini hesaplamak istiyorsanız 2ye basınız dikdörtgenin alanve çevresi için 3 e basınız");

        Secim = girdi.nextInt();/*Burada kullanıcın hangi işlemi yapmak istediğini sorup belirlerdik ve seçimi iflere gönderdik*/


        if (Secim == 1) {

            System.out.println("LÜtfen Dairenin Yarıçapını Giriniz"); /*1. seçim daire seçemi idi o yüzden alan ve çevre hesabı için gerekli olan yarı çapı kullanıcıdan istedik*/

            Scanner girdi1 = new Scanner(System.in);
            Cap = girdi1.nextDouble();

            Alan = Pi * (Math.sqrt(Cap));/*Matematik kütüphanesi kullanarak sqrt fonksiyonu ile yarıçapın karesini aldık*/
            Cevre = 2 + Pi + Cap;/*Dairenin çevresi hesabını koda aktardık*/

            System.out.println("Girdiğiniz Dairenin Alanı : " + Alan);

            System.out.println("Girdiğiniz Dairenin Çevresi : " + Cevre);

        }

        if (Secim == 2) {/*2.seçim ise karenin çevresi ve alanı hesaplama*/

            System.out.println("Lütfen Karenin Bir Kenarının Uzunluğunu Giriniz");

            Scanner girdi2 = new Scanner(System.in);
            kareKenar = girdi2.nextDouble();

            Alan = Math.pow(kareKenar,2);/*Tekrardan Matemetik kütüphanesi pow fonksiyonu kullanarak karenin kenarının karesini alarak alanı elde ettik */
            Cevre = 4 * kareKenar;/*Karenin bir kenarını 4 ile çarparak çevresini hesapladık*/

            System.out.println("Karenin Alanı : " + Alan);
            System.out.println("Karenin Çevresi : " + Cevre);

        }

        if (Secim == 3) {

            System.out.println("Lütfen dikdörtgenin uzun kenarını giriniz");/*Burada dikdörtgen için bir uzun birde kısa kenar istedik ayrı ayrı istedik çünkü oluşabilecek karışıklıklardan kurtulmak için*/
            Scanner girdi3 = new Scanner(System.in);
            dikKısa = girdi3.nextDouble();
            System.out.println("Lütfen dikdörtgenin kısa kenarını giriniz");
            Scanner girdi4 = new Scanner(System.in);
            dikUzun = girdi4.nextDouble();

            Alan = dikKısa * dikUzun;/*Dikdörtgenin alan formülünü koda aktardık*/

            Cevre = 2 * (dikKısa + dikUzun);/*Çevre uzun ve kısa kenarın toplamının 2 katıdır bunu koda aktardık*/

            System.out.println("Dikdörtgennin Alanı : " +  Alan);
            System.out.println("Dikdörtgenin Çevresi : " +  Cevre);


        }
    }
}
