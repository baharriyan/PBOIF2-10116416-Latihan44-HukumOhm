package pboif2.pkg10116416.latihan44.hukumohm;
/**
 * @author
 * Nama  : RIYAN BAHAR
 * Kelas : PBOIF2
 * NIM   : 10116416
 * Deskripsi Program : Program menghitung hasil tegangan
*/
import java.util.Scanner;
import Listrik.Baterai;

public class PBOIF210116416Latihan44HukumOhm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Baterai baterai = new Baterai();
        baterai.Baterai();
        baterai.Baterai(3,12);
        
        System.out.printf("Kuat Arus : %.1f ampere\n",baterai.getKuatArus());
        System.out.printf("Hambatan : %.1f ohm \n",baterai.getHambatan());
        System.out.printf("Hasil Tegangan : %.1f volt\n",baterai.hitungTegangan());
    }
    
}
