package Materi1;

import java.util.InputMismatchException;
import java.util.Scanner;


public class trycatch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int hasil=0;
        try{
            int hasil2=10/0;
            System.out.println("hasil");
        } catch (ArithmeticException e){
            System.out.println("Terjadi kesalahan "+ e.getMessage());
        }

        try{
            System.out.println(hasil);
        } catch (NullPointerException e){
            System.out.println("Terjadi kesalahan "+ e.getMessage());
        }
        // catch (Exception e){
        //     System.out.println(e);
        // }

        try{
        int nilai = Integer.parseInt("123");
        System.out.println(nilai);}
        catch(NumberFormatException e){
            System.out.println("Tidak dapat di ubah jadi angka");
        }

        try{
            int angka = input.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Salah input "+e.getMessage() );
        }
        input.close();
    }
}