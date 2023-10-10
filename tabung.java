<<<<<<< HEAD
import java.util.Scanner;

public class tabung {
    public static void main(String[] args) {
        
        char ulang;
        do {
        Scanner input = new Scanner(System.in);

        System.out.println("====Tabung==== \n1. Luas permukaan \n2. Volume");
        String pilihan = input.nextLine();

        while (! pilihan.equalsIgnoreCase("Luas permukaan") && ! pilihan.equalsIgnoreCase("Volume")) {
            System.out.println("Pilihan tidak valid, Pilih Luas permukaan / Volume");
            pilihan = input.nextLine();
        }

         if (pilihan.equalsIgnoreCase("Luas permukaan")) {
        }
        else if (pilihan.equalsIgnoreCase("Volume")) {
        }

        double rumus = 0;
        double phi = 3.14;

        System.out.println("Masukkan jari-jari: ");
        double r = input.nextDouble();
        System.out.println("Masukkan tinggi: ");
        double t = input.nextDouble();

        if (pilihan.equalsIgnoreCase("Luas permukaan")) {
            rumus = phi * r * (r + t);
        }
        else if (pilihan.equalsIgnoreCase("Volume")) {
            rumus = phi * (r * r) * t;
        }

        System.out.println("Jari-jari: " + r +"\nTinggi: " + t +"\nHasil: " + rumus);

        System.out.println("Ingin mengulang?");
        ulang = input.next().toUpperCase().charAt(0);
        
        } while (ulang == 'Y');
    }
}
=======
import java.util.Scanner;

public class tabung {
    public static void main(String[] args) {
        
        char ulang;
        do {
        Scanner input = new Scanner(System.in);

        System.out.println("====Tabung==== \n1. Luas permukaan \n2. Volume");
        String pilihan = input.nextLine();

        while (! pilihan.equalsIgnoreCase("Luas permukaan") && ! pilihan.equalsIgnoreCase("Volume")) {
            System.out.println("Pilihan tidak valid, Pilih Luas permukaan / Volume");
            pilihan = input.nextLine();
        }

         if (pilihan.equalsIgnoreCase("Luas permukaan")) {
        }
        else if (pilihan.equalsIgnoreCase("Volume")) {
        }

        double rumus = 0;
        double phi = 3.14;

        System.out.println("Masukkan jari-jari: ");
        double r = input.nextDouble();
        System.out.println("Masukkan tinggi: ");
        double t = input.nextDouble();

        if (pilihan.equalsIgnoreCase("Luas permukaan")) {
            rumus = phi * r * (r + t);
        }
        else if (pilihan.equalsIgnoreCase("Volume")) {
            rumus = phi * (r * r) * t;
        }

        System.out.println("Jari-jari: " + r +"\nTinggi: " + t +"\nHasil: " + rumus);

        System.out.println("Ingin mengulang?");
        ulang = input.next().toUpperCase().charAt(0);
    } while (ulang == 'Y');
    }
}
>>>>>>> c3f74d9c20d8f87d56e9680c8ef5c2f2bba2105e
