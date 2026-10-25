import java.util.Scanner;

public class tes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama penumpang: ");
        String namaPenumpang = scanner.nextLine();

        System.out.print("Masukkan jumlah tiket: ");
        int jumlahTiket = scanner.nextInt();

        double hargaPerTiket = 120000.0;
        double biayaAdministrasi = 7500.0;
        double totalHargaTiket = jumlahTiket * hargaPerTiket;
        double totalPembayaran = totalHargaTiket + biayaAdministrasi;

        System.out.println("\n===== STRUK PEMESANAN TIKET KERETA API =====");
        System.out.println("Nama penumpang       : " + namaPenumpang);
        System.out.println("Jumlah tiket         : " + jumlahTiket);
        System.out.printf("Harga per tiket      : Rp %.1f%n", hargaPerTiket);
        System.out.printf("Total harga tiket    : Rp %.1f%n", totalHargaTiket);
        System.out.printf("Biaya administrasi   : Rp %.1f%n", biayaAdministrasi);
        System.out.printf("Total pembayaran     : Rp %.1f%n", totalPembayaran);
        System.out.println("============================================");

        scanner.close();
    }
}
