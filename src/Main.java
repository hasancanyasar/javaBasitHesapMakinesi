import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1,n2;
        int select;
        Scanner input = new Scanner(System.in);

        System.out.println("Birinci Sayıyı Giriniz : ");
        n1 = input.nextDouble();

        System.out.println("İkinci Sayıyı Giriniz : ");
        n2 = input.nextDouble();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz? : ");
        select = input.nextInt();

        switch (select) {
            case 1 -> System.out.println(n1 + n2);
            case 2 -> System.out.println(n1 - n2);
            case 3 -> System.out.println(n1 * n2);
            case 4 -> System.out.println(n1 / n2);
        }




    }
}