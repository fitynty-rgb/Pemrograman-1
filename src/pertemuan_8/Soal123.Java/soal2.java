public class soal2 {
    public static void main(String[] args) {
        int total = 0;

        for (int i = 1; i <= 5; i++) {
            int nilai = 70 + i; // contoh nilai
            System.out.println("Nilai ke-" + i + " = " + nilai);
            total += nilai;
        }

        System.out.println("Total nilai = " + total);
    }
}