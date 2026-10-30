package OOP;
// abstract, polimorph
abstract class Kendaraan{ //parent / ancestor abstract class
    abstract void tekanGas(); // method yang wajib ada di child abstract class

}

class Mobil extends Kendaraan{

    @Override 
    void tekanGas(){ 
        System.out.println("Mobil jalan kencang");
        }
}

class sepedaListrik extends Kendaraan{

    @Override 
    void tekanGas(){ 
        System.out.println("Sepeda jalan pelan");
        }
}


public class abstractMobil {

    static void jalan(Kendaraan kendaraan){ 
        kendaraan.tekanGas(); 
    }
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil();
        Kendaraan selis = new sepedaListrik();

        mobil.tekanGas();
        selis.tekanGas();
        jalan(mobil);
        jalan(selis);
    }
}
