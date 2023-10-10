<<<<<<< HEAD
import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan angka 1: ");
        int angka1 = input.nextInt();

        System.out.println("Masukkan angka 2: ");
        int angka2 = input.nextInt();

        System.out.println("Pilih operator: ( + , - , x , / , % )");
        String operator = input.next();
        
        double hasil = 0;

        switch (operator) {
            case "+" :
            hasil = angka1 + angka2;
            break;
            case "-" :
            hasil = angka1 - angka2;
            break;
            case "x" :
            hasil = angka1 * angka2;
            break;
            case "/" :
            hasil = angka1 / angka2;
            break;
            case "%" :
            hasil = angka1 % angka2;
            break;
            default :
            System.out.println("Pilihan tidak valid");
        }

        System.out.println("Hasilnya: " + hasil);

        input.close();
    }
=======
import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan angka 1: ");
        int angka1 = input.nextInt();

        System.out.println("Masukkan angka 2: ");
        int angka2 = input.nextInt();

        System.out.println("Pilih operator: ( + , - , x , / , % )");
        String operator = input.next();
        
        double hasil = 0;

        switch (operator) {
            case "+" :
            hasil = angka1 + angka2;
            break;
            case "-" :
            hasil = angka1 - angka2;
            break;
            case "x" :
            hasil = angka1 * angka2;
            break;
            case "/" :
            hasil = angka1 / angka2;
            break;
            case "%" :
            hasil = angka1 % angka2;
            break;
            default :
            System.out.println("Pilihan tidak valid");
        }

        System.out.println("Hasilnya: " + hasil);
    }
>>>>>>> c3f74d9c20d8f87d56e9680c8ef5c2f2bba2105e
}