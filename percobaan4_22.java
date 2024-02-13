package P1;

public class percobaan4_22 {
    public static void main(String[] args) {
        int[][] stokBunga = {
                { 10, 5, 15, 7 },
                { 6, 11, 9, 12 },
                { 2, 10, 10, 5 },
                { 5, 7, 12, 9 }
        };
        int[] hrgBunga = { 75000, 50000, 60000, 10000 };
        pendapatanCabang(stokBunga, hrgBunga);
        jmlBunga(stokBunga);
    }

    static void pendapatanCabang(int[][] stokBunga, int[] hrgBunga) {
        int[] pendapatan = new int[4];
        for (int i = 0; i < stokBunga.length; i++) {
            for (int j = 0; j < stokBunga[i].length; j++) {
                pendapatan[i] += stokBunga[i][j] * hrgBunga[j];
            }
        }
        for (int i = 0, j = 1; i < pendapatan.length; i++, j++) {
            System.out.println("Pendapatan cabang " + j + " : " + pendapatan[i]);
        }
        System.out.println();
    }

    static void jmlBunga(int[][] stokBunga) {
        String[] namaBunga = { "Aglonema", "Keladi", "Alocasia", "Mawar" };
        int[] bungaMati = { 1, 2, 0, 5 };
        int[] stokTerakhir = new int[4];
        for (int i = 0; i < bungaMati.length; i++) {
            stokTerakhir[i] = stokBunga[3][i] - bungaMati[i];
        }
        System.out.println("Stok Bunga Cabang 4\n" + "=========================");
        for (int i = 0; i < stokTerakhir.length; i++) {
            System.out.println("Bunga " + namaBunga[i] + " : " + stokTerakhir[i]);
        }
    }
}
