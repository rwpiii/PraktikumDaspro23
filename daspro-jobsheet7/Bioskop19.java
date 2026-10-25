import java.util.Scanner;
public class Bioskop19 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        
        int jumlah;
        int totalTiket = 0;
        int hargaTiket = 50000;
        double diskon = 0;
        double totalHarga = 0;
        double subtotal = 0;

        System.out.println("Penjualan Tiket Bioskop");
        System.out.println("Masukkan 0 untuk mengakhiri penjualan");

        do { 
            System.out.print("Jumlah tiket yang dibeli pelanggan : ");
            jumlah = sc.nextInt();

            if (jumlah < 0){
                System.out.println ("Input tidak valid. Masukkan ulang ");
                continue;
            }
            if (jumlah > 0){
                totalTiket += jumlah;
                subtotal = jumlah * hargaTiket;
                if (jumlah > 10){
                    diskon = 0.15;
                } else if(jumlah > 4){
                    diskon = 0.10;
                }
            }
            totalHarga += subtotal - subtotal * diskon;
        } while (jumlah !=0);

        System.out.println("Total tiket terjual : " + totalTiket);
        System.out.println("Total harga penjualan : " + totalHarga);

        sc.close();
    }
}