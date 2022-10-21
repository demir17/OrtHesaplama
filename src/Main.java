import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mat, fizik, turkce, kimya, muzik;
        double avg;
        System.out.println("Matematik notunuzu giriniz:");
        mat= sc.nextInt();
        if (mat < 0 || mat > 100){
            System.out.println("Girdiğiniz sayı 0 ila 100 arasında olmalıdır..\nTekrardan giriniz...");
            mat = sc.nextInt();
        }

        System.out.println("Fizik notunuzu giriniz:");
        fizik = sc.nextInt();
        if (fizik < 0 || fizik > 100){
            System.out.println("Girdiğiniz sayı 0 ila 100 arasında olmalıdır..\nTekrardan giriniz...");
            fizik = sc.nextInt();
        }

        System.out.println("Türkçe notunuzu giriniz:");
        turkce = sc.nextInt();
        if (turkce < 0 || turkce > 100){
            System.out.println("Girdiğiniz sayı 0 ila 100 arasında olmalıdır..\nTekrardan giriniz...");
            turkce = sc.nextInt();
        }

        System.out.println("Kimya notunuzu giriniz:");
        kimya = sc.nextInt();
        if (kimya < 0 || kimya > 100){
            System.out.println("Girdiğiniz sayı 0 ila 100 arasında olmalıdır..\nTekrardan giriniz...");
            kimya = sc.nextInt();
        }

        System.out.println("Müzik notunuzu giriniz:");
        muzik = sc.nextInt();
        if (muzik < 0 || muzik > 100){
            System.out.println("Girdiğiniz sayı 0 ila 100 arasında olmalıdır..\nTekrardan giriniz...");
            muzik = sc.nextInt();
        }
        avg = (mat + turkce + kimya + fizik + muzik)/5;
        if (avg > 55){
            System.out.println("Tebrikler sınıfı başarıyla geçtiniz.");
        }
        else {
            System.out.println("Maalesef sınıfı geçemediniz.");
        }


    }
}
