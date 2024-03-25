package Minggu5;

import java.util.Scanner;

public class mainFaktorial {
    public static void main(String[] args) {
        Scanner sc22 = new Scanner(System.in);
        System.out.println("----------------------");
        System.out.println("Masukkan jumlah elemen:");
        int iJml = sc22.nextInt();

        Faktorial[] fk = new Faktorial[iJml];
        for (int i = 0; i < iJml; i++) {
            fk[i] = new Faktorial();
            System.out.println("Masukkan nilai data ke-" + (i + 1) + ":");
            int iNilai = sc22.nextInt();
            fk[i].nilai=iNilai;
        }

        System.out.println("HASIL - BRUTE FORCE");
        for (int i = 0; i < iJml; i++) {
            System.out.println(
                    "Hasil penghitungan faktorial menggunakan Brute Force adalah " + fk[i].faktorialBF(fk[i].nilai));
        }

        System.out.println("HASIL - DIVIDE CONQUER");
        for (int i = 0; i < iJml; i++) {
            System.out.println(
                    "Hasil penghitungan faktorial menggunakan Divide Conquer adalah " + fk[i].faktorialDC(fk[i].nilai));
        }
    }
}
