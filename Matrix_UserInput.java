import java.util.Scanner;

public class Matrix_UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int baris = input.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = input.nextInt();

        int matriks[][] = new int [baris][kolom];

        for (int i = 0; i < matriks.length; i++) {
            for (int o = 0; o < matriks[i].length; o++) {
                System.out.print("Masukkan nilai Baris " + i + " Kolom " + o + ": ");
                matriks[i][o] = input.nextInt();
            }
        }
        System.out.println();
        System.out.println("Matrix: ");

        for (int i = 0; i < matriks.length; i++) {
            for (int o = 0; o < matriks[i].length; o++) {
                System.out.print(matriks[i][o] + "  ");
            }
            System.out.println();
        }
    }
}
