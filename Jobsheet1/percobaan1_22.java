package P1;

import java.util.Scanner;

public class percobaan1_22 {
    public static void main(String[] args) {
        Scanner sc22 = new Scanner(System.in);

        double NTugas, Nkuis, NUts, NUas, Total = 0;
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("Masukkan Nilai Tugas: ");
        NTugas = sc22.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        Nkuis = sc22.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        NUts = sc22.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        NUas = sc22.nextDouble();
        System.out.println("==============================");

        if (NTugas >= 0 && NTugas <= 100) {
            if (Nkuis >= 0 && Nkuis <= 100) {
                if (NUts >= 0 && NUts <= 100) {
                    if (NUas >= 0 && NUas <= 100) {
                        Total = (NTugas * 0.2) + (Nkuis * 0.2) + (NUts * 0.3) + (NUas * 0.3);
                        System.out.println("Nilai AKhir :"+Total);
                        if (Total > 80 && Total <= 100) {
                            System.out.println("Nilai Huruf : A");
                            System.out.println("Selamat Anda Lulus");
                        } else if (Total > 73 && Total <= 80) {
                            System.out.println("Nilai Huruf : B+");
                            System.out.println("Selamat Anda Lulus");
                        } else if (Total > 65 && Total <= 73) {
                            System.out.println("Nilai Huruf : B");
                            System.out.println("Selamat Anda Lulus");
                        } else if (Total > 60 && Total <= 65) {
                            System.out.println("Nilai Huruf : C+");
                            System.out.println("Selamat Anda Lulus");
                        } else if (Total > 50 && Total <= 60) {
                            System.out.println("Nilai Huruf : C");
                            System.out.println("Selamat Anda Lulus");
                        } else if (Total > 39 && Total <= 50) {
                            System.out.println("Nilai Huruf : D");
                            System.out.println("Anda Tidak Lulus");
                        } else if (Total <= 39) {
                            System.out.println("Nilai Huruf : E");
                            System.out.println("Anda Tidak Lulus");
                        }
                        System.out.println("==============================");
                    } else {
                        System.out.println("nilai tidak valid");
                    }
                } else {
                    System.out.println("nilai tidak valid");
                }
            } else {
                System.out.println("nilai tidak valid");
            }
        } else {
            System.out.println("nilai tidak valid");
        }
    }
}