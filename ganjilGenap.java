import java.util.Scanner;

public class ganjilGenap {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan bilangan asal: ");
        int angka = input.nextInt();
        if (angka % 2 == 0) {
            System.out.println("Bilangan Genap");
        }
        else {
            System.out.println("Bilangan Ganjil");
        }
        input.close();
    }
}
