import java.util.Scanner;

public class belanja {
    public static void main(String[] args) {

        char ulang;
        int totalBarang = 0;
        int totalHarga = 0;

        do {
        Scanner input = new Scanner(System.in);
        System.out.println("==== Toko Agil Render ====\n - Buku\n - Pensil\n - Penghapus");

        System.out.print("Nama Barang: ");
        String namaBarang = input.nextLine();

        while (! namaBarang.equalsIgnoreCase("pensil") && ! namaBarang.equalsIgnoreCase("buku") && ! namaBarang.equalsIgnoreCase("penghapus")) {
            System.out.println("Pilihan tidak valid (Pensil, Buku, Penghapus)");
            namaBarang = input.nextLine();
        }

        System.out.print("Jumlah Barang: ");
        int jumlah = input.nextInt();

        int harga = 0;

        if (namaBarang.equalsIgnoreCase("Buku")) {
            harga = 2500;
        }
        else if (namaBarang.equalsIgnoreCase("Pensil")) {
            harga = 1000;
        }
        else if (namaBarang.equalsIgnoreCase("Penghapus")) {
            harga = 500;
        }
        else {
            System.out.println("Pilihan tidak valid");
        }

        int total = harga * jumlah;
        totalBarang += jumlah;
        totalHarga += total;

        System.out.println("===========================");
        System.out.println("Barang: " + namaBarang);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Total: " + total);

        System.out.print("Ingin menambah item (Y/N) ");
        ulang = input.next().toUpperCase().charAt(0);
        if (ulang == 'N') {
            System.out.println("Total Item: " + totalBarang);
            System.out.println("Total Harga: " + totalHarga);
        
        System.out.print("Jumlah uang yg dibayar: ");
        int uang = input.nextInt();
        int kembali = uang - totalHarga;

        System.out.println("============================");
        System.out.println("Uang: " + uang);
        System.out.println("Total Harga: " + totalHarga);
        System.out.println("Kembali: " + kembali);
        } 
    } while (ulang == 'Y');
}
}
