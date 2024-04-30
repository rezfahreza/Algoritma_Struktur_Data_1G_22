package JobsheetP8;

public class Gudang22 {
    Barang22[] tumpukan;
    int size;
    int top;

    public Gudang22(int kapasitas){
        size = kapasitas;
        tumpukan = new Barang22[size];
        top = -1;
    }

    public boolean cekkosong(){
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekpenuh(){
        if (top == size-1) {
            return true;
        } else {
            return false;
        }
    }

    void tambahBarang(Barang22 brg){
        if (!cekpenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang "+brg.nama+" berhasil ditambahkan ke gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di gudang sudah penuh");
        } 
    }

    public Barang22 ambilBarang(){
        if (!cekkosong()) {
            Barang22 delete = tumpukan[top];
            top--;
            System.out.println("Barang "+delete.nama+" diambil dari gudang");
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public Barang22 lihatBarangTeratas(){
        if (!cekkosong()) {
            Barang22 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas "+barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    void tampilkanBarang(){
        if (!cekkosong()) {
            System.out.println("Rincian tumpukan barang di gudang:");
            for (int i = 0; i <= top; i++) {
                System.out.printf("Kode %d: %s (kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong");
        }
    }
}