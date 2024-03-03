package Jobsheet3_Tugas1;

public class Kerucut {
    public double jarijari;
    public double miring;

    public Kerucut(double j, double m){
        jarijari=j;
        miring=m;
    }
    
    public double hitungLuasPemukaan(){
        return Math.PI*jarijari*(jarijari+miring);
    }
    public double hitungVolume(){
        return (1.0/3.0)*Math.PI*jarijari*miring;
    }
}
