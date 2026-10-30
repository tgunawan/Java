package Materi1;

public class mobil {
    static final int tahunBuat=2001; // tidak bisa di ubah
    static String jenis="City car"; // milik class
    public static void main(String[] args) {
        kendaraan m1 = new kendaraan("Toyota", 2021, 100.20f, 123.23);

        m1.setKecepatan(200.5f);
        m1.tampilkanInfo();
        m1.nyalakanMesin();
        // System.out.println(m1.harga);
    }
}
