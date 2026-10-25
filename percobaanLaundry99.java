import java.util.Scanner;
public class percobaanLaundry99 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        double beratCucian;
        int tarifPerKg = 0;
        double totalBiaya = 0;

        System.out.print("--Program Laundry");
        System.out.print("Masukkan berat cucian (kg): ");
        beratCucian = sc.nextDouble();

        if (beratCucian < 3){
            tarifPerKg = 7000;
            totalBiaya = beratCucian * tarifPerKg;
        } else if (beratCucian >= 3 && beratCucian <= 5) {
            tarifPerKg = 6000;
            totalBiaya = beratCucian * tarifPerKg;
        } else {
            tarifPerKg = 5000;
            totalBiaya = beratCucian * tarifPerKg;
        }

        System.out.println("\n--- Rincian Biaya Laundry");
        System.out.println("Berat Cucian      : " + beratCucian + " kg");
        System.out.println("Tarif per kg       : Rp " + tarifPerKg);
        System.out.println("Total yang harus dibayar : Rp "+ totalBiaya);

    }
}
