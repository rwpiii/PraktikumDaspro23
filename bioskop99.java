import java.util.Scanner;
public class bioskop99 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        int hargaPerTiket = 35000;
        int jumlahTiket;
        double totalHarga = 0;
        double diskon = 0;
        double totalBayar = 0;

        System.out.print("--program bioskop--");
        System.out.print("Masukkan jumlah tiket yang dipesan: ");
        jumlahTiket = sc.nextInt();

        totalHarga = jumlahTiket * hargaPerTiket;

        if (totalHarga >= 100000) {
            diskon = 0.15 * totalHarga;
        }
        totalBayar = totalHarga - diskon;

        System.out.println("\n rincian pembayaran");
        System.out.println("Total Harga awal: + Rp " + totalHarga);
        System.out.println("Besar diskon: + Rp " + diskon );
        System.out.println("Total yang harus dibayar: + RP " + totalBayar);

    }
}
