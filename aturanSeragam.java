import java.util.Scanner;

public class aturanSeragam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kodeHari;
        char statusSeragam;

        System.out.print("Masukkan kode hari: ");
        kodeHari = sc.nextInt();

        // Switch case berdasarkan kode hari dari flowchart[cite: 1]
        switch (kodeHari) {
            case 1:
            case 2:
            case 5: // Sesuaikan angka case dengan flowchart Anda (1, 2, 3 / 1, 2, 5)
                System.out.print("Masukkan status seragam ('r' untuk rapi): ");
                statusSeragam = sc.next().charAt(0);

                if (statusSeragam == 'r' || statusSeragam == 'R') {
                    System.out.println("Boleh mengikuti perkuliahan");
                } else {
                    System.out.println("Pakaian seragam tidak rapi, tidak boleh kuliah");
                }
                break;

            case 3:
            case 4: // Sesuaikan dengan case di flowchart
                System.out.println("Pakaian bebas rapi dan sopan");
                break;

            case 6:
            case 7: // Sesuaikan dengan case di flowchart
                System.out.println("Tidak ada perkuliahan");
                break;

            default:
                System.out.println("Kode hari tidak valid");
        }

        sc.close();
    }
}