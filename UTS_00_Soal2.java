
/*
 * Nama         : Refi Chalifia Dzulfi
 * NIM          : 264107020079
 * Kelas        : D4 Teknik Informatika
 * No. Presensi : 01
 */
import java.util.Scanner;

public class UTS_01_Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama ketua tim: ");
        String namaKetua = input.nextLine();

        System.out.print("Masukkan jumlah tim yang didaftarkan: ");
        int jumlahTim = input.nextInt();

        // Tahap 1: Pemeriksaan jumlah tim
        if (jumlahTim < 1) {
            System.out.println("Pendaftaran gagal: jumlah tim tidak valid");
        } else {
            System.out.print("Masukkan jumlah anggota setiap tim: ");
            int jumlahAnggota = input.nextInt();

            // Tahap 2: Pemeriksaan jumlah anggota setiap tim (2 sampai 4 orang)
            if (jumlahAnggota >= 2 && jumlahAnggota <= 4) {
                System.out.print("Apakah memiliki surat tugas dari kampus? (true/false): ");
                boolean suratTugas = input.nextBoolean();

                System.out.print("Apakah memiliki surat rekomendasi dosen pembimbing? (true/false): ");
                boolean suratRekomendasi = input.nextBoolean();

                // Tahap 3: Pemeriksaan kelengkapan surat tugas ATAU surat rekomendasi
                if (suratTugas || suratRekomendasi) {
                    System.out.print("Apakah kampus mitra? (true/false): ");
                    boolean kampusMitra = input.nextBoolean();

                    System.out.println("Pendaftaran berhasil");

                    double hargaPerTim = 200000;
                    double totalSebelumDiskon = jumlahTim * hargaPerTim;
                    double diskonPersen = 0;

                    if (jumlahTim >= 1 && jumlahTim <= 2) {
                        diskonPersen = 0;
                    } else if (jumlahTim >= 3 && jumlahTim <= 5) {
                        diskonPersen = 0.10;
                    } else if (jumlahTim > 5) {
                        diskonPersen = 0.15;
                    }

                    double nilaiDiskon = totalSebelumDiskon * diskonPersen;
                    double totalSetelahDiskon = totalSebelumDiskon - nilaiDiskon;

                    double biayaAdmin = 25000;
                    if (kampusMitra || jumlahTim > 8) {
                        biayaAdmin = 0;
                    }

                    double totalBayar = totalSetelahDiskon + biayaAdmin;

                    System.out.println("\n--- RINGKASAN BIAYA PENDAFTARAN ---");
                    System.out.println("Nama Ketua Tim          : " + namaKetua);
                    System.out.println("Jumlah Tim              : " + jumlahTim);
                    System.out.println("Total Sebelum Diskon    : Rp" + totalSebelumDiskon);
                    System.out.println("Persentase Diskon       : " + (diskonPersen * 100) + "%");
                    System.out.println("Nilai Diskon            : Rp" + nilaiDiskon);
                    System.out.println("Total Setelah Diskon    : Rp" + totalSetelahDiskon);
                    System.out.println("Biaya Administrasi      : Rp" + biayaAdmin);
                    System.out.println("Total yang Harus Dibayar: Rp" + totalBayar);

                } else {
                    System.out.println("Pendaftaran gagal: tidak ada surat tugas maupun rekomendasi dosen");
                }
            } else {
                System.out.println("Pendaftaran gagal: jumlah anggota tim harus 2 sampai 4 orang");
            }
        }
        input.close();
    }
}