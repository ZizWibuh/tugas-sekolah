<<<<<<< HEAD
import java.util.Scanner;

public class tagihanListrik {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Input pemakaian listrik: ");
        double pemakaian = input.nextDouble();

        double tarif = 0;

        if (pemakaian <= 50) {
            tarif = 100;
        }
        else if (pemakaian <= 150) {
            tarif = 150;
        }
        else if (pemakaian <= 250) {
            tarif = 250;
        }
        else {
            tarif = 300;
        }

        double biayaPakai = pemakaian * tarif;
        double biayaTambahan = biayaPakai * 20/100;
        double total = biayaPakai + biayaTambahan;

        System.out.println("Biaya Pemakaian: " + biayaPakai);
        System.out.println("Biaya Tambahan : " + biayaTambahan);
        System.out.println("--------------------------------");
        System.out.println("Total Biaya    : " + total);

        input.close();
    }
=======
import java.util.Scanner;

public class tagihanListrik {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Input pemakaian listrik: ");
        double pemakaian = input.nextDouble();

        double tarif = 0;

        if (pemakaian <= 50) {
            tarif = 100;
        }
        else if (pemakaian <= 150) {
            tarif = 150;
        }
        else if (pemakaian <= 250) {
            tarif = 250;
        }
        else {
            tarif = 300;
        }

        double biayaPakai = pemakaian * tarif;
        double biayaTambahan = biayaPakai * 20/100;
        double total = biayaPakai + biayaTambahan;

        System.out.println("Biaya Pemakaian: " + biayaPakai);
        System.out.println("Biaya Tambahan : " + biayaTambahan);
        System.out.println("--------------------------------");
        System.out.println("Total Biaya    : " + total);
    }
>>>>>>> c3f74d9c20d8f87d56e9680c8ef5c2f2bba2105e
}