public class Soal1 {
    public static void main(String[] args) {
        int n = 10; // Batas atas sigma
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += Math.pow(i, 2); // Menghitung i^2
        }

        System.out.println("Hasil Soal 1 (Σ i^2 dari 0 hingga 10): " + sum);
    }
}