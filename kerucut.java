<<<<<<< HEAD
import java.util.Scanner;

public class kerucut {
    public static void main(String[] args) {
        
        Scanner kerucut = new Scanner(System.in);

        System.out.println("Input jari-jari: ");
        double jari = kerucut.nextDouble();
        
        System.out.println("Input tinggi: ");
        double tinggi = kerucut.nextDouble();

        double phi = 3.14;

        double volumeKerucut = phi*(jari*jari)*tinggi*1/3;
        System.out.println("Hasil: "+ volumeKerucut);

        kerucut.close();
    }
=======
import java.util.Scanner;

public class kerucut {
    public static void main(String[] args) {
        
        Scanner kerucut = new Scanner(System.in);

        System.out.println("Input jari-jari: ");
        double jari = kerucut.nextDouble();
        
        System.out.println("Input tinggi: ");
        double tinggi = kerucut.nextDouble();

        double phi = 3.14;

        double volumeKerucut = phi*(jari*jari)*tinggi*1/3;
        System.out.println("Hasil: "+ volumeKerucut);

        kerucut.close();
    }
>>>>>>> c3f74d9c20d8f87d56e9680c8ef5c2f2bba2105e
}