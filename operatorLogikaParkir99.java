import java.util.Scanner;

public class operatorLogikaParkir99 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean rodaDua;
        boolean rodaEmpat;
        boolean kartuValid;

        System.out.print("Apakah kendaraan roda dua (true/false): ");
        rodaDua = sc.nextBoolean();

        System.out.print("Apakah kendaraan roda empat (true/false): ");
        rodaEmpat = sc.nextBoolean();

        System.out.print("Apakah kartu valid (true/false): ");
        kartuValid = sc.nextBoolean();

        if ((rodaDua || rodaEmpat) && !kartuValid) {
            System.out.println("Akses diberikan");
        } else {
            System.out.println("Akses ditolak");
        }

    }
}
