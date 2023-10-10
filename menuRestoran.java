import java.util.Scanner;

public class menuRestoran {
    public static void main(String[] args) {

        char ulang;
        int totalBarang = 0;
        int totalHarga = 0;

        do {
        Scanner input = new Scanner(System.in);
        System.out.println("==== Kebab BossMan ====\n - Kebab daging\n - Kebab telur\n - Kebab keju\n - Kebab spesial\n - Kebab sayur");

        System.out.print("Nama Barang: ");
        String namaBarang = input.nextLine();

        while (! namaBarang.equalsIgnoreCase("Kebab daging") 
        && ! namaBarang.equalsIgnoreCase("Kebab telur") 
        && ! namaBarang.equalsIgnoreCase("Kebab keju")
        && ! namaBarang.equalsIgnoreCase("Kebab spesial")
        && ! namaBarang.equalsIgnoreCase("Kebab sayur")) {
            System.out.println("Pilihan tidak valid\n - Kebab daging\n - Kebab telur\n - Kebab keju\n - Kebab spesial\n - Kebab sayur");
            namaBarang = input.nextLine();
        }

        System.out.print("Jumlah Barang: ");
        int jumlah = input.nextInt();

        int harga = 0;

        if (namaBarang.equalsIgnoreCase("Kebab daging")) {
            harga = 10000;
        }
        else if (namaBarang.equalsIgnoreCase("Kebab telur")) {
            harga = 10000;
        }
        else if (namaBarang.equalsIgnoreCase("Kebab keju")) {
            harga = 15000;
        }
        else if (namaBarang.equalsIgnoreCase("Kebab spesial")) {
            harga = 20000;
        }
        else if (namaBarang.equalsIgnoreCase("Kebab sayur")) {
            harga = 10000;
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
            System.out.println("============================");
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