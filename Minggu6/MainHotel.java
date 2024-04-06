package Minggu6;

public class MainHotel {
    public static void main(String[] args) {
        HotelService hotelService = new HotelService(5);

        hotelService.tambah(new Hotel("ABC", "SBY", 150000, (byte) 1));
        hotelService.tambah(new Hotel("DEF", "SBY", 100000, (byte) 3));
        hotelService.tambah(new Hotel("GHI", "SBY", 200000, (byte) 2));
        hotelService.tambah(new Hotel("JKL", "SBY", 250000, (byte) 4));
        hotelService.tambah(new Hotel("MNO", "SBY", 300000, (byte) 5));

        System.out.println("=====================================================");
        System.out.println("Daftar hotel sebelum disorting: ");
        hotelService.tampil();
        
        System.out.println("=====================================================");
        System.out.println("Daftar hotel setelah disorting asc berdasarkan harga: ");
        System.out.println("-Bubble sort");
        hotelService.bubbleSortAscHarga();
        hotelService.tampil();
        System.out.println("-----------------------------------------------------");
        System.out.println("-Selection sort");
        hotelService.selectionSortAscHarga();
        hotelService.tampil();

        System.out.println("========================================================");
        System.out.println("Daftar hotel setelah disorting desc berdasarkan bintang: ");
        System.out.println("-Bubble sort");
        hotelService.bubbleSortDescBintang();
        hotelService.tampil();
        System.out.println("-----------------------------------------------------");
        System.out.println("-Selection sort");
        hotelService.selectionSortDescBintang();
        hotelService.tampil();
    }
}
