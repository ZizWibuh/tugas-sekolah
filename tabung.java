import java.util.Scanner;

public class tabung {
    public static void main(String[] args) {
        
        Scanner tabung = new Scanner(System.in);

        System.out.println("Input jari-jari: ");
        double jari = tabung.nextDouble();

        System.out.println("Input tinggi: ");
        double tinggi = tabung.nextDouble();

        double phi = 3.14;

        double rumusTabung = phi*(jari*jari)*tinggi;
        System.out.println("Hasil: "+ rumusTabung);

        tabung.close();
    }
}
