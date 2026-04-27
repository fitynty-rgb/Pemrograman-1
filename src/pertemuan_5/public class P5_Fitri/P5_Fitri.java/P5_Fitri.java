import java.util.Scanner;

public class P5_Fitri {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Simulasi Dompet Digital ===");

        // Input dari user
        System.out.print("Status akun aktif? (true/false): ");
        boolean statusAkun = input.nextBoolean();

        System.out.print("Masukkan saldo Anda: Rp");
        double saldoAwal = input.nextDouble();

        System.out.print("Masukkan jumlah pembayaran: Rp");
        double jumlahBayar = input.nextDouble();

        System.out.println("\nSedang diproses...\n");

        // 1. if
        System.out.println("--- Cek Akun ---");
        if (statusAkun) {
            System.out.println("Akun aktif, transaksi bisa dilanjutkan.");
        }

        // 2. if-else
        System.out.println("\n--- Proses Transaksi ---");
        if (saldoAwal >= jumlahBayar) {
            saldoAwal -= jumlahBayar;
            System.out.println("Pembayaran berhasil.");
            System.out.println("Sisa saldo: Rp" + saldoAwal);
        } else {
            System.out.println("Gagal! Saldo tidak cukup.");
        }

        // 3. if-else if
        System.out.println("\n--- Bonus Poin ---");
        int poin = 0;

        if (jumlahBayar >= 100000) {
            poin = 50;
            System.out.println("Kamu dapat bonus besar: " + poin + " poin");
        } 
        else if (jumlahBayar >= 50000) {
            poin = 20;
            System.out.println("Kamu dapat bonus sedang: " + poin + " poin");
        } 
        else if (jumlahBayar >= 10000) {
            poin = 5;
            System.out.println("Kamu dapat bonus kecil: " + poin + " poin");
        } 
        else {
            System.out.println("Tidak ada bonus poin.");
        }

        System.out.println("\n=== Program selesai ===");

        input.close();
    }
}