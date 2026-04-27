package tugas;

import java.util.Scanner;

public class Lingkaran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.14159;

        System.out.println("=== Program Menghitung Keliling dan Luas Lingkaran ===");
        System.out.print("Masukkan Jari-jari (r): ");
        double r = scanner.nextDouble();

        // Rumus
        double luas = PI * r * r;
        double keliling = 2 * PI * r;

        // Output
        System.out.println("\n--- Hasil Perhitungan ---");
        System.out.printf("Jari-jari: %.2f%n", r);
        System.out.printf("Luas     : %.2f%n", luas);
        System.out.printf("Keliling : %.2f%n", keliling);

        scanner.close();
    }
}
