package Minggu5;

import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner sc22 = new Scanner(System.in);
        System.out.println("=======================================================");
        System.out.println("Program menghitung keuntungan total (satuan juta, misal 5.9)");
        System.out.println("Masukkan jumlah perusahaan: ");
        int n = sc22.nextInt();
        sum[] sm = new sum[n];
        System.out.println("========================================================");
        for (int i = 0; i < sm.length; i++) {
            System.out.println("perusahaan ke-" + (i + 1));
            System.out.print("Masukkan jumlah bulan: ");
            int elm = sc22.nextInt();
            sm[i] = new sum(elm);
        }
        System.out.println("========================================================");
        for (int j = 0; j < sm.length; j++) {
            System.out.println("Perusahaan ke-"+(j+1));
            for (int k = 0; k < sm[j].elemen; k++) {
                System.out.println("Masukkan untung bulan ke-"+(k+1)+" = ");
                sm[j].keuntunngan[k] = sc22.nextDouble();
            }
        }

        System.out.println("========================================================");
        System.out.println("Algoritma Brute Force");
        for (int i = 0; i < sm.length; i++) {
            System.out.println("Total keuntungan perusahaan ke-"+(i+1)+" selama "+sm[i].elemen+" bulan adalah "+sm[i].totalBF(sm[i].keuntunngan));
        }
        System.out.println("========================================================");
        System.out.println("Algoritma Divide Conquer");
        for (int i = 0; i < sm.length; i++) {
            System.out.println("Total keuntungan perusahaan ke-"+(i+1)+" selama "+sm[i].elemen+" bulan adalah "+sm[i].totalDC(sm[i].keuntunngan, 0, sm[i].elemen-1));
        }
    }
}
