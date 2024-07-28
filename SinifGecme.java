package Basic;
import java.util.Scanner;
public class SinifGecme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int mat, fizik, turkce ,kimya ,muzik,total=0;
        double dersSayisi = 0.0;

        //Girilen not 0-100 arasındaysa ele alnırı
        System.out.println("Matematik notunuz: ");
        mat = input.nextInt();
        if (mat > 0 && mat <= 100) {
            total += mat;
            dersSayisi++;
        }

        System.out.println("Fizik notunuz: ");
        fizik = input.nextInt();
        if (fizik >0 && fizik <= 100){
            total += fizik;
            dersSayisi++;
        }

        System.out.println("Türkçe notunuz: ");
        turkce = input.nextInt();
        if (turkce >0 && turkce <= 100){
            total += turkce;
            dersSayisi++;
        }

        System.out.println("Kimya notunuz: ");
        kimya = input.nextInt();
        if (kimya >0 && kimya <= 100){
            total += kimya;
            dersSayisi++;
        }

        System.out.println("Müzik notunuz: ");
        muzik = input.nextInt();
        if (muzik > 0 && muzik <= 100){
            total += muzik;
            dersSayisi++;
        }

        double average = total / dersSayisi;

        if (average < 55){
            System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere");
            System.out.println("Ortalmanız: " + average);
        } else {
            System.out.println("Tebrikler, sınıfı geçtiniz");
            System.out.println("Ortalamanız: " + average);
        }
    }
}
