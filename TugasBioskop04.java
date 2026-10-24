import java.util.Scanner;
public class TugasBioskop04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        int totalTiket = 0;
        int totalPenjualan = 0;

        while (true) {
            System.out.println("Masukkan jumlah tiket pelanggan (0 untuk selesai): ");
            int jumlah = sc.nextInt();
            if (jumlah < 0) {
                System.out.println("Input tidak valid. Masukkan ulang.");
                continue;
            }
            if (jumlah == 0) {
                break;
            }
            int diskon;
            if (jumlah > 10) {
                diskon = 15;
            } else if (jumlah > 4) {
                diskon = 10;
            } else {
                diskon = 0;
            }
            int hargaAwal = jumlah * hargaTiket;
            double potongan = hargaAwal * diskon / 100.0;
            double bayar = hargaAwal - potongan;

            System.out.println("Diskon: " + diskon);
            System.out.println("Total bayar pelanggan: Rp" + bayar);
            System.out.println();
            totalTiket += jumlah;
            totalPenjualan += bayar;

            System.out.println("Total tiket terjual: " + totalTiket);
            System.out.println("Total penjualan: Rp" + totalPenjualan);
        }
    }
}