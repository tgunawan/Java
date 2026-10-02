package Materi1;
import java.util.Scanner;

public class selection {

    public static String senin() {
        System.out.println("Hari Senin");
        return "Senin";
    }

    public static void main(String[] args) {
        
    
    char kodeHari='A';
    Scanner input = new Scanner(System.in);
    kodeHari = input.nextLine().toUpperCase().charAt(0);

    String namaHari = switch (kodeHari) {
                case 'A' -> {
                    yield senin();
                    // yield "Senin";
                }
                case 'B' -> "Selasa";
                case 'C' -> "Rabu";
                default -> "Hari tidak dikenal";
    };
    System.out.println("Switch hari = "+namaHari);
    input.close();
    }
}
