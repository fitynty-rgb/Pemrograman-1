import java.util.Scanner;

public class PenentuanNilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // data mahasiswa
        String nama = "Fitri Yanti";
        String nim = "241011402276";

        // input nilai dan kehadiran
        System.out.print("Masukkan nilai: ");
        double nilai = input.nextDouble();

        System.out.print("Masukkan persentase kehadiran (%): ");
        double kehadiran = input.nextDouble();

        // proses
        if (kehadiran >= 75) {
            String grade;

            if (nilai >= 80) {
                grade = "A";
            } else if (nilai >= 70) {
                grade = "B";
            } else if (nilai >= 60) {
                grade = "C";
            } else if (nilai >= 55) {
                grade = "D";
            } else {
                grade = "E";
            }

            // output
            System.out.println("\n=== HASIL ===");
            System.out.println("Nama  : " + nama);
            System.out.println("NIM   : " + nim);
            System.out.println("Nilai : " + nilai);
            System.out.println("Grade : " + grade);

        } else {
            System.out.println("\n=== HASIL ===");
            System.out.println("Nama  : " + nama);
            System.out.println("NIM   : " + nim);
            System.out.println("Kehadiran kurang dari 75%");
            System.out.println("Status: Tidak Lulus");
        }

        input.close();
    }
}