import java.util.Scanner;

public class lebihDari1Item {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan jumlah item: ");
        int jumlahItem = input.nextInt();

        int harga = 0;
        int jumlahBarang = 0;
        int total = 0;

        for (int num = 1; num <= jumlahItem; num++) {

            System.out.println("Item ke-" + num);

            System.out.println(num + ". " + "Masukkan nama barang: ");
            String barang = input.nextLine();
            input.nextLine();

            System.out.println(num + ". " + "Harga: ");
            harga = input.nextInt();

            System.out.println(num + ". " + "Masukkan jumlah barang: ");
            jumlahBarang = input.nextInt();

            int subtotal = harga * jumlahBarang;
            total += subtotal;
        }
        System.out.println("=======================================");
        System.out.println("Jumlah barang yg dibeli: " + jumlahItem);
            System.out.println("Total harga: " + total);
    }
}