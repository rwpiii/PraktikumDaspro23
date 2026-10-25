
/*
 * Nama         : Refi Chalifia Dzulfi
 * NIM          : 264107020079
 * Kelas        : D4 Teknik Informatika
 * No. Presensi : 01
 */
import java.util.Scanner;

public class UTS_00_Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama penyewa: ");
        String namaPenyewa = input.nextLine();

        System.out.print("Masukkan jumlah hari penyewaan tenda: ");
        int jumlahHari = input.nextInt();

        double hargaSewaPerHari = 75000.0;
        double totalHargaSewa = jumlahHari * hargaSewaPerHari;
        double biayaKebersihan = 10000.0;
        double totalPembayaran = totalHargaSewa + biayaKebersihan;

        System.out.println("\n=== STRUK PENYEWAAN TENDA ===");
        System.out.println("Nama penyewa       : " + namaPenyewa);
        System.out.println("Lama penyewaan     : " + jumlahHari + " hari");
        System.out.println("Harga sewa per hari: Rp" + hargaSewaPerHari);
        System.out.println("Total harga sewa   : Rp" + totalHargaSewa);
        System.out.println("Biaya kebersihan   : Rp" + biayaKebersihan);
        System.out.println("Total pembayaran   : Rp" + totalPembayaran);

        input.close();
    }
}