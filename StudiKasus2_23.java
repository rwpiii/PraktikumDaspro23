import java.util.Scanner;

public class StudiKasus2_23 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nama;
        String jenisKegiatan;
        int jumlahDokumen;
        int peringkat;
        int statusPKM;

        System.out.print("Nama mahasiswa       : ");
        nama = input.nextLine();

        System.out.print("Jenis kegiatan       : ");
        jenisKegiatan = input.nextLine();

        System.out.print("Jumlah dokumen (0-4) : ");
        jumlahDokumen = input.nextInt();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA")
                || jenisKegiatan.equalsIgnoreCase("BAKORMA")
                || jenisKegiatan.equalsIgnoreCase("Mandiri")) {

            System.out.print("Peringkat juara (0-3): ");
            peringkat = input.nextInt();

            if (peringkat >= 1 && peringkat <= 3) {

                if (jumlahDokumen == 4) {
                    System.out.println("\nStatus: Mendapatkan dana penghargaan");
                    System.out.println("Alasan: Juara " + peringkat
                            + " dan dokumen lengkap.");
                } else {
                    System.out.println("\nStatus: Tidak mendapatkan dana penghargaan");
                    System.out.println("Alasan: Dokumen tidak lengkap.");
                    System.out.println("Dokumen yang masih kurang: "
                            + (4 - jumlahDokumen));
                }

            } else {
                System.out.println("\nStatus: Tidak mendapatkan dana penghargaan");
                System.out.println("Alasan: Bukan juara 1, 2, atau 3.");
            }

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {

            System.out.print("Status pendanaan PKM (1=lolos, 0=tidak): ");
            statusPKM = input.nextInt();

            if (statusPKM == 1) {

                if (jumlahDokumen == 4) {
                    System.out.println("\nStatus: Mendapatkan dana penghargaan");
                    System.out.println("Alasan: PKM lolos pendanaan dan dokumen lengkap.");
                } else {
                    System.out.println("\nStatus: Tidak mendapatkan dana penghargaan");
                    System.out.println("Alasan: Dokumen tidak lengkap.");
                    System.out.println("Dokumen yang masih kurang: "
                            + (4 - jumlahDokumen));
                }

            } else {
                System.out.println("\nStatus: Tidak mendapatkan dana penghargaan");
                System.out.println("Alasan: PKM tidak lolos pendanaan.");
            }

        } else {
            System.out.println("\nStatus: Tidak mendapatkan dana penghargaan");
            System.out.println("Alasan: Jenis kegiatan tidak termasuk ketentuan penerima dana.");
        }

        input.close();
    }
}