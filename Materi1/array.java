package Materi1;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nama = new String[3];
        for (int i=0;i<(nama.length+1);i++) {
            nama[i] = sc.nextLine();}

        for (String data:nama){
            System.out.println(data);
        }
        sc.close();
    }
}
