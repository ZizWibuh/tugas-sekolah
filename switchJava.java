<<<<<<< HEAD
import java.util.Scanner;

public class switchJava {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        char ulang;
    do {
        System.out.println("Masukkan nilai");
        double C = input.nextDouble();

        System.out.println("Pilihan R/F/K");
        char operator = input.next().toUpperCase().charAt(0);

        double R = C * 4/5;
        double F = (C * 9/5) + 32;
        double K = C + 273;

        switch (operator) {
            case 'R' :
            System.out.println("Hasil konversi C ke R: " + R);
            break;
            case 'F' :
            System.out.println("Hasil konversi C ke F: " + F);
            break;
            case 'K' :
            System.out.println("Hasil konversi C ke K: " + K);
            break;
            default : 
            System.out.println("Tidak valid");
        }
        
        System.out.println("Ingin mengulang? Y/N");
        ulang = input.next().toUpperCase().charAt(0);
    } while ( ulang == 'Y');

        input.close();
        }
    }

=======
import java.util.Scanner;

public class switchJava {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        char ulang;
    do {
        System.out.println("Masukkan nilai");
        double C = input.nextDouble();

        System.out.println("Pilihan R/F/K");
        char operator = input.next().toUpperCase().charAt(0);

        double R = C * 4/5;
        double F = (C * 9/5) + 32;
        double K = C + 273;

        switch (operator) {
            case 'R' :
            System.out.println("Hasil konversi C ke R: " + R);
            break;
            case 'F' :
            System.out.println("Hasil konversi C ke F: " + F);
            break;
            case 'K' :
            System.out.println("Hasil konversi C ke K: " + K);
            break;
            default : 
            System.out.println("Tidak valid");
        }
        
        System.out.println("Ingin mengulang? Y/N");
        ulang = input.next().toUpperCase().charAt(0);
    } while ( ulang == 'Y');

        input.close();
        }
    }

>>>>>>> c3f74d9c20d8f87d56e9680c8ef5c2f2bba2105e
