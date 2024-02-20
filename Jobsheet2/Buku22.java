public class Buku22 {
    String judul, pengarang;
    int halaman, stok, harga, terjual;

    public Buku22(){
        
    }

    public Buku22(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp" + harga);
        System.out.println("Harga Buku: "+hitungHargaTotal());
        System.out.println("Diskon: "+hitungDiskon());
        System.out.println("Total: "+hitungHargaBayar());
    }

    void terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
            terjual=jml;
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    int hitungHargaTotal(){
        int harTot = terjual*harga;
        return harTot;
    }

    double hitungDiskon(){
        if (hitungHargaTotal() > 150000) {
            double diskon = hitungHargaTotal()*0.12;
            return diskon;
        } else if ((hitungHargaTotal() > 75000)&&(hitungHargaTotal() <= 150000)) {
            double diskon = hitungHargaTotal()*0.05;
            return diskon;
        } else {
            double diskon = hitungHargaTotal() * 0;
            return diskon;
        }
    }

    double hitungHargaBayar(){
        double hargaBayar = hitungHargaTotal() - hitungDiskon();
        int hargaInt = (int)hargaBayar;
        return hargaInt;
    }
}