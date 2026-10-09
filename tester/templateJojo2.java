import java.util.Scanner;

public class templateJojo2 {
    public static void main(String[] args) {
        // Scanner dibuat hanya sekali, di luar loop tak terbatas
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("======================");
            // Data hewan
            String anim[][] = {
                {"Dog", "Four legs", "Bark"},
                {"Cat", "Four legs", "Meow"},
                {"Bird", "Two legs", "Chirp"}
            };

            // Tampilkan pilihan hewan (1‑3)
            for (int i = 0; i < 3; i++) {
                System.out.println((i + 1) + ". " + anim[i][0]);
            }
            System.out.println("======================");
            System.out.println("1. Pelajari tentang hewan");
            System.out.println("2. Eksterminasi hewan dari planet");
            System.out.println("3. Keluar");
            System.out.print("Apa yang ingin Anda lakukan? ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Hewan mana yang ingin Anda pelajari?");
                    int optsi = input.nextInt();

                    // Validasi input pengguna (berbasis 1, harus 1‑3)
                    if (optsi < 1 || optsi > anim.length) {
                        System.out.println("Opsi tidak tersedia");
                        break;
                    }

                    // Cetak detail hewan – kurangi 1 karena array berbasis 0
                    System.out.println(anim[optsi - 1][0]);
                    System.out.println(anim[optsi - 1][1]);
                    System.out.println(anim[optsi - 1][2]);
                    break;

                case 2:
                    System.out.println("Hewan mana yang ingin Anda eksterminasi dari pesawat?");
                    // Tambahkan logika eksterminasi di sini jika diperlukan
                    break;

                case 3:
                    System.out.println("Noooo we will miss you!");
                    // Keluar dari program dengan bersih
                    input.close();
                    return; // atau: break; (jika Anda lebih suka loop while)
                default:
                    System.out.println("Opsi tidak tersedia");
            }

            System.out.println("======================");
            // Tidak ada pembacaan ekstra – loop akan mulai lagi dari awal
        }
        // Ini tidak akan tercapai jika Anda memilih case 3 karena return(),
        // tetapi dipertahankan untuk kejelasan.
    }
}