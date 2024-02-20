package P1;

import java.util.Scanner;

public class percobaan3_22 {
    public static void main(String[] args) {
        String[] subjects = { "Pancasila",
                "Konsep Teknologi Informasi",
                "Critical Thinking and Problem Solving",
                "Matematika Dasar",
                "Bahasa Inggris",
                "Dasar Pemrograman",
                "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja" };

        double[] nilaiAngka = new double[subjects.length];
        int totalSks = 0;
        double totalBobot = 0;

        Scanner sc22 = new Scanner(System.in);

        System.out.println("PROGRAM MENGHITUNG IP SEMESTER");
        System.out.println("=============================");

        System.out.print("Masukkan jumlah SKS: ");
        int sks = sc22.nextInt();

        for (int i = 0; i < subjects.length && i < sks; i++) {

            System.out.print("Masukkan nilai Angka untuk MK " + subjects[i] + " : ");
            double nilai = sc22.nextDouble();
            if (nilai >= 0 && nilai <= 100) {
                double bobot = 0;
                if (nilai >= 80) {
                    bobot = 4.0;
                } else if (nilai >= 75) {
                    bobot = 3.75;
                } else if (nilai >= 70) {
                    bobot = 3.50;
                } else if (nilai >= 65) {
                    bobot = 3.00;
                } else if (nilai >= 60) {
                    bobot = 2.50;
                } else if (nilai >= 55) {
                    bobot = 2.00;
                } else if (nilai >= 50) {
                    bobot = 1.00;
                }
                nilaiAngka[i] = bobot;
                totalBobot += bobot;
                totalSks++;
            } else {
                System.out.println("Nilai harus di antara 0 - 100");
                return;
            }
        }
        System.out.printf("%n%nHASIL KONVERSI NILAI%n");
        System.out.printf("=======================%n");
        System.out.printf("%-40s%10s%15s%15s%n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.println("--------------------------------------------------------------------------------");

        for (int i = 0; i < totalSks; i++) {
            System.out.printf("%-40s%10s%15s%15s%n", subjects[i], nilaiAngka[i], convertToNilaiHuruf(nilaiAngka[i]),
                    nilaiAngka[i] * 3);
        }
        System.out.printf("%nIP SEMESTER : %.2f%n", totalBobot / totalSks);
    }

    private static String convertToNilaiHuruf(double nilaiSetara) {
        if (nilaiSetara >= 3.75) {
            return "A";
        } else if (nilaiSetara >= 3.50) {
            return "B+";
        } else if (nilaiSetara >= 3.00) {
            return "B";
        } else if (nilaiSetara >= 2.50) {
            return "C";
        } else {
            return "D";
        }
    }
}
