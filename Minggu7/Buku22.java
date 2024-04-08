package Minggu7;

public class Buku22 {
    int kodeBuku, tahunTerbit, stok;
    String judulBuku, pengarang;

    Buku22(int kodeBuku, String judul, int tahunTerbit, String pengarang, int stok){
        this.kodeBuku = kodeBuku;
        this.judulBuku = judul;
        this.tahunTerbit = tahunTerbit;
        this.pengarang = pengarang;
        this.stok = stok;
    }

    void tampilDataBuku(){
        System.out.println("=================");
        System.out.println("Kode buku: "+kodeBuku);
        System.out.println("Judul buku: "+judulBuku);
        System.out.println("Tahun terbit: "+tahunTerbit);
        System.out.println("Pengarang: "+pengarang);
        System.out.println("Stok: "+stok);
    }
}
