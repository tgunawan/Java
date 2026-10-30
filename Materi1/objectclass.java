package Materi1;

public class objectclass {
    public static void bersuara(animal hewan){
        hewan.suara();
    }//polimorph
    public static void main(String[] args) {
    cat kucing=new cat();
    kucing.makan();
    kucing.suara();
    anjing A=new anjing();
    A.suara();
    A.makan();
    
    bersuara(A);
    bersuara(kucing);

    }
}
