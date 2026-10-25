import java.util.Scanner;

public class kursusKomputer23 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int biayaKursus;
        int pilihanStatus;
        double diskon = 0; // Diinisialisasi dengan 0
        double totalBiaya;

        System.out.print("Masukkan biaya kursus: ");
        biayaKursus = sc.nextInt();
        
        System.out.println("Pilih status peserta kursus:");
        System.out.println("1. Pelajar sma");
        System.out.println("2. Mahasiswa"); // Diperbaiki dari 1 menjadi 2
        System.out.println("3. Umum");       // Diperbaiki dari 2 menjadi 3
        System.out.print("Masukkan pilihan (1-3): ");
        pilihanStatus = sc.nextInt();

        if (pilihanStatus == 1) {
            diskon = 0.20; // Diskon 20% untuk pelajar sma
        } else if (pilihanStatus == 2) {
            diskon = 0.15; // Diskon 15% untuk mahasiswa
        } else if (pilihanStatus == 3) {
            diskon = 0.0;  // Tidak ada diskon untuk umum
        } else {
            System.out.println("Pilihan tidak valid!");
        }

        totalBiaya = biayaKursus - (diskon * biayaKursus);
        
        System.out.println("\nRincian biaya kursus:");
        System.out.println("Biaya kursus: " + biayaKursus);
        System.out.println("Diskon: " + (diskon * 100) + "%");
        System.out.println("Total biaya setelah diskon: " + totalBiaya);
    } // Kurung kurawal kelebihan di bawah sudah dihapus
}