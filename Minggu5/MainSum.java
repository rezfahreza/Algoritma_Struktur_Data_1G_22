package Minggu5;

import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner sc22 = new Scanner(System.in);
        System.out.println("=======================================================");
        System.out.println("Program menghitung keuntungan total (satuan juta, misal 5.9)");
        System.out.print("Masukkan jumlah bulan: ");
        int elm = sc22.nextInt();
        sum sm = new sum(elm);
        System.out.println("========================================================");
        for (int i = 0; i < sm.elemen; i++) {
            System.out.print("masukkan untung bulan ke-" + (i + 1) + " = ");
            sm.keuntunngan[i] = sc22.nextDouble();
        }

        System.out.println("========================================================");
        System.out.println("Algoritma Brute Force");
        System.out.println(
                "Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = " + sm.totalBF(sm.keuntunngan));
        System.out.println("========================================================");
        System.out.println("Algoritma Divide Conquer");
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = "
                + sm.totalDC(sm.keuntunngan, 0, sm.elemen - 1));
    }
}
