package P9_Praktikum2;

import java.util.Scanner;

public class QueueMain {
    public static void main(String[] args) {
        Scanner sc22 = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc22.nextInt();
        Queue antri = new Queue(jumlah);
        int pilih;

        do {
            menu();
            pilih = sc22.nextInt();
            switch (pilih) {
                case 1:
                    sc22.nextLine();
                    System.out.print("No rekening: ");
                    String norek = sc22.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc22.nextLine();
                    System.out.print("Alamat: ");
                    String alamat = sc22.nextLine();
                    System.out.print("Umur: ");
                    int umur = sc22.nextInt();
                    System.out.print("Saldo: ");
                    double saldo = sc22.nextDouble();
                    Nasabah nb = new Nasabah(norek, nama, alamat, umur, saldo);
                    antri.Enqueue(nb);
                    break;
                case 2:
                    Nasabah data = antri.Dequeue();
                    if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0
                            && data.saldo != 0) {
                        System.out.println("Antrian yang keluar " + data.norek + " " + data.nama + " " + data.alamat
                                + " " + data.umur + " " + data.saldo);
                    }
                    break;
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                case 5:
                    antri.peekRear();
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }

    public static void menu() {
        System.out.println("Pilih menu:");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua antrian");
        System.out.println("5. Cek antrian paling belakang");
        System.out.println("-----------------------------------------------");
    }
}