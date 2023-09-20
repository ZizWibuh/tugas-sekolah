import java.util.Scanner;

public class perulanganKata {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan batas: ");
        int batas = input.nextInt();

        for (int awal = 1; awal <= batas; awal++) {
            System.out.println(awal +". "+ "Halo Java!");
        }
    }
}
