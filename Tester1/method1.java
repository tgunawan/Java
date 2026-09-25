import java.util.Scanner;

public class method1 {
    static String cekLulus(int nilai){
        if (nilai>=80){
            return "Lulus";
        } else{
            return "Gagal";
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai=input.nextInt();
        System.out.println("Siswa ini "+ cekLulus(nilai));
        input.close();
    }
}
