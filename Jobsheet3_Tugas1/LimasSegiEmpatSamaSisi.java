package Jobsheet3_Tugas1;

public class LimasSegiEmpatSamaSisi {
    public double alas;
    public double tinggi;

    public LimasSegiEmpatSamaSisi(double a, double t){
        alas=a;
        tinggi=t;
    }

    public double hitungLuasPermukaan(){
        return alas*alas+4*(alas*tinggi/2);
    }
    public double hitungVolume(){
        return (1.0/3.0)*alas*alas*tinggi;
    }
}
