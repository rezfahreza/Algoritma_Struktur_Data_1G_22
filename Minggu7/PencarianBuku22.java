package Minggu7;

public class PencarianBuku22 {
    Buku22[] listBk = new Buku22[5];
    int idx;

    void tambah(Buku22 m){
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++; 
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil(){
        for (Buku22 m : listBk) {
            m.tampilDataBuku();
        }
    }

    public int findSeqSearch(int cari){
        int posisi = 0;
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].kodeBuku == cari) {
                posisi = i;
                break;
            } else {
                posisi = -1;
            }
        }
        return posisi;  
    }

    void tampilPosisi(int x, int pos){
        if (pos != -1) {
            System.out.println("Data: "+x+"ditemukan pada indeks "+pos);
        } else {
            System.out.println("Data: "+x+"tidak ditemukan");
        }
    }

    void tampilData(int x, int pos){
        if (pos != -1) {
            System.out.println("Kode buku: "+x);
            System.out.println("Judul: "+listBk[pos].judulBuku);
            System.out.println("Tahun baru: "+listBk[pos].tahunTerbit);
            System.out.println("Pengarang: "+listBk[pos].pengarang);
            System.out.println("Stok: "+listBk[pos].stok);
        } else {
            System.out.println("Data "+x+" tidak ditemukan");
        }
    }

    public Buku22 FindBuku(int cari){
        Buku22 buku = null;
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].kodeBuku == cari) {
                buku = listBk[i];
                break;
            }
        }
        return buku;
    }

    public int FindBinarySearch(int cari, int left, int right){
        if (right >= left) {
            int mid = left + (right-left) / 2;
            if (listBk[mid].kodeBuku == cari) {
                return mid;
            } else if (listBk[mid].kodeBuku < cari) {
                return FindBinarySearch(cari, left, mid-1);
            } else {
                return FindBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }
}
