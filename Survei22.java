import java.util.Scanner;
public class Survei22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          int jumlahResponden = 10;
        int jumlahPertanyaan = 6;
        int[][] hasilSurvei = new int[jumlahResponden][jumlahPertanyaan];

        
        for (int i = 0; i < jumlahResponden; i++) {
            System.out.println("Responden ke-" + (i + 1));

            for (int j = 0; j < jumlahPertanyaan; j++) {
                int jawaban;
                do {
                    System.out.print("Jawaban pertanyaan " + (j + 1) + " (1-5): ");
                    jawaban = sc.nextInt();
                    if (jawaban < 1 || jawaban > 5) {
                        System.out.println("Jawaban harus 1 sampai 5!");
                    }
                } while (jawaban < 1 || jawaban > 5);

                hasilSurvei[i][j] = jawaban;
            }
        }

       
        System.out.println("\n=== Rata-rata setiap responden ===");
        for (int i = 0; i < jumlahResponden; i++) {
            double totalResponden = 0;

            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalResponden += hasilSurvei[i][j];
            }

            System.out.printf("Responden ke-%d: %.2f\n", (i + 1), totalResponden / jumlahPertanyaan);
        }

        
        System.out.println("\n=== Rata-rata setiap pertanyaan ===");
        for (int j = 0; j < jumlahPertanyaan; j++) {
            double totalPertanyaan = 0;

            for (int i = 0; i < jumlahResponden; i++) {
                totalPertanyaan += hasilSurvei[i][j];
            }

            System.out.printf("Pertanyaan ke-%d: %.2f\n", (j + 1), totalPertanyaan / jumlahResponden);
        }

       
        double totalSemua = 0;
        for (int i = 0; i < jumlahResponden; i++) {
            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalSemua += hasilSurvei[i][j];
            }
        }

        System.out.println("\n=== Rata-rata keseluruhan ===");
        System.out.printf("Rata-rata keseluruhan: %.2f\n", totalSemua / (jumlahResponden * jumlahPertanyaan));
    }
}

    

