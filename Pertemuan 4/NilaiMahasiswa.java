package tugas;

import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Program Menghitung Nilai Mahasiswa ===");

        // Input data
        System.out.print("Masukkan Jumlah Kehadiran: ");
        double kehadiran = scanner.nextDouble();

        System.out.print("Masukkan Total Realisasi Pertemuan: ");
        double realisasi = scanner.nextDouble();

        System.out.print("Masukkan Nilai Tugas: ");
        double nilaiTugas = scanner.nextDouble();

        System.out.print("Masukkan Nilai UTS: ");
        double nilaiUTS = scanner.nextDouble();

        System.out.print("Masukkan Nilai UAS: ");
        double nilaiUAS = scanner.nextDouble();

        // Perhitungan berdasarkan ketentuan
        double presensi = (kehadiran / realisasi) * 10;
        double tugasWeight = nilaiTugas * 20 / 100;
        double utsWeight = nilaiUTS * 30 / 100;
        double uasWeight = nilaiUAS * 40 / 100;

        double hasil = presensi + tugasWeight + utsWeight + uasWeight;

        // Output hasil
        System.out.println("\n--- Hasil Perhitungan ---");
        System.out.printf("Nilai Presensi: %.2f%n", presensi);
        System.out.printf("Nilai Tugas (20%%): %.2f%n", tugasWeight);
        System.out.printf("Nilai UTS (30%%): %.2f%n", utsWeight);
        System.out.printf("Nilai UAS (40%%): %.2f%n", uasWeight);
        System.out.println("-------------------------");
        System.out.printf("Total Nilai (Hasil): %.2f%n", hasil);

        scanner.close();
    }
}
