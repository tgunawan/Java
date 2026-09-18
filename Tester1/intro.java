import java.util.Scanner;

public class intro { // harus sama dengan nama file
    public static void main(String[] args) { // wajib ada method main()
        

        System.out.println("Hallo dari intro java"); // buat baris baru
        System.out.print("Tanpa line, "); // tanpa baris baru
        System.out.println("Tambah line");
        IO.println("Pakai IO"); // cara singkat Java versi baru
        String nama = IO.readln("Masukkan nama: "); // IO lebih ringkas namun lebih baik pakai System.out.println untuk kokmpabilitas
        IO.println(nama);


        Scanner input = new Scanner(System.in); // set object input

        System.out.print("Masukkan nama 2 :");
        String name =  input.nextLine(); //pakai input untuk masukkan variable
        System.out.println("Nama kamu" + name); // panggil variable

        //primitive
        int umur = 21;
        double jarak = 3.4;
        char karakter = 'f';
        boolean benar = true;

        //non Primitive
        float berat = 23.3f;
        String mana= "Kambing";




    }
}
