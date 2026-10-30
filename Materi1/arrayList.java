package Materi1;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> nama= new ArrayList<>();
        ArrayList<Integer> angka= new ArrayList<>();

        nama.add("Adi");
        nama.add("Budi");
        nama.set(1,"Boleh");
        nama.remove(0);


        System.out.println(nama);
        System.out.println(nama.get(0));
        // System.out.println(nama[1]);
    }
}

// public Potions(ArrayList<Integer> angka,ArrayList<String> nama){
//  this.angka = angka;
//  this.nama = nama;
// }