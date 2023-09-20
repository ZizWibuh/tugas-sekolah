import java.util.Scanner;

public class ikutPemilu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Umur Anda");
        int umur = input.nextInt();
        if (umur >= 17) {
            System.out.println("Anda boleh mengikuti Pemilu");
        }
        else {
            System.out.println("Anda tidak boleh mengikuti Pemilu");
        }
        input.close();
    }
}
