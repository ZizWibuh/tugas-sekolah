import java.util.Scanner;

public class BayarSekolah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String jalurMasuk;
        char kategori;
        int pendapatan, bulan, DSP, SPP;
        
        System.out.println("===== Program Biaya Sekolah =====");
        System.out.println("PIliha jalur masuk\n I. SBMPTN\n II. SNMPTN\n III. Mandiri");

        System.out.print("Masukkan pilihan (I/II/III): ");
        jalurMasuk = input.nextLine();

        while (! jalurMasuk.equalsIgnoreCase("I") 
        && ! jalurMasuk.equalsIgnoreCase("II")
        && ! jalurMasuk.equalsIgnoreCase("III")) {
            System.out.println("Pilihan tidak valid (I/II/III)");
            jalurMasuk = input.nextLine();
        }

        System.out.println("Masukkan pendapatan: Rp. ");
        pendapatan = input.nextInt();
        System.out.println("Masukkan jumlah bulan yg ingin dibayar: ");
        bulan = input.nextInt();

        switch (jalurMasuk) {
            case "I" :
            if (pendapatan < 2000000 ) {
                kategori = 'A';
                DSP = 5000000;
                SPP = 500000;
            }
            else if (pendapatan >= 2000000 && pendapatan <= 10000000) {
                kategori = 'B';
                DSP = 15000000;
                SPP = 1000000;
            }
            else {
                kategori = 'C';
                DSP = 30000000;
                SPP = 2000000;
            }
            break;
            case "II" :
            if (pendapatan < 2000000 ) {
                kategori = 'A';
                DSP = 7000000;
                SPP = 500000;
            }
            else if (pendapatan >= 2000000 && pendapatan <= 10000000) {
                kategori = 'B';
                DSP = 17000000;
                SPP = 1000000;
            }
            else {
                kategori = 'C';
                DSP = 35000000;
                SPP = 2000000;
            }
            break;
            case "III" :
            if (pendapatan < 2000000 ) {
                kategori = 'A';
                DSP = 10000000;
                SPP = 1000000;
            }
            else if (pendapatan >= 2000000 && pendapatan <= 10000000) {
                kategori = 'B';
                DSP = 25000000;
                SPP = 2000000;
            }
            else {
                kategori = 'C';
                DSP = 50000000;
                SPP = 3000000;
            }
            break;
            default : 
            System.out.println("Tidak valid");
            DSP = 0;
            SPP = 0;
            kategori = '\u0000';
            break;
        }

        int total = DSP + (bulan * SPP);

        System.out.println("=========================");
        System.out.println("Kategori: " + kategori);
        System.out.println("DSP: Rp. " + DSP);
        System.out.println("SPP: Rp. " + SPP);
        System.out.println("Berapa bulan bayarnya: " + bulan);
        System.out.println("===========================");
        System.out.println("Total: Rp. " + total);
    }
}
