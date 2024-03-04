package Jobsheet3_Tugas2;

public class InformasiMahasiswa {
    public String nama;
    public String nim;
    public String jenisKelamin;
    public double ipk;

    public InformasiMahasiswa(String nama, String nim, String jenisKelamin, Double ipk){
        this.nama=nama;
        this.nim=nim;
        this.jenisKelamin=jenisKelamin;
        this.ipk=ipk;
    }

    public static double hitungRatarata(InformasiMahasiswa[] informasiArray){
        double totalIpk=0;
        for (InformasiMahasiswa Mahasiswa : informasiArray) {
            totalIpk+=Mahasiswa.ipk;
        }
        return totalIpk/informasiArray.length;
    }

    public static InformasiMahasiswa cariIpkTerbesar(InformasiMahasiswa[] informasiArray){
        InformasiMahasiswa terbesar=informasiArray[0];
        for (InformasiMahasiswa Mahasiswa : informasiArray) {
            if (Mahasiswa.ipk>terbesar.ipk) {
                terbesar=Mahasiswa;
            }
        }
        return terbesar;
    }
}
