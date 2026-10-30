package Materi1;

public class kendaraan {
    private String merk;
    private int tahun;
    private float kecepatan;
    private double harga;

    public kendaraan(String merk, int tahun, float kecepatan, double harga) {
        this.merk = merk;
        this.tahun = tahun;
        this.kecepatan = kecepatan;
        this.harga = harga;
    }

    public void setKecepatan(float update) {
        this.kecepatan = update;
    }

    public void nyalakanMesin() {
        System.out.println("Mesin " + merk + " menyala");
    }

    public void tampilkanInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Tahun: " + tahun);
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
        System.out.println("Harga: " + harga);
    }
}
