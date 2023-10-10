import java.util.Scanner;

public class predikatSoal4 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("=== Nilai rata-rata dan predikat ===");
        System.out.println("Masukkan nilai PAI: ");
        int PAI = input.nextInt();
        System.out.println("Masukkan nilai PKN: ");
        int PKN = input.nextInt();
        System.out.println("Masukkan nilai Bhs. Indonesia: ");
        int BhsIndonesia = input.nextInt();
        System.out.println("Masukkan nilai Bhs. INggris: ");
        int BhsInggris = input.nextInt();
        System.out.println("Masukkan nilai Matematika: ");
        int MTK = input.nextInt();

        String predikat = null;
         int rata = (PAI + PKN + BhsIndonesia + BhsInggris + MTK) / 5;

        if (rata <= 100 && rata >= 80) {
            predikat = "A";
        }
        else if (rata <= 80 && rata >= 60) {
            predikat = "B";
        }
        else if (rata <= 60 && rata >= 50) {
            predikat = "C";
        }
        else if (rata <= 50 && rata >= 45) {
            predikat = "D";
        }
        else if (rata <= 45 && rata >= 25) {
            predikat = "E";
        }
        else {
            predikat = "F";
        }
        System.out.println("Nilai rata-rata: " + rata);
        System.out.println("Predikat: " + predikat);

        input.close();
    }
}
