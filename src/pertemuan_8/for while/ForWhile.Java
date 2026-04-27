import java.util.Scanner;

public class ForWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Perulangan FOR
        for (int i = 1; i <= 3; i++) {
            System.out.print("Masukkan nama: ");
            String nama = input.nextLine();
            System.out.println("Halo " + nama);
        }

        // Perulangan WHILE
        String ulang = "y";

        while (ulang.equals("y")) {
            System.out.print("Masukkan nama lagi: ");
            String nama = input.nextLine();
            System.out.println("Hai " + nama);

            System.out.print("Ulang lagi? (y/t): ");
            ulang = input.nextLine().toLowerCase();
        }

        System.out.println("Program selesai!");
        input.close();
    }
}