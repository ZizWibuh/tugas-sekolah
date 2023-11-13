import java.util.Scanner;

public class LatihanFungsi {
    static void TampilNama(int id) {
        String nama[] = {"Ali", "Budi", "Dani", "Edi", "Umar"};
        System.out.println(nama[id-1]);
    }

    static void Tarif(int julPakai) {
        int admin = 10000;
        int harga = 0;
        if (julPakai > 0 && julPakai <= 10) {
            harga = julPakai * 2000;
        }
        else if (julPakai > 10 && julPakai <= 20) {
            harga = julPakai * 3000;
        }
        else if  (julPakai > 20 && julPakai <= 30) {
            harga = julPakai * 4000;
        }
        else {
            harga = julPakai * 5000;
        }

        int total = harga + admin;
        System.out.println(total);
    }
    public static void main(String[] args) {

        char ulang;
        do {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Id Pelanggan: ");
        int nama = input.nextInt();
        System.out.println("Nama Pelanggan: " + nama);
        TampilNama(nama);

        System.out.print("Masukkan Pemakainan: ");
        int julPakai = input.nextInt();
        System.out.println("Total tarif: ");
        Tarif(julPakai);

        System.out.println("Ingin Mengulang?? Y/N");
        ulang = input.next().toUpperCase().charAt(0);
        } while (ulang == 'Y');
    }
}