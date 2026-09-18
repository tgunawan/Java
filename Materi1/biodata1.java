package Materi1;

public class biodata1 {
    public static void main(String[] args) {
        IO.println("Jumlah argumen: " + args.length);

        for (int i = 0; i < args.length; i++) {
            IO.println("Argumen " + i + ": " + args[i]);
        }
    }
}
