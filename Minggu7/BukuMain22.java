package Minggu7;

import java.util.Scanner;

public class BukuMain22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku22 data = new PencarianBuku22();
        int jmlBuku = 5;

        System.out.println("--------------------------------------------");
        System.out.println("Mauskkan data buku secara urut dari kodebuku terkecil:");
        for (int i = 0; i < jmlBuku; i++) {
            System.out.println("----------------------");
            System.out.print("Kode buku: ");
            int kodeBuku = s.nextInt();
            System.out.print("Judul buku: ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun terbit: ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang: ");
            String pengarang = s1.nextLine();
            System.out.print("Stok: ");
            int stok = s.nextInt();

            Buku22 m = new Buku22(kodeBuku, judulBuku, tahunTerbit, pengarang, stok);
            data.tambah(m);
        }
        System.out.println("-----------------------------------------------------");
        System.out.println("Data keseluruhan mahasiswa: ");
        data.tampil();

        System.out.println("_____________________________________________________");
        System.out.println("_____________________________________________________");
        System.out.println("Pencarian data: ");
        System.out.println("Masukkan kode buku yang dicari: ");
        System.out.print("Kode buku: ");
        int cari = s.nextInt();
        System.out.println("Menggunakan sequential search");
        int posisi = data.findSeqSearch(cari);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);

        Buku22 dataBuku22 = data.FindBuku(cari);
        dataBuku22.tampilDataBuku();
    }
}
