package Minggu6;

public class HotelService {
    Hotel[] rooms;
    int jmlKmr;

    HotelService(int n){
        rooms = new Hotel[n];
        jmlKmr = 0;
    }

    void tambah(Hotel h){
        if (jmlKmr < rooms.length) {
            rooms[jmlKmr] = h;
            jmlKmr++;
        } else {
            System.out.println("Kamar penuh");
        }
    }

    void tampil(){
        for (int i = 0; i < rooms.length; i++) {
            System.out.println("Namahotel: "+rooms[i].nama);
            System.out.println("Kota: "+rooms[i].kota);
            System.out.println("Harga: "+rooms[i].harga);
            System.out.println("Bintang: "+rooms[i].bintang);
        }
    }

    void bubbleSortAscHarga(){
        for (int i = 0; i < rooms.length-1; i++) {
            for (int j = 1; j < rooms.length-i; j++) {
                if (rooms[j].harga < rooms[j-1].harga) {
                    Hotel temp = rooms[j];
                    rooms[j] = rooms[j-1];
                    rooms[j-1] = temp;
                }
            }
        }
    }

    void selectionSortAscHarga(){
        for (int i = 0; i < rooms.length-1; i++) {
            int idxMin = i;
            for (int j = i+1; j < rooms.length; j++) {
                if (rooms[idxMin].harga > rooms[j].harga) {
                    idxMin = j;
                }
            }
            Hotel temp = rooms[idxMin];
            rooms[idxMin] = rooms[i];
            rooms[i] = temp;
        }
    }

    void bubbleSortDescBintang(){
        for (int i = 0; i < rooms.length-1; i++) {
            for (int j = 1; j < rooms.length-i; j++) {
                if (rooms[j].bintang > rooms[j-1].bintang) {
                    Hotel temp = rooms[j];
                    rooms[j] = rooms[j-1];
                    rooms[j-1] = temp;
                }
            }
        }
    }

    void selectionSortDescBintang(){
        for (int i = 0; i < rooms.length-1; i++) {
            int idxMax = i;
            for (int j = i+1; j < rooms.length; j++) {
                if (rooms[idxMax].bintang < rooms[j].bintang) {
                    idxMax = j;
                }
            }
            Hotel temp = rooms[idxMax];
            rooms[idxMax] = rooms[i];
            rooms[i] = temp;
        }
    }
}
