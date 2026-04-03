package tugas;

import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Program Konversi Suhu (Celsius to Others) ===");
        System.out.print("Masukkan suhu dalam Celsius: ");
        double celsius = scanner.nextDouble();

        // Rumus Konversi
        double fahrenheit = (celsius * 9/5) + 32;
        double reamur = celsius * 4/5;
        double kelvin = celsius + 273.15;

        // Output hasil
        System.out.println("\n--- Hasil Konversi ---");
        System.out.printf("Celsius    : %.2f °C%n", celsius);
        System.out.printf("Fahrenheit : %.2f °F%n", fahrenheit);
        System.out.printf("Reamur     : %.2f °R%n", reamur);
        System.out.printf("Kelvin     : %.2f K%n", kelvin);

        scanner.close();
    }
}
