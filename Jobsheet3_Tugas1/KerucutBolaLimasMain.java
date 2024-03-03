package Jobsheet3_Tugas1;
import java.util.Scanner;

public class KerucutBolaLimasMain {
    public static void main(String[] args) {
        Scanner sc22 = new Scanner(System.in);
        Kerucut[] krArray = new Kerucut[2];
        LimasSegiEmpatSamaSisi[] lmArray = new LimasSegiEmpatSamaSisi[2];
        Bola[] blArray = new Bola[2];

        for (int i = 0; i < 2; i++) {
            System.out.println("Masukkan jari-jari kerucut: ");
            double jarijarikerucut = sc22.nextDouble();
            System.out.println("Masukkan sisi miring kerucut: ");
            double sisiMiring = sc22.nextDouble();
            krArray[i] = new Kerucut(jarijarikerucut, sisiMiring);
        }
        
        for (int i = 0; i < 2; i++) {
            System.out.println("Masukkan panjang alas limas: ");
            double alasLimas = sc22.nextDouble();
            System.out.println("Masukkan tinggi limas: ");
            double tinggiLimas = sc22.nextDouble();
            lmArray[i] = new LimasSegiEmpatSamaSisi(alasLimas, tinggiLimas);
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("Masukkan jari-jari bola: ");
            double jarijariBola = sc22.nextDouble();
            blArray[i] = new Bola(jarijariBola);
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("\nKerucut ke-"+i+": ");
            System.out.println("Luas permukaan: "+krArray[i].hitungLuasPemukaan());
            System.out.println("volume: "+krArray[i].hitungVolume());
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("\nLimas segi empat sama sisi ke-"+i+": ");
            System.out.println("Luas permukaan: "+lmArray[i].hitungLuasPermukaan());
            System.out.println("volume: "+lmArray[i].hitungVolume());
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("\nBola ke-"+i+": ");
            System.out.println("Luas permukaan: "+blArray[i].hitungLuasPermukaan());
            System.out.println("volume: "+blArray[i].hitungVolume());
        }
    }
}