package JobsheetP8;
import java.util.Scanner;

public class Main22 {
    public static void main(String[] args) {
        Gudang22 gudang = new Gudang22(7);
        Scanner sc22 = new Scanner(System.in);

        boolean kondisi = true;
        while (kondisi) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. keluar");
            System.out.print("Pilih operasi: ");
            int pilihan = sc22.nextInt();
            sc22.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = sc22.nextInt();
                    System.out.print("Masukkan nama barang: ");
                    String nama = sc22.next();
                    System.out.print("Masukkan nama Kategori: ");
                    String kategori = sc22.next();
                    Barang22 barangBaru = new Barang22(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                case 4:
                    kondisi = false;
                    break;
                default:
                    System.out.println("Pilihan tida valid. Silahkan coba lagi");
            }
        }
    }
}
