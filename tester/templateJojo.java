import java.util.Scanner;

public class templateJojo {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a 6 letter word: ");
        String word = input.nextLine();

        String[] kata = {"Apelan", "Sepeda", "Sepatu", "kamera"};
        String target = kata[1].toLowerCase(); // "sepeda"
        String guess = word.toLowerCase();

        if (word.length() != 6) {
            System.out.println("Please enter a 6 letter word.");
            input.close();
            return;
        }

        // Loop untuk mengecek setiap huruf
        for (int i = 0; i < 6; i++) {
            char currentChar = word.charAt(i);
            char currentGuessChar = guess.charAt(i);

            // Cek apakah huruf ada di dalam kata target
            if (target.contains(String.valueOf(currentGuessChar))) {
                
                // Cek apakah posisinya TEPAT SAMA
                if (currentGuessChar == target.charAt(i)) {
                    System.out.print(ANSI_GREEN + currentChar + ANSI_RESET);
                } else {
                    // Ada hurufnya tapi beda posisi (opsional: bisa diberi warna kuning)
                    System.out.print(ANSI_RED + currentChar + ANSI_RESET);
                }

            } else {
                // Huruf tidak ada sama sekali
                System.out.print(ANSI_RED + currentChar + ANSI_RESET);
            }
        }

        System.out.println(); // Pindah baris di akhir output
        input.close(); // Ditutup setelah seluruh proses selesai
    }
}