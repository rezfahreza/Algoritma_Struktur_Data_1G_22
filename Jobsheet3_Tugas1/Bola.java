package Jobsheet3_Tugas1;

public class Bola {
    public double jarijari;

    public Bola(double j){
        jarijari=j;
    }

    public double hitungLuasPermukaan(){
        return 4*Math.PI*jarijari*jarijari*jarijari;
    }
    public double hitungVolume(){
        return (4.0/3.0)*Math.PI*jarijari*jarijari*jarijari;
    }
}
