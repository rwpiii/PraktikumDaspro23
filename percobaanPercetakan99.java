import java.util.Scanner;

public class percobaanPercetakan99 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahLembar;
        int tarifPerLembar = 0;
        int totalBiaya = 0;

        System.out.print("--- Program Percetakan & Foto Kopi 'Cepat Cetak' ---\n");
        System.out.print("Masukkan jumlah lembar yang dicetak: ");
        jumlahLembar = sc.nextInt();

        if (jumlahLembar < 20) { 
            tarifPerLembar = 500; 
            totalBiaya = jumlahLembar * tarifPerLembar;
        } else if (jumlahLembar >= 20 && jumlahLembar <= 50) {
            tarifPerLembar = 400;
            totalBiaya = jumlahLembar * tarifPerLembar;
        } else {
            tarifPerLembar = 300;
            totalBiaya = jumlahLembar * tarifPerLembar;
        }

        System.out.println("\n--- Rincian Biaya Cetak ---");
        System.out.println("Jumlah Lembar        : " + jumlahLembar + " lembar");
        System.out.println("Tarif per lembar     : Rp " + tarifPerLembar);
        System.out.println("Total yang harus dibayar: Rp " + totalBiaya);
    }
}

// Dina adalah mahasiswa yang sering mencetak modul dan laporan praktikum di percetakan "Cepat Cetak" dekat kampusnya. 
// Percetakan tersebut menerapkan tarif bertingkat agar pelanggan yang mencetak dalam jumlah banyak mendapatkan harga lebih hemat, 
// di mana jumlah cetak kurang dari 20 lembar dikenakan tarif Rp500 per lembar, jumlah cetak 20 sampai 50 lembar dikenakan tarif Rp400 per lembar, 
// dan jumlah cetak lebih dari 50 lembar dikenakan tarif Rp300 per lembar. Kasir sering salah menghitung total tarif manual, terutama saat 
// ada pesanan dengan jumlah lembar yang berada tepat di ambang batas harga, sehingga pemilik percetakan ingin dibuatkan program sederhana di mana
// kasir cukup memasukkan jumlah lembar (bilangan bulat) lalu program menampilkan tarif per lembar yang berlaku serta total biaya yang harus dibayar. 
// Tugas Anda adalah membuat pseudocode untuk menyelesaikan permasalahan di atas menggunakan struktur pemilihan if - else if - else 
// serta mencantumkan deklarasi variabel dan tipe datanya secara lengkap.