import java.util.Scanner;

public class switchJava {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan nilai");
        double C = input.nextDouble();

        System.out.println("Pilihan R/F/K");
        char operator = input.next().charAt(0);

        double R = C * 4/5;
        double F = (C * 9/5) + 32;
        double K = C + 273;

        switch (operator) {
            case 'R' :
            System.out.println("Hasil: " + R);
            break;
            case 'F' :
            System.out.println("Hasil: " + F);
            break;
            case 'K' :
            System.out.println("Hasil: " + K);
            break;
            default : 
            System.out.println("Tidak valid");
        }
    }
}
