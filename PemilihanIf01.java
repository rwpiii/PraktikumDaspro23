import java.util.Scanner;

public class PemilihanIf01 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("--CETAK KRS SIAKAD--");
        System.out.println("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        if (uktLunas) {
            System.out.println("Pembayaran UKT terverivikasi");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        }
    }
}