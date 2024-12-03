public class Soal2 {
    public static void main(String[] args) {
        int n = 20; // Batas atas sigma
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += Math.pow(i - 1, 2); // Menghitung (i - 1)^2
        }

        System.out.println("Hasil Soal 2 (Σ (i - 1)^2 dari 0 hingga 20): " + sum);
    }
}