package Minggu5;

import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc22 = new Scanner(System.in);
        System.out.println("--------------");
        System.out.println("Masukkan jumlah elemen yang dihitung: ");
        int elemen = sc22.nextInt();

        Pangkat[] png = new Pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            png[i] = new Pangkat();
            System.out.println("Masukkan nilai yang akan dipangakt: ");
            int nilai = sc22.nextInt();
            System.out.println("Masukkan nialai pemangkat: ");
            int pangkat = sc22.nextInt();
            png[i].nilai = nilai;
            png[i].pangkat = pangkat;
        }

        System.out.println("HASIL PANGAKT - BRUTE FORCE");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah "
                    + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }

        System.out.println("HASIL PANGAKT - DIVIDE CONQUER");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah "
                    + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }
    }
}
