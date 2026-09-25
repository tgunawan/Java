# Materi 1

- pembuatan dan fungsi class
    nama class dalam file, harus sama dengan nama file
- variable tidak boleh ada yang double dalam 1 class
- System.out.println lebih baik dalam kompabilitas dari pada IO.println
- jika pakai System input pakai Scanner dan harus di close
## input output
pakai Scanner untuk menerima output dari user, ini masih lebih version friendly karena masih bisa compability dengan versi sebelumnya

import java.util.Scanner;// import library di awal

Scanner input = new Scanner(System.in); // set object input di awal "main" method atau method yang ingin pakai input

System.out.print("Masukkan nama 2 :");
String name =  input.nextLine(); //pakai input untuk masukkan variable
System.out.println("Nama kamu " + name); // panggil variable
input.close(); // wajib di close agar tidak wasting resource


## tipe data
        int umur = 21;
        double jarak = 3.4;
        char karakter = 'f';
        boolean benar = true;

        //non Primitive
        float berat = 23.3f;
        String hewan = "Kambing";

## operator
### aritmatika
    - +,-,*,/,%
### relasi
    - >=,<=,==,!=,<,>
### logika
    - &&, || , !
### Penugasan
    - +=,-=,*=,
### increment / decrement
    - x++ / y--
### ternary
    - ?
    - kondisi ? true : false

## Control flow
### Conditional
    if (kondisi){
        block code;
    }else{

    }
### Loop
    for (int i=1; i>5;i++){
        block codeiterasi pengulangan;
    }

## Latihan materi 1
- buat biodata tanpa input pakai variable dan display
- buat biodata dengan input
- buat login form dengan kondisi dan loop

'## 'update error karena ada update extension yang mengubah package cara compile berubah sedikit
| dari Main folder Java
|javac -d . .\Materi1\biodata1.java  | jadi pakai fitur d(directori)
|java -cp . Materi1.biodata1         | panggil pakai nama package nya

| jika tidak ingin berubah hapus package pada baris 1
| tetap di folder materi
| javac .\biodata1.java             | langsung compile di folder tersebut
| java -cp . biodata1               | hanya panggil class langsung dari folder tersebut
'

## Array
- menyimpan data dengan tipe yang sama

- String[] buah = {"Apel","Banana","Ceri","DragonFruit"};
- for (String b : buah){System.out.println(b);}
- list menu, tampilan list pilihan,...

## Method
- membantu agar kode lebih modular dan mudah di manage / di debug

public class biodata1 {
    
    static  void sapa(String nama){
        System.out.print("Hallo "+nama);
    }
    
    public static void main(String[] args) {
            System.out.println("Hallo dari intro java"); // buat baris baru
            sapa("Jojo");
    }
}
