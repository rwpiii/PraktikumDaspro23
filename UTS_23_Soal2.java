import java.util.Scanner;
public class UTS_23_Soal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int biayaPendaftaran;
        double diskon = 0;
        double totalBiaya = 0;
        double biayaAdministrasi = 250000; 
        String pesan;
        
        System.out.print("Masukkan biaya pendaftaran: ");
        biayaPendaftaran = sc.nextInt();
        System.out.println("Biaya pendaftaran: Rp " + biayaPendaftaran);

        System.out.println("1 sampai dengan 2 tim ");
        System.out.println("3 sampai dengan 5 tim ");
        System.out.println(" Lebih dari 5 tim ");

        System.out.println("Rincian diskon:");

        if(biayaPendaftaran.equalsIgnoreCase("Ya")) {
           if(pemerikasaanJumlahTim < 1 || Pemerikasaan > 2) {
            pesan = "Pendaftaran gagal: jumlah tim tidak valid";
           } else if (Pemeriksaan >= 3 && Pemeriksaan <= 4) {
            pesan = "Pemerikasaan jumlah anggota setiap tim";
              } else if (Pemeriksaan > 5) {
            pesan = "Pendaftaran gagal: jumlah tim melebihi batas";
              } else {
           }
        }

        if (biayaPendaftaran >= 200000) {
            diskon = 0.20; // Diskon 20% untuk biaya pendaftaran >= 2 juta
            System.out.println("Diskon: 20%");
        } else if (biayaPendaftaran >= 1000000) {
            diskon = 0.10; // Diskon 10% untuk biaya pendaftaran >= 1 juta
            System.out.println("Diskon: 10%");
        } else {
            System.out.println("Diskon: Tidak ada diskon");
        }
        if (biayaPendaftaran < 200000) {
            System.out.println("Biaya pendaftaran kurang dari Rp 200.000, tidak memenuhi syarat untuk mengikuti kursus.");
            return; // Keluar dari program jika biaya pendaftaran kurang dari Rp 200.000
        }

        totalBiaya = biayaPendaftaran - (biayaPendaftaran * diskon) + biayaAdministrasi;
        System.out.println("Biaya administrasi: Rp " + biayaAdministrasi);
        System.out.println("Total biaya yang harus dibayarkan: Rp " + totalBiaya);
        System.out.println("Terima kasih telah mendaftar kursus!");
        System.out.println("Semoga sukses dalam kursus yang akan diikuti!");

    }
}