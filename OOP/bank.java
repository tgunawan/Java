package OOP;
// Encapsulation
class RekeningBank{
    private double saldo;

    public RekeningBank(double saldoAwal){
        this.saldo = saldoAwal;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setorUang(double jumlah){
        if (jumlah>100){
            this.saldo+=jumlah;
            System.out.println("Setor berhasil di lakukan. Saldo saat ini adalah: Rp "+this.saldo);
        }else{
            System.out.println("Jumlah harus di atas Rp 100");
        }
    }

}

public class bank {
    public static void main(String[] args) {
        RekeningBank tabungan = new RekeningBank(2000000);
        // tabungan.saldo +=2000;


    }
}
