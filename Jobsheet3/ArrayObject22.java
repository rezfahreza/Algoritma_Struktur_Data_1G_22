package Jobsheet3;
import java.util.Scanner;
public class ArrayObject22 {
    public static void main(String[] args) {
        persegipanjang[] ppArray = new persegipanjang[3];
        Scanner sc22 = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            ppArray[i] = new persegipanjang();
            System.out.println("Persegi panjang ke-"+i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc22.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc22.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi panjang ke-"+i);
            System.out.println("Panjang: "+ppArray[i].panjang+", lebar: "+ppArray[i].lebar);
        }
    }
}
