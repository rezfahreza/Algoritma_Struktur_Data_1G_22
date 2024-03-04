package Jobsheet3_Tugas2;
import java.util.Scanner;

public class InformasiMahasiswaMain {
    public static void main(String[] args) {
        Scanner sc22=new Scanner(System.in);
        InformasiMahasiswa[] informasiArray=new InformasiMahasiswa[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data mahasiswa ke-"+(i+1)+": ");
            System.out.print("Masukkan nama: ");
            String nm=sc22.next();
            System.out.print("Masukkan nim: ");
            String nim=sc22.next();
            System.out.print("Masukkan jenis kelamin: ");
            String jk=sc22.next();
            System.out.print("Masukkan ipk: ");
            double ipk=sc22.nextDouble();
            informasiArray[i]=new InformasiMahasiswa(nm, nim, jk, ipk);
        }
        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.println("Informasi mahasiswa ke-"+(i+1)+": ");
            System.out.println("Nama: "+informasiArray[i].nama);
            System.out.println("NIM: "+informasiArray[i].nim);
            System.out.println("Jenis kelamin: "+informasiArray[i].jenisKelamin);
            System.out.println("IPK: "+informasiArray[i].ipk);
        }

        double rataRataIpk=InformasiMahasiswa.hitungRatarata(informasiArray);
        System.out.println("Rata-rata IPK: "+rataRataIpk);

        InformasiMahasiswa mhs=InformasiMahasiswa.cariIpkTerbesar(informasiArray);
        System.out.println("IPk terbesar: "+mhs.ipk);
    }
}
