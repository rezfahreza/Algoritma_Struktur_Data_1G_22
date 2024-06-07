package P15;
import java.util.Scanner;
public class GraphMain22 {
    public static void main(String[] args) throws Exception {
        Graph22 gedung = new Graph22(6);
        Scanner sc = new Scanner(System.in);
        boolean isRun = true;
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        gedung.degree(0);
        gedung.printGraph();
        gedung.removeEdge(1, 3);
        gedung.printGraph();

        while (isRun) {
            System.out.print("Masukkan gedung asal: ");
            int asal = sc.nextInt();
            System.out.print("Masukkan gedung tujuan: ");
            int tujuan = sc.nextInt();
            gedung.isConnected(asal, tujuan);
            System.out.print("Apakah anda ingin mengecek lagi? (y/n): ");
            char ulang = sc.next().charAt(0);
            if (ulang != 'y') {
                break;
            }
        }

        GraphMatriks22 gdg = new GraphMatriks22(4);
        gdg.makeEdge(0, 1, 50);
        gdg.makeEdge(1, 0, 60);
        gdg.makeEdge(1, 2, 70);
        gdg.makeEdge(2, 1, 80);
        gdg.makeEdge(2, 3, 40);
        gdg.makeEdge(3, 0, 90);
        gdg.printGraph();
        System.out.println("Hasil setelah penghapusan edge");
        gdg.removeEdge(2, 1);
        gdg.printGraph();
    }
}
